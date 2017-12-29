package com.example.spider.alipay.crawl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
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
    @Commit
    public void crawlTradeRecordInfo() throws Exception {
        String username = "";
        String password = "";
        long userId = 1005L;

        WebDriver webDriver = alipayCrawlLoginService.login(username, password);
        alipayCrawlTradeInfoService.crawl(webDriver, userId);
    }
}