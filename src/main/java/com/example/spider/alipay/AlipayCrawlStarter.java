package com.example.spider.alipay;

import com.example.spider.alipay.crawl.*;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: WangNan
 * Email：nan.wang@htouhui.com
 * Date: 2017-12-28
 * Time: 下午5:19
 */
@Service
@Slf4j
@SuppressWarnings("ALL")
public class AlipayCrawlStarter {

    private AlipayCrawlLoginService alipayCrawlLoginService;
    private AlipayCrawlUserInfoService alipayCrawlUserInfoService;
    private AlipayCrawlChargeInfoService alipayCrawlChargeInfoService;
    private AlipayCrawlBankCardInfoService alipayCrawlBankCardInfoService;
    private AlipayCrawlTradeInfoService alipayCrawlTradeInfoService;

    @Autowired
    public AlipayCrawlStarter(AlipayCrawlLoginService alipayCrawlLoginService,
                              AlipayCrawlUserInfoService alipayCrawlUserInfoService,
                              AlipayCrawlChargeInfoService alipayCrawlChargeInfoService,
                              AlipayCrawlBankCardInfoService alipayCrawlBankCardInfoService,
                              AlipayCrawlTradeInfoService alipayCrawlTradeInfoService) {
        this.alipayCrawlLoginService = alipayCrawlLoginService;
        this.alipayCrawlUserInfoService = alipayCrawlUserInfoService;
        this.alipayCrawlChargeInfoService = alipayCrawlChargeInfoService;
        this.alipayCrawlBankCardInfoService = alipayCrawlBankCardInfoService;
        this.alipayCrawlTradeInfoService = alipayCrawlTradeInfoService;
    }

    public void start(String username, String password) {
        WebDriver webDriver = null;

        try {
            webDriver = alipayCrawlLoginService.login(username, password);
        } catch (InterruptedException e) {
            throw new RuntimeException("登陆失败, 用户名或者密码错误!");
        }

        try {
            alipayCrawlUserInfoService.crawUserInfo(webDriver);
        } catch (Exception e) {
            log.error("抓取支付宝信息失败, 用户名 : {}", username);
        }

        try {
            alipayCrawlBankCardInfoService.crawlBankCardInfo(webDriver);
        } catch (Exception e) {
            log.error("抓取绑定银行卡信息失败, 用户名 : {}", username);
        }

        try {
            alipayCrawlChargeInfoService.crawlChargeInfo(webDriver);
        } catch (Exception e) {
            log.error("抓取缴费提醒信息失败, 用户名 : {}", username);
        }

        try {
            alipayCrawlTradeInfoService.crawlTradeRecordInfo(webDriver);
        } catch (InterruptedException e) {
            log.error("抓取交易记录失败, 用户名 : {}", username);
        }
    }
}
