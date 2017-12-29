package com.example.spider.crawl.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: WangNan
 * Email：nan.wang@htouhui.com
 * Date: 2017-12-29
 * Time: 下午3:57
 */
@AllArgsConstructor
public enum  CrawlType {

    ZHI_FU_BAO("支付宝");

    @Getter
    private String description;

}
