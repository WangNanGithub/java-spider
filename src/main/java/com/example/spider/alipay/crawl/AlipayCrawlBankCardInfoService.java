package com.example.spider.alipay.crawl;

import com.example.spider.alipay.constants.BankCardElement;
import com.example.spider.alipay.entity.AlipayBankCard;
import com.example.spider.alipay.mapper.AlipayBankCardMapper;
import com.example.spider.crawl.annotation.Crawl;
import com.example.spider.crawl.service.CrawlService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.FastDateFormat;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.example.spider.crawl.entity.CrawlType.ZHI_FU_BAO;
import static com.example.spider.util.StringUtil.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: WangNan
 * Email：nan.wang@htouhui.com
 * Date: 2017-12-27
 * Time: 下午4:44
 */
@Slf4j
@Crawl(name = ZHI_FU_BAO)
@Service
public class AlipayCrawlBankCardInfoService implements CrawlService<AlipayBankCard>, BankCardElement {

    @Autowired
    private AlipayBankCardMapper alipayBankCardMapper;

    private List<AlipayBankCard> data = new ArrayList<>();

    @Override
    public WebDriver crawl(WebDriver webDriver, Long userId) throws Exception {
        return crawlBankCardInfo(webDriver, userId);
    }

    @Override
    public void save() {
        for (AlipayBankCard bankCard : data) {
            try {
                alipayBankCardMapper.insert(bankCard);
            } catch (Exception e) {
                log.error("save alipay bank card info error", e);
            }
        }
    }

    @Override
    public boolean status() {
        return true;
    }

    public WebDriver crawlBankCardInfo(WebDriver webDriver, Long userId) throws Exception {
        try {
            webDriver.navigate().to(BANK_CARD_URL);
            webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            List<WebElement> cardList = webDriver.findElement(By.xpath(BANK_CARD_ALL_XPATH)).findElements(By.className(BANK_CARD_CLASS));
            System.out.println("card size : " + cardList.size());
            for (WebElement element : cardList) {
                String bankName = element.findElement(By.className(BANK_CARD_NAME_CLASS)).getText();
                String lastNo = element.findElement(By.className(BANK_CARD_LAST_NUM_CLASS)).getText();
                lastNo = match("\\d{4}", lastNo);
                String cardType = element.findElement(By.className(BANK_CARD_TYPE_CLASS)).getAttribute("class");
                if (Arrays.asList(cardType.split(" ")).contains("card-type-DC")) {
                    cardType = "储蓄卡";
                } else if (Arrays.asList(cardType.split(" ")).contains("card-type-CC")) {
                    cardType = "信用卡";
                } else {
                    cardType = "未知";
                }
                String openStatus = element.findElement(By.cssSelector(BANK_CARD_ACTIVE_SELECTOR)).getText();

                AlipayBankCard bankCard = AlipayBankCard.builder()
                        .userId(userId)
                        .bankName(bankName)
                        .cardLastNum(lastNo)
                        .cardType(cardType)
                        .openStatus(openStatus)
                        .build();

                if (StringUtils.equals("已开通", openStatus)) {
                    String detailUrl = element.findElement(By.cssSelector(BANK_CARD_MANAGE_CLASS)).getAttribute("href");

                    // 打开新窗口
                    JavascriptExecutor executor = (JavascriptExecutor) webDriver;
                    executor.executeScript("window.open('" + detailUrl + "')");
                    webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                    // 获取所有窗口句柄
                    List<String> handles = new ArrayList<>(webDriver.getWindowHandles());
                    WebDriver newDiver = webDriver.switchTo().window(handles.get(handles.size() - 1));

                    String userName = webDriver.findElement(By.xpath(BANK_CARD_USER_NAME_XPATH)).getText();
                    String phone = webDriver.findElement(By.xpath(BANK_CARD_PHONE_XPATH)).getText();
                    phone = matchPhone(phone);
                    String activeDate = webDriver.findElement(By.xpath(BANK_CARD_ACTIVE_DATE_XPATH)).getText();
                    activeDate = matchDate(activeDate);

                    bankCard.setShowUserName(userName);
                    bankCard.setMobile(phone);
                    if (activeDate != null) {
                        bankCard.setActiveDate(FastDateFormat.getInstance("yyyy.MM.dd").parse(activeDate));
                    }

                    newDiver.close();
                }

                log.info("bank card info : {}", bankCard);
                data.add(bankCard);

                List<String> handles = new ArrayList<>(webDriver.getWindowHandles());//获取所有窗口句柄
                webDriver = webDriver.switchTo().window(handles.get(handles.size() - 1));
            }
        } catch (Exception e) {
            log.error("抓取用户绑定银行卡信息异常!", e);
        }
        return webDriver;
    }
}
