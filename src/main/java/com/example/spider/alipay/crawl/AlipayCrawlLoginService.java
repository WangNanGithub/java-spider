package com.example.spider.alipay.crawl;

import com.example.spider.alipay.constants.LoginElement;
import com.example.spider.crawl.annotation.Crawl;
import com.example.spider.crawl.service.CrawlLoginService;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.springframework.stereotype.Service;

import static com.example.spider.crawl.entity.CrawlType.ZHI_FU_BAO;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: WangNan
 * Email：nan.wang@htouhui.com
 * Date: 2017-12-27
 * Time: 下午3:21
 */
@Slf4j
@Crawl(name = ZHI_FU_BAO)
@Service
public class AlipayCrawlLoginService implements CrawlLoginService, LoginElement {

    /**
     * 登陆支付宝
     *
     * @param username 支付宝账号
     * @param password 支付宝密码
     */
    public WebDriver login(String username, String password) throws Exception {
        System.getProperties().setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver webDriver = new ChromeDriver();
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
