package com.example.spider.alipay.crawl;

import org.apache.commons.codec.binary.Base64;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: WangNan
 * Email：nan.wang@htouhui.com
 * Date: 2017-12-27
 * Time: 下午6:59
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AlipayCrawlTradeInfoServiceTest {

    @Autowired
    private AlipayCrawlLoginService alipayCrawlLoginService;
    @Autowired
    private AlipayCrawlTradeInfoService alipayCrawlTradeInfoService;

    @Test
    public void crawlTradeRecordInfo() throws InterruptedException {
        String username = "";
        String password = "";

        username = new String(Base64.decodeBase64(username));
        password = new String(Base64.decodeBase64(password));

        WebDriver webDriver = alipayCrawlLoginService.login(username, password);
        alipayCrawlTradeInfoService.crawlTradeRecordInfo(webDriver);
    }
}