package com.example.spider.alipay.crawl;

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
 * Time: 下午7:00
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AlipayCrawlUserInfoServiceTest {

    @Autowired
    private AlipayCrawlLoginService alipayCrawlLoginService;
    @Autowired
    private AlipayCrawlUserInfoService alipayCrawlUserInfoService;

    @Test
    public void crawUserInfo() throws Exception {
        String username = "";
        String password = "";
        long userId = 1001L;

        WebDriver webDriver = alipayCrawlLoginService.login(username, password);
        alipayCrawlUserInfoService.crawUserInfo(webDriver, userId);
        webDriver.quit();
    }
}