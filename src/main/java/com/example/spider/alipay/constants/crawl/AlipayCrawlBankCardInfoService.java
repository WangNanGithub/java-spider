package com.example.spider.alipay.constants.crawl;

import com.example.spider.alipay.constants.element.BankCardELement;
import com.example.spider.alipay.entity.AlipayBankCard;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: WangNan
 * Email：nan.wang@htouhui.com
 * Date: 2017-12-27
 * Time: 下午4:44
 */
@Slf4j
public class AlipayCrawlBankCardInfoService implements BankCardELement {

    public WebDriver crawlBankCardInfo(WebDriver webDriver) {
        try {
            webDriver.navigate().to(BANK_CARD_URL);

            List<WebElement> cardList = webDriver.findElement(By.xpath(BANK_CARD_ALL_XPATH)).findElements(By.className(BANK_CARD_CLASS));
            for (WebElement element : cardList) {
                String bankName = element.findElement(By.className(BANK_CARD_NAME_CLASS)).getText();
                String lastNo = element.findElement(By.className(BANK_CARD_LAST_NUM_CLASS)).getText();
                String cardType = element.findElement(By.className(BANK_CARD_TYPE_CLASS)).getAttribute("class");
                String openStatus = element.findElement(By.cssSelector(BANK_CARD_ACTIVE_SELECTOR)).getText();

                AlipayBankCard bankCard = AlipayBankCard.builder()
                        .bankName(bankName)
                        .cardLastNum(lastNo)
                        .cardType(cardType)
                        .openStatus(openStatus)
                        .build();

                if (StringUtils.equals("已开通", openStatus)) {
                    String detailUrl = element.findElement(By.cssSelector(BANK_CARD_MANAGE_CLASS)).getAttribute("href");
                    webDriver.navigate().to(detailUrl);
                    webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                    String userName = webDriver.findElement(By.xpath(BANK_CARD_USER_NAME_XPATH)).getText();
                    String phone = webDriver.findElement(By.xpath(BANK_CARD_PHONE_XPATH)).getText();
                    String activeDate = webDriver.findElement(By.xpath(BANK_CARD_ACTIVE_DATE)).getText();

                    bankCard.setShowUserName(userName);
                    bankCard.setMobile(phone);
                    bankCard.setActiveDate(activeDate);
                }

                log.info("bank card info : {}", bankCard);
            }
        } catch (Exception e) {
            log.error("抓取用户绑定银行卡信息异常!", e);
        }
        return webDriver;
    }

}
