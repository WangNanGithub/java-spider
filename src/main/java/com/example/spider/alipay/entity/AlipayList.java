package com.example.spider.alipay.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 支付宝交易记录信息
 *
 * @author wangnan
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AlipayList {

    /**
     * ID
     */
    private Long id;

    /**
     * 用户 ID
     */
    private Long userId;

    /**
     * 支付时间
     */
    private Long payTime;

    /**
     * 交易名称
     */
    private String tradeType;

    /**
     * 对方交易账户
     */
    private String tradeNoType;

    /**
     * 交易号
     */
    private String tradeNo;

    /**
     * 接收人
     */
    private String receiverName;

    /**
     * 交易金额
     */
    private BigDecimal amount;

    /**
     * 交易状态
     */
    private String status;

    /**
     * 来源
     */
    private String source;

    /**
     * 支付宝账户名
     */
    private String alipayName;

    /**
     * 支付宝交易分类
     */
    private String tradeClassification;

    /**
     * 支付宝交易详情url
     */
    private String tradeDetailUrl;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
