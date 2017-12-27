package com.example.spider.alipay.constants.crawl;

import com.example.spider.alipay.constants.element.LoginElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: WangNan
 * Email：nan.wang@htouhui.com
 * Date: 2017-12-27
 * Time: 下午3:21
 */
public class AlipayCrawlLoginService implements LoginElement {


    /**
     * 登陆支付宝
     */
    public WebDriver login(WebDriver webDriver, String username, String password) throws InterruptedException {

        webDriver.get(LOGIN_URL);
        Actions action = new Actions(webDriver);

        // 点击 账密登陆
        Thread.sleep(1000);
        WebElement toLogin = webDriver.findElement(By.xpath(LOGIN_XPATH));
        action.moveToElement(toLogin);
        toLogin.click();

        // 输入 账号
        Thread.sleep(1000);
        WebElement id = webDriver.findElement(By.id(LOGIN_ACCOUNT_ID));
        action.moveToElement(id).sendKeys(id, Keys.ENTER);
        for (int i = 0; i < username.length(); i++) {
            id.sendKeys(String.valueOf(username.charAt(i)));
            Thread.sleep(500);
        }

        // 输入 密码
        Thread.sleep(1000);
        WebElement pwd = webDriver.findElement(By.id(LOGIN_PASSWORD_ID));
        action.moveToElement(pwd).sendKeys(pwd, Keys.ENTER);
        for (int i = 0; i < password.length(); i++) {
            pwd.sendKeys(String.valueOf(password.charAt(i)));
            Thread.sleep(500);
        }

        // 点击 登录
        Thread.sleep(1000);
        WebElement element = webDriver.findElement(By.id(LOGIN_SUBMIT_ID));
        action.moveToElement(element);
        element.click();

        return webDriver;
    }
}
