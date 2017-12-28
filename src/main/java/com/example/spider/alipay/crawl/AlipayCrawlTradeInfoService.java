package com.example.spider.alipay.crawl;

import com.example.spider.alipay.constants.TradeElement;
import com.example.spider.alipay.entity.AlipayTradeRecord;
import com.example.spider.alipay.mapper.AlipayTradeRecordMapper;
import lombok.extern.slf4j.Slf4j;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: WangNan
 * Email：nan.wang@htouhui.com
 * Date: 2017-12-27
 * Time: 下午5:28
 */
@Slf4j
@Service
public class AlipayCrawlTradeInfoService implements TradeElement {

    @Autowired
    private AlipayTradeRecordMapper alipayTradeRecordMapper;

    /**
     * 抓取交易记录信息
     */
    public WebDriver crawlTradeRecordInfo(WebDriver webDriver) throws InterruptedException {
        webDriver.navigate().to(TRADE_URL);

        WebElement nextPage = null;
        int count = 0;
        do {
            // 点击跳转下一页
            if (nextPage != null) {
                nextPage.click();
            }

            // 抓取数据
            try {
                count = crawl(webDriver, count);
            } catch (Exception e) {
                if (count == 0) {
                    webDriver.navigate().to(HOME_URL);
                    webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    crawl(webDriver, count);
                }
                break;
            }

            // 抓取数量大于30时,停止抓取
            if (count > 30) {
                break;
            }

            // 获取跳转到下一页的链接地址
            Thread.sleep(2000);
            nextPage = webDriver.findElement(By.className("page-next"));
        } while (nextPage != null && count > 0);

        return webDriver;
    }

    private int crawl1(WebDriver webDriver, int count) {
        // 获取交易记录详情
        List<WebElement> trList = webDriver.findElement(By.xpath(TRADE_TABLE_XPATH)).findElements(By.tagName("tr"));
        log.info("交易记录数量 : {}", trList.size());

        for (WebElement tr : trList) {
            AlipayTradeRecord record = AlipayTradeRecord.builder().userId(1001L).build();

            String date = tr.findElement(By.className(TRADE_DATE_CLASS)).getText();
            Pattern p = Pattern.compile("\\s+");
            Matcher m = p.matcher(date);
            date = m.replaceAll(" ");
            date = date.replaceAll("\\.", "-");
            if (date.contains("今天")) {
                date = date.replace("今天", LocalDate.now().toString("yyyy-MM-dd"));
            }
            log.info("交易时间 : {}", date);
            Date payDate = null;
            try {
                payDate = LocalDateTime.parse(date, DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")).toDate();
            } catch (Exception e) {
                payDate = LocalDateTime.parse(date, DateTimeFormat.forPattern("yyyy-MM-dd")).toDate();
            }

            record.setPayTime(payDate.getTime());

            String recordName = tr.findElement(By.className(TRADE_NAME_CLASS)).findElement(By.className(TRADE_DETAIL_TITLE_CLASS)).getText();
            log.info("交易名称 : {}", recordName);
            record.setTradeType(recordName);

            String name = tr.findElement(By.className(TRADE_NAME_CLASS)).findElement(By.className(TRADE_DETAIL_NAME_CLASS)).getText();
            log.info("收款方名称 : {}", name);
            record.setReceiverName(name);

            String number = tr.findElement(By.className(TRADE_NAME_CLASS)).findElement(By.className(TRADE_DETAIL_NO_CLASS)).getAttribute("title");
            log.info("交易号 : {}", number);
            record.setTradeNo(number);

            String recordAmount = tr.findElement(By.className(TRADE_AMOUNT_CLASS)).getText();
            log.info("交易金额 : {}", recordAmount);
            recordAmount = recordAmount.replaceAll(" ", "");
            record.setAmount(new BigDecimal(recordAmount));

            String recordStatus = tr.findElement(By.className(TRADE_STATUS_CLASS)).getText();
            log.info("交易状态 : {}", recordStatus);
            record.setStatus(recordStatus);

            String detail = tr.findElement(By.className(TradeElement.TRADE_DETAIL_CLASS)).findElement(By.className(TRADE_DETAIL_URL_CLASS)).getAttribute("href");
            log.info("交易详情 URL : {}", detail);
            record.setTradeDetailUrl(detail);

            alipayTradeRecordMapper.insert(record);
            count++;
        }
        return count;
    }

    private int crawl(WebDriver webDriver, int count) {
        // 获取交易记录详情
        List<WebElement> trList = webDriver.findElement(By.xpath(TRADE_TABLE_XPATH)).findElements(By.tagName("tr"));
        log.info("交易记录数量 : {}", trList.size());

        for (WebElement tr : trList) {
            AlipayTradeRecord record = AlipayTradeRecord.builder().userId(1001L).build();

            String date = tr.findElement(By.className(TRADE_DATE_CLASS)).getText();
            Pattern p = Pattern.compile("\\s+");
            Matcher m = p.matcher(date);
            date = m.replaceAll(" ");
            date = date.replaceAll("\\.", "-");
            if (date.contains("今天")) {
                date = date.replace("今天", LocalDate.now().toString("yyyy-MM-dd"));
            }
            log.info("交易时间 : {}", date);
            Date payDate = null;
            try {
                payDate = LocalDateTime.parse(date, DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")).toDate();
            } catch (Exception e) {
                payDate = LocalDateTime.parse(date, DateTimeFormat.forPattern("yyyy-MM-dd")).toDate();
            }

            record.setPayTime(payDate.getTime());

            String recordStatus = tr.findElement(By.className(TRADE_STATUS_CLASS)).getText();
            log.info("交易状态 : {}", recordStatus);
            record.setStatus(recordStatus);

            String detail = tr.findElement(By.className(TradeElement.TRADE_DETAIL_CLASS)).findElement(By.className(TRADE_DETAIL_URL_CLASS)).getAttribute("href");
            log.info("交易详情 URL : {}", detail);
            record.setTradeDetailUrl(detail);

            // 打开新窗口
            JavascriptExecutor executor = (JavascriptExecutor) webDriver;
            executor.executeScript("window.open('" + detail + "')");
            webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            // 获取所有窗口句柄
            List<String> handles = new ArrayList<>(webDriver.getWindowHandles());
            WebDriver newDiver = webDriver.switchTo().window(handles.get(handles.size() - 1));

            String recordName = newDiver.findElement(By.xpath(DETAIL_TRADE_TITLE_XPATH)).getText();
            log.info("交易名称 : {}", recordName);
            record.setTradeType(recordName);

            String name = newDiver.findElement(By.xpath(DETAIL_TRADE_NAME_XPATH)).getText();
            log.info("收款方名称 : {}", name);
            name = name.split(":|：")[1];
            record.setReceiverName(name);

            String number = newDiver.findElement(By.xpath(DETAIL_TRADE_NO_XPATH)).getText();
            log.info("交易号 : {}", number);
            number = number.split(":|：")[1];
            record.setTradeNo(number);

            String recordAmount = newDiver.findElement(By.xpath(DETAIL_TRADE_AMOUNT_XPATH)).getText();
            log.info("交易金额 : {}", recordAmount);
            record.setAmount(new BigDecimal(recordAmount));

            newDiver.close();
            webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            handles = new ArrayList<>(webDriver.getWindowHandles());//获取所有窗口句柄
            webDriver = webDriver.switchTo().window(handles.get(handles.size() - 1));
            alipayTradeRecordMapper.insert(record);
            count++;
        }
        return count;
    }

}
