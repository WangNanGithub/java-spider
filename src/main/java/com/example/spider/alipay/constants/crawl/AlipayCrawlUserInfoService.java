package com.example.spider.alipay.constants.crawl;

import com.example.spider.alipay.constants.element.AccountElement;
import com.example.spider.alipay.constants.element.IndexELement;
import com.example.spider.alipay.entity.AlipayInfo;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: WangNan
 * Email：nan.wang@htouhui.com
 * Date: 2017-12-27
 * Time: 下午3:59
 */
@Slf4j
public class AlipayCrawlUserInfoService implements IndexELement, AccountElement {

    /**
     * 抓取用户信息
     */
    public WebDriver crawUserInfo(WebDriver webDriver) {

        AlipayInfo alipayInfo = new AlipayInfo();

        crawlYeInfo(webDriver, alipayInfo);
        crawlYebInfo(webDriver, alipayInfo);
        crawlHbInfo(webDriver, alipayInfo);
        crawlAccountInfo(webDriver, alipayInfo);

        log.info("alipay info : {}", alipayInfo);

        return webDriver;
    }

    /**
     * 查询账户余额信息
     */
    private void crawlYeInfo(WebDriver webDriver, AlipayInfo alipayInfo) {
        try {
            // 点击显示余额
            webDriver.findElement(By.xpath(SHOW_BALANCE_XPATH)).click();
        } catch (Exception e) {
            // 说明不需要点击显示余额
        }
        try {
            String balance = webDriver.findElement(By.xpath(BALANCE_XPATH)).getText();
            log.info("账户余额 : {}", balance);
            alipayInfo.setBalance(new BigDecimal(balance));
        } catch (Exception e) {
            log.error("抓取账户余额信息异常!", e);
        }
    }

    /**
     * 查询余额宝信息
     */
    private void crawlYebInfo(WebDriver webDriver, AlipayInfo alipayInfo) {

        try {
            // 点击显示余额
            webDriver.findElement(By.xpath(SHOW_YEB_XPATH)).click();
        } catch (Exception e) {
            // 说明不需要点击显示余额
        }
        try {
            // 1. 抓取余额宝金额
            String yebAmount = webDriver.findElement(By.xpath(YEB_XPATH)).getText();
            log.info("余额宝余额 : {}", yebAmount);
            alipayInfo.setAmount(new BigDecimal(yebAmount));

            // 2. 抓取余额宝收益
            String income = webDriver.findElement(By.id(YEB_INCOME_ID)).getText();
            log.info("余额宝收益 : {}", income);
            alipayInfo.setIncome(new BigDecimal(income));
        } catch (Exception e) {
            log.error("抓取账户余额宝信息异常!", e);
        }
    }

    /**
     * 抓取花呗信息
     */
    private void crawlHbInfo(WebDriver webDriver, AlipayInfo alipayInfo) {

        try {
            // 1. 抓取花呗总额度
            String hbAllAmount = webDriver.findElement(By.xpath(HB_AMOUNT_XPATH)).getText();
            log.info("花呗全部额度 : {}", hbAllAmount);
            alipayInfo.setTotalAmount(new BigDecimal(hbAllAmount));

            // 2. 抓取花呗剩余额度
            String hbRestAmount = webDriver.findElement(By.xpath(HB_REST_AMOUNT_XPATH)).getText();
            log.info("花呗剩余额度 : {}", hbRestAmount);
            alipayInfo.setAvailableAmount(new BigDecimal(hbRestAmount));

            // 3. 抓取花呗下月应还金额
            // TODO 页面上找不到
        } catch (Exception e) {
            log.error("抓取花呗信息异常!", e);
        }
    }

    /**
     * 抓取用户账户信息
     */
    private void crawlAccountInfo(WebDriver webDriver, AlipayInfo alipayInfo) {
        try {
            // 跳转页面
            webDriver.navigate().to(ACCOUNT_SET_URL);

            // 1. 抓取真实姓名
            String realName = webDriver.findElement(By.xpath(REAL_NAME_XPATH)).getText();
            log.info("真实姓名 : {}", realName);
            alipayInfo.setRealName(realName);

            // 2. 抓取身份证号
            String idCard = webDriver.findElement(By.xpath(ID_CARD_XPATH)).getText();
            log.info("身份证号 : {}", idCard);
            alipayInfo.setIdCard(idCard);
            alipayInfo.setIsIdcard("yes");

            // 3. 抓取实名认证状态
            String isRealName = webDriver.findElement(By.xpath(IS_REAL_NAME_XPATH)).getText();
            log.info("实名认证状态 : {}", isRealName);
            alipayInfo.setIsRealName(isRealName);

            // 4. 抓取绑定邮箱
            String email = webDriver.findElement(By.xpath(EMAIL_XPATH)).getText();
            log.info("绑定邮箱 : {}", email);
            alipayInfo.setEmail(email);

            // 5. 抓取绑定手机号
            String phone = webDriver.findElement(By.xpath(PHONE_XPATH)).getText();
            log.info("绑定手机号 : {}", phone);
            alipayInfo.setPhone(phone);
            alipayInfo.setIsPhone("yes");

            // 6. 抓取淘宝会员名
            String tbName = webDriver.findElement(By.xpath(TB_NAME_XPATH)).getText();
            log.info("淘宝会员名 : {}", tbName);
            alipayInfo.setTaobaoName(tbName);

            // 7. 抓取注册时间
            String regDate = webDriver.findElement(By.xpath(REG_DATE_XPATH)).getText();
            log.info("注册时间 : {}", regDate);
            alipayInfo.setRegisterDate(regDate);

            // 8. 抓取会员保障
            String isProtected = webDriver.findElement(By.xpath(PROTECTED_XPATH)).getText();
            log.info("会员保障 : {}", isProtected);
            alipayInfo.setIsProtected(isProtected);
        } catch (Exception e) {
            log.error("抓取用户账户信息异常!", e);
        }
    }

}
