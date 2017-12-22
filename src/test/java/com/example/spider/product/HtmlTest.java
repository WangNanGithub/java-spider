package com.example.spider.product;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: WangNan
 * Email：nan.wang@htouhui.com
 * Date: 2017-12-20
 * Time: 下午3:58
 */
@Slf4j
@SuppressWarnings("all")
public class HtmlTest {

    private static WebDriver webDriver;

    @Before
    public void before() {
        System.getProperties().setProperty("webdriver.chrome.driver", "/Users/wangnan/Downloads/chromedriver");
        webDriver = new ChromeDriver();
    }

    /**
     * 登陆支付宝
     */
    @Test
    public void testLogin() throws InterruptedException {
        String username = "";
        String password = "";

        WebDriver webDriver = new ChromeDriver();
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

        String currentUrl = webDriver.getCurrentUrl();
        System.out.printf("登陆成功后跳转地址 : %s%n", currentUrl);

        // 余额宝金额 :
        String yebprodAmountXpath = "//*[@id=\"J-assets-mfund-amount\"]/strong";
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

        // 查询所有交易记录 : //*[@id="J-trend-consume"]/div/div[2]/div[3]/a[2]
        String hrefToAllPayRecord = "//*[@id=\"J-trend-consume\"]/div/div[2]/div[3]/a[2]";
        String href = webDriver.findElement(By.xpath(hrefToAllPayRecord)).getAttribute("href");
//        webDriver.navigate().to(href);

        /******************************* 查询所有交易记录页面 *************************************/

//        currentUrl = webDriver.getCurrentUrl();
//        System.out.printf("点击查询所有交易记录后跳转地址 : %s%n", currentUrl);
//
//        // 交易记录 Table : //*[@id="tradeRecordsIndex"]
//        //
//
//        webDriver.findElement(By.className("page-next")).click();
//
//        Thread.sleep(5000);
//        webDriver.findElement(By.className("page-next")).click();

        // 下一页 : //*[@id="J_home-record-container"]/div[2]/div/div[2]/div[2]/div/a[1]
        //         //*[@id="J_home-record-container"]/div[2]/div/div[2]/div[2]/div/a[3]

        // 关闭页面
//        webDriver.close();

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
