package com.example.spider.crawl.service;

import org.openqa.selenium.WebDriver;

public interface CrawlLoginService {

    /**
     * 登陆
     */
    WebDriver login(String username, String password) throws Exception;

}
