package com.example.spider.product;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.FastDateFormat;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Selenium + WebDriver 练习
 *
 * @author wangnan
 */
@Slf4j
@SuppressWarnings("all")
@RunWith(SpringRunner.class)
@SpringBootTest
public class HtmlTest extends AbstractTransactionalJUnit4SpringContextTests {

    private static WebDriver webDriver;

    @Before
    public void before() {
        System.getProperties().setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        webDriver = new ChromeDriver();
    }

//    @After
    public void after() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }

    /**
     * 登陆支付宝
     */
    @Test
    @Commit
    public void testLogin() throws InterruptedException, ParseException {
        String username = "";
        String password = "";

        webDriver.get("https://authzui.alipay.com/login/index.htm");
        Actions action = new Actions(webDriver);

        /******************************* 登陆页面 *************************************/

        // 点击 账密登陆
        Thread.sleep(2000);
        WebElement toLogin = webDriver.findElement(By.xpath("//*[@id=\"J-loginMethod-tabs\"]/li[2]"));
        action.moveToElement(toLogin);
        toLogin.click();

        // 输入 账号
        Thread.sleep(2000);
        WebElement id = webDriver.findElement(By.id("J-input-user"));
        action.moveToElement(id).sendKeys(id, Keys.ENTER);
        for (int i = 0; i < username.length(); i++) {
            id.sendKeys(String.valueOf(username.charAt(i)));
            Thread.sleep(600);
        }

        // 输入 密码
        Thread.sleep(2000);
        WebElement pwd = webDriver.findElement(By.id("password_rsainput"));
        action.moveToElement(pwd).sendKeys(pwd, Keys.ENTER);
        for (int i = 0; i < password.length(); i++) {
            pwd.sendKeys(String.valueOf(password.charAt(i)));
            Thread.sleep(700);
        }

        // 点击 登录
        Thread.sleep(1000);
        WebElement element = webDriver.findElement(By.id("J-login-btn"));
        action.moveToElement(element);
        element.click();

        /******************************* 登陆成功后页面 *************************************/

        // 获取跳转后地址
        String currentUrl = webDriver.getCurrentUrl();
        System.out.printf("登陆成功后跳转地址 : %s%n", currentUrl);

        /*********** 抓取首页信息 *************/
        // 账户余额 :
        String balanceXpath = "//*[@id=\"J-assets-balance\"]/div[1]/div/div[2]/div/strong";
        // 点击显示余额
        try {
            webDriver.findElement(By.xpath("//*[@id=\"J-assets-balance\"]/div[2]/div/i")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String balance = webDriver.findElement(By.xpath(balanceXpath)).getText();
        System.out.printf("账户余额 : %s%n", balance);

        // 余额宝金额 :
        String yebprodAmountXpath = "//*[@id=\"J-assets-mfund-amount\"]/strong";
        try {
            webDriver.findElement(By.xpath("//*[@id=\"J-assets-mfund\"]/div[2]/div[1]/i")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String yebprodAmount = webDriver.findElement(By.xpath(yebprodAmountXpath)).getText();
        System.out.printf("余额宝余额 : %s%n", yebprodAmount);

        // 花呗剩余额度 :
        String huabeiRestAmountXpath = "//*[@id=\"J-assets-pcredit\"]/div/div/div[2]/div/p[1]/span/strong";
        String huabeiRestAmount = webDriver.findElement(By.xpath(huabeiRestAmountXpath)).getText();
        System.out.printf("花呗剩余额度 : %s%n", huabeiRestAmount);

        // 花呗总额度 :
        String huabeiAllAmountXpath = "//*[@id=\"J-assets-pcredit\"]/div/div/div[2]/div/p[2]/strong";
        String huabeiAllAmount = webDriver.findElement(By.xpath(huabeiAllAmountXpath)).getText();
        System.out.printf("花呗全部额度 : %s%n", huabeiAllAmount);
        /************************************/

        // 获取 cookie
        Cookie alipayCookie = webDriver.manage().getCookieNamed("ALIPAYJSESSIONID");
        Cookie jsessionidCookie = webDriver.manage().getCookieNamed("JSESSIONID");
        Cookie sessionCookieNameIdCookie = webDriver.manage().getCookieNamed("session.cookieNameId");

        // 添加 COOKIE 值
        if (alipayCookie != null) {
            webDriver.manage().addCookie(alipayCookie);
        }
        if (jsessionidCookie != null) {
            webDriver.manage().addCookie(jsessionidCookie);
        }
        if (sessionCookieNameIdCookie != null) {
            webDriver.manage().addCookie(sessionCookieNameIdCookie);
        }

        // 查询所有交易记录超链接
        String hrefToAllPayRecord = "//*[@id=\"J-trend-consume\"]/div/div[2]/div[3]/a[2]";
        String href = webDriver.findElement(By.xpath(hrefToAllPayRecord)).getAttribute("href");

        // 点击 账户设置
        Thread.sleep(5000);
        String accountSetXpath = "//*[@id=\"globalContainer\"]/div[2]/div/div[2]/ul/li[3]/a";
        webDriver.findElement(By.xpath(accountSetXpath)).click();

        /******************************* 账户设置页面 *************************************/

        // 是否实名认证
        String authXpath = "//*[@id=\"account-main\"]/div/table/tbody/tr[1]/td[1]/span[4]";
        String auth = webDriver.findElement(By.xpath(authXpath)).getText();
        System.out.printf("是否实名认证 : %s%n", auth);

        // 注册时间
        String regTimeXpath = "//*[@id=\"account-main\"]/div/table/tbody/tr[7]/td[1]";
        String regTime = webDriver.findElement(By.xpath(regTimeXpath)).getText();
        regTime = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss").format(FastDateFormat.getInstance("yyyy年MM月dd日").parse(regTime));
        System.out.printf("注册时间 : %s%n", regTime);

        // 绑定银行卡数量
        String bindingBankCardCountXpath = "//*[@id=\"J-bankcards\"]/td[1]/span";
        String bindingBankCardCount = webDriver.findElement(By.xpath(bindingBankCardCountXpath)).getText();
        System.out.printf("绑定银行卡数量 : %s%n", bindingBankCardCount);

        String infoSql = String.format("INSERT INTO pdl_alipay_info(user_id, balance, yeb_balance, hb_all_balance, hb_rest_balance, binging_bank_card_count, is_real_name_authentication, reg_time) VALUES ('1001', %s, %s, %s, %s, %s, %s, '%s')", balance, yebprodAmount, huabeiAllAmount, huabeiRestAmount, bindingBankCardCount, StringUtils.equals("已认证", auth) ? 1 : 0, regTime);
        jdbcTemplate.execute(infoSql);

        Thread.sleep(5000);
        webDriver.navigate().to(href);

        /******************************* 查询所有交易记录页面 *************************************/

        // 获取跳转后地址
        currentUrl = webDriver.getCurrentUrl();
        System.out.printf("点击查询所有交易记录后跳转地址 : %s%n", currentUrl);

        // 抓取交易记录
        System.out.println("=========================");
        System.out.println("交易内容:");
        WebElement nextPage = null;
        int count = 0;
        do {
            if (nextPage != null) {
                nextPage.click();
            }

            try {
                // 获取交易记录详情
                String tradeRecordTbodyXpath = "//*[@id=\"tradeRecordsIndex\"]/tbody";
                List<WebElement> trList = webDriver.findElement(By.xpath(tradeRecordTbodyXpath)).findElements(By.tagName("tr"));
                for (WebElement tr : trList) {
                    String recordName = tr.findElement(By.className("name")).findElement(By.className("consume-title")).getText();
                    String recordAmount = tr.findElement(By.className("amount")).getText();
                    String recordStatus = tr.findElement(By.className("status")).getText();
                    System.out.printf("交易名称 : %s, 交易金额 : %s, 交易状态 : %s%n", recordName, recordAmount, recordStatus);

                    String recordInfoSql = String.format("INSERT INTO pdl_alipay_pay_record(user_id, name, amount, status) VALUES ('1001', %s, %s, %s)", recordName, recordAmount, recordStatus);
                    jdbcTemplate.execute(recordInfoSql);
                    count++;
                }

                // 打印 COOKIE 值
                Set<Cookie> cookies = webDriver.manage().getCookies();
                for (Cookie c : cookies) {
                    System.out.printf("%s : %s%n", c.getName(), c.getValue());
                }

                // 获取 COOKIE 值
                alipayCookie = webDriver.manage().getCookieNamed("ALIPAYJSESSIONID");
                jsessionidCookie = webDriver.manage().getCookieNamed("JSESSIONID");
                sessionCookieNameIdCookie = webDriver.manage().getCookieNamed("session.cookieNameId");
            } catch (Exception e) {
                break;
            }

            // 添加 COOKIE 值
            if (alipayCookie != null) {
                webDriver.manage().addCookie(alipayCookie);
            }
            if (jsessionidCookie != null) {
                webDriver.manage().addCookie(jsessionidCookie);
            }
            if (sessionCookieNameIdCookie != null) {
                webDriver.manage().addCookie(sessionCookieNameIdCookie);
            }

            // 获取跳转到下一页的链接地址
            Thread.sleep(2000);
            nextPage = webDriver.findElement(By.className("page-next"));
        } while (nextPage != null);
        System.out.printf("交易记录条数 : %d%n", count);
        System.out.println("=========================");
    }


    /**
     * 登陆还借钱后台
     */
    @Test
    @SuppressWarnings("ALL")
    public void testLoginHaiJieQian() throws Exception {
        String url = "http://47.93.77.75/#/login";
        String username = "18518168842";
        String password = "Oj4WkCSJZFnQukO4n2sH";

        webDriver.get(url);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // 输入账号
        webDriver.findElement(By.xpath("/html/body/root/div/div/div/div[2]/main/div/form/div[1]/div/input")).sendKeys(username);
        // 输入密码
        webDriver.findElement(By.xpath("/html/body/root/div/div/div/div[2]/main/div/form/div[2]/div/input")).sendKeys(password);
        // 点击登陆
        webDriver.findElement(By.xpath("/html/body/root/div/div/div/div[2]/main/div/form/div[3]/div/button/div/span[5]")).click();

        System.out.println("===========================");
        System.out.println();

        System.out.println(webDriver.getCurrentUrl());

        System.out.println();
        System.out.println("===========================");

        // 关闭页面
//        webDriver.close();
    }
}
