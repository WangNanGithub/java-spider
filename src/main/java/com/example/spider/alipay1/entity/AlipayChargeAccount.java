package com.example.spider.alipay1.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class AlipayChargeAccount implements Serializable {
    private Long id;

    /**
     * 用户 ID
     */
    private Long userId;

    /**
     * 支付宝账户名
     */
    private String loginName;

    /**
     * 缴费项目
     */
    private String chargeItem;

    /**
     * 地区
     */
    private String area;

    /**
     * 收费单位
     */
    private String chargeUnit;

    /**
     * 户名
     */
    private String chargeAccount;

    /**
     * 缴费号码
     */
    private String chargeNumber;

    /**
     * 缴费提醒
     */
    private String chargeReminder;

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

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getChargeItem() {
        return chargeItem;
    }

    public void setChargeItem(String chargeItem) {
        this.chargeItem = chargeItem;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getChargeUnit() {
        return chargeUnit;
    }

    public void setChargeUnit(String chargeUnit) {
        this.chargeUnit = chargeUnit;
    }

    public String getChargeAccount() {
        return chargeAccount;
    }

    public void setChargeAccount(String chargeAccount) {
        this.chargeAccount = chargeAccount;
    }

    public String getChargeNumber() {
        return chargeNumber;
    }

    public void setChargeNumber(String chargeNumber) {
        this.chargeNumber = chargeNumber;
    }

    public String getChargeReminder() {
        return chargeReminder;
    }

    public void setChargeReminder(String chargeReminder) {
        this.chargeReminder = chargeReminder;
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