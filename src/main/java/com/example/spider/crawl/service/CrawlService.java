package com.example.spider.crawl.service;

import org.openqa.selenium.WebDriver;

public interface CrawlService<T> {

    /**
     * 抓取数据
     */
    WebDriver crawl(WebDriver webDriver, Long userId) throws Exception;

    /**
     * 保存数据
     */
    void save();

    /**
     * 状态(是否开启)
     */
    boolean status();
}
