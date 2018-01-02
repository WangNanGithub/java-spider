package com.example.spider.alipay.crawl;

import com.example.spider.alipay.constants.ChargeElement;
import com.example.spider.alipay.entity.AlipayChargeAccount;
import com.example.spider.alipay.mapper.AlipayChargeAccountMapper;
import com.example.spider.crawl.annotation.Crawl;
import com.example.spider.crawl.service.CrawlService;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.example.spider.crawl.entity.CrawlType.ZHI_FU_BAO;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: WangNan
 * Email：nan.wang@htouhui.com
 * Date: 2017-12-27
 * Time: 下午5:04
 */
@Slf4j
@Crawl(name = ZHI_FU_BAO)
@Service
public class AlipayCrawlChargeInfoService implements CrawlService<AlipayChargeAccount>, ChargeElement {

    @Autowired
    private AlipayChargeAccountMapper alipayChargeAccountMapper;

    private List<AlipayChargeAccount> data = new ArrayList<>();

    @Override
    public WebDriver crawl(WebDriver webDriver, Long userId) throws Exception {
        return crawlChargeInfo(webDriver, userId);
    }

    @Override
    public void save() {
        for (AlipayChargeAccount chargeAccount : data) {
            try {
                alipayChargeAccountMapper.insert(chargeAccount);
            } catch (Exception e) {
                log.error("save alipay charge account reminder info error", e);
            }
        }
    }

    @Override
    public boolean status() {
        return true;
    }

    public WebDriver crawlChargeInfo(WebDriver webDriver, Long userId) throws Exception {
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
                    .userId(userId)
                    .chargeItem(item)
                    .area(area)
                    .chargeUnit(unit)
                    .chargeAccount(account)
                    .chargeNumber(number)
                    .chargeReminder(reminder)
                    .build();
            log.info("charge info : {}", chargeAccount);
            data.add(chargeAccount);
        }

        return webDriver;
    }

}
