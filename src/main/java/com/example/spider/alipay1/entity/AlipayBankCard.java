package com.example.spider.alipay1.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class AlipayBankCard implements Serializable {
    private Long id;

    /**
     * 用户 ID
     */
    private Long userId;

    /**
     * 支付宝账户名
     */
    private String alipayName;

    /**
     * 银行卡后4位
     */
    private String cardLastNum;

    /**
     * 快捷支付开通状态
     */
    private String openStatus;

    /**
     * 银行卡申请时间
     */
    private Long applyTime;

    /**
     * 银行名称
     */
    private String bankName;

    /**
     * 银行卡类型
     */
    private String cardType;

    /**
     * 银行预留手机号(中间4位带掩码)
     */
    private String mobile;

    /**
     * 快捷支付开通日期, 例如: 2013-02-02
     */
    private String activeDate;

    /**
     * 银行卡持卡人姓名
     */
    private String showUserName;

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

    public String getAlipayName() {
        return alipayName;
    }

    public void setAlipayName(String alipayName) {
        this.alipayName = alipayName;
    }

    public String getCardLastNum() {
        return cardLastNum;
    }

    public void setCardLastNum(String cardLastNum) {
        this.cardLastNum = cardLastNum;
    }

    public String getOpenStatus() {
        return openStatus;
    }

    public void setOpenStatus(String openStatus) {
        this.openStatus = openStatus;
    }

    public Long getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Long applyTime) {
        this.applyTime = applyTime;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getActiveDate() {
        return activeDate;
    }

    public void setActiveDate(String activeDate) {
        this.activeDate = activeDate;
    }

    public String getShowUserName() {
        return showUserName;
    }

    public void setShowUserName(String showUserName) {
        this.showUserName = showUserName;
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