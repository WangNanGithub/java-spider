package com.example.spider.alipay1.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class AlipayList implements Serializable {
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
     * 交易对方账户
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
     * 支付宝交易详情URL
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

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPayTime() {
        return payTime;
    }

    public void setPayTime(Long payTime) {
        this.payTime = payTime;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getTradeNoType() {
        return tradeNoType;
    }

    public void setTradeNoType(String tradeNoType) {
        this.tradeNoType = tradeNoType;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getAlipayName() {
        return alipayName;
    }

    public void setAlipayName(String alipayName) {
        this.alipayName = alipayName;
    }

    public String getTradeClassification() {
        return tradeClassification;
    }

    public void setTradeClassification(String tradeClassification) {
        this.tradeClassification = tradeClassification;
    }

    public String getTradeDetailUrl() {
        return tradeDetailUrl;
    }

    public void setTradeDetailUrl(String tradeDetailUrl) {
        this.tradeDetailUrl = tradeDetailUrl;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}