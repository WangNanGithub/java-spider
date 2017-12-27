package com.example.spider.alipay.constants.crawl;

import com.example.spider.alipay.constants.element.TradeElement;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: WangNan
 * Email：nan.wang@htouhui.com
 * Date: 2017-12-27
 * Time: 下午5:28
 */
@Slf4j
public class AlipayCrawlTradeInfoService implements TradeElement {

    /**
     * 抓取交易记录信息
     */
    public WebDriver crawlTradeRecordInfo(WebDriver webDriver) throws InterruptedException {

        WebElement nextPage = null;
        int count = 0;
        do {
            if (nextPage != null) {
                nextPage.click();
            }

            try {
                // 获取交易记录详情
                List<WebElement> trList = webDriver.findElement(By.xpath(TRADE_TABLE_XPATH)).findElements(By.tagName("tr"));
                for (WebElement tr : trList) {
                    String date = tr.findElement(By.className(TRADE_DATE_CLASS)).getText();
                    String recordName = tr.findElement(By.className(TRADE_NAME_CLASS)).findElement(By.className(TRADE_DETAIL_TITLE_CLASS)).getText();
                    String name = tr.findElement(By.className(TRADE_NAME_CLASS)).findElement(By.className(TRADE_DETAIL_NAME_CLASS)).getText();
                    String number = tr.findElement(By.className(TRADE_NAME_CLASS)).findElement(By.className(TRADE_DETAIL_NO_CLASS)).getAttribute("title");
                    String recordAmount = tr.findElement(By.className(TRADE_AMOUNT_CLASS)).getText();
                    String recordStatus = tr.findElement(By.className(TRADE_STATUS_CLASS)).getText();
                    String detail = tr.findElement(By.className(TradeElement.TRADE_DETAIL_CLASS)).findElement(By.className(TRADE_DETAIL_URL_CLASS)).getAttribute("href");
                    System.out.printf("交易名称 : %s, 交易金额 : %s, 交易状态 : %s%n", recordName, recordAmount, recordStatus);

                    count++;
                }

                // 打印 COOKIE 值
                Set<Cookie> cookies = webDriver.manage().getCookies();
                for (Cookie c : cookies) {
                    System.out.printf("%s : %s%n", c.getName(), c.getValue());
                }

            } catch (Exception e) {
                break;
            }

            // 获取跳转到下一页的链接地址
            Thread.sleep(2000);
            nextPage = webDriver.findElement(By.className("page-next"));

            if (count > 30) {
                break;
            }
        } while (nextPage != null);

        return webDriver;
    }

}
