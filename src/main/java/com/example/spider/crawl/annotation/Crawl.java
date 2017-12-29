package com.example.spider.crawl.annotation;

import com.example.spider.crawl.entity.CrawlType;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * 爬虫
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface Crawl {

    CrawlType[] name() default {};

}
