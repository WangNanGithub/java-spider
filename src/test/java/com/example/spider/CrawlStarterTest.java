package com.example.spider;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: WangNan
 * Email：nan.wang@htouhui.com
 * Date: 2017-12-29
 * Time: 下午2:08
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CrawlStarterTest {

    @Autowired
    private CrawlStarter crawlStarter;

    @Test
    public void start() {
        crawlStarter.start(1001L);
    }
}