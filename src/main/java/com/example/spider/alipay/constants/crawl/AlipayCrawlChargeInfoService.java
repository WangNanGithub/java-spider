package com.example.spider.alipay.constants.crawl;

import com.example.spider.alipay.constants.element.ChargeElement;
import com.example.spider.alipay.entity.AlipayChargeAccount;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: WangNan
 * Email：nan.wang@htouhui.com
 * Date: 2017-12-27
 * Time: 下午5:04
 */
@Slf4j
public class AlipayCrawlChargeInfoService implements ChargeElement {
    
    public WebDriver crawlChargeInfo(WebDriver webDriver) {
        webDriver.navigate().to(CHARGE_URL);

        WebElement element = webDriver.findElement(By.xpath(CHARGE_TABLE_XPATH));
        List<WebElement> trList = element.findElements(By.tagName("tr"));
        for (WebElement tr : trList) {
            List<WebElement> tdList = tr.findElements(By.tagName("td"));
            String item = tdList.get(0).getText();
            String area = tdList.get(1).getText();
            String unit = tdList.get(2).getText();
            String account = tdList.get(3).getText();
            String number = tdList.get(4).getText();
            String reminder = tdList.get(5).getText();

            AlipayChargeAccount chargeAccount = AlipayChargeAccount.builder()
                    .chargeItem(item)
                    .area(area)
                    .chargeUnit(unit)
                    .chargeAccount(account)
                    .chargeNumber(number)
                    .chargeReminder(reminder)
                    .build();
            log.info("charge info : {}", chargeAccount);
        }

        return webDriver;
    }
    
}
