package com.example.spider.alipay1.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class AlipayInfo implements Serializable {
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
     * 真实姓名
     */
    private String realName;

    /**
     * 身份证
     */
    private String idCard;

    /**
     * 绑定的邮箱
     */
    private String email;

    /**
     * 绑定的手机号
     */
    private String phone;

    /**
     * 淘宝账户名
     */
    private String taobaoName;

    /**
     * 注册时间
     */
    private String registerDate;

    /**
     * 是否实名认证
     */
    private String isRealName;

    /**
     * 是否会员保障
     */
    private String isProtected;

    /**
     * 是否绑定手机
     */
    private String isPhone;

    /**
     * 安全等级
     */
    private String secretLevel;

    /**
     * 账户余额
     */
    private BigDecimal balance;

    /**
     * 余额宝总收入
     */
    private BigDecimal income;

    /**
     * 是否身份证认证
     */
    private String isIdcard;

    /**
     * 余额宝总金额
     */
    private BigDecimal amount;

    /**
     * 花呗总额度
     */
    private BigDecimal totalAmount;

    /**
     * 花呗可用额度
     */
    private BigDecimal availableAmount;

    /**
     * 花呗下期需还
     */
    private BigDecimal needToPayNextMouth;

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

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTaobaoName() {
        return taobaoName;
    }

    public void setTaobaoName(String taobaoName) {
        this.taobaoName = taobaoName;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getIsRealName() {
        return isRealName;
    }

    public void setIsRealName(String isRealName) {
        this.isRealName = isRealName;
    }

    public String getIsProtected() {
        return isProtected;
    }

    public void setIsProtected(String isProtected) {
        this.isProtected = isProtected;
    }

    public String getIsPhone() {
        return isPhone;
    }

    public void setIsPhone(String isPhone) {
        this.isPhone = isPhone;
    }

    public String getSecretLevel() {
        return secretLevel;
    }

    public void setSecretLevel(String secretLevel) {
        this.secretLevel = secretLevel;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getIncome() {
        return income;
    }

    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    public String getIsIdcard() {
        return isIdcard;
    }

    public void setIsIdcard(String isIdcard) {
        this.isIdcard = isIdcard;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(BigDecimal availableAmount) {
        this.availableAmount = availableAmount;
    }

    public BigDecimal getNeedToPayNextMouth() {
        return needToPayNextMouth;
    }

    public void setNeedToPayNextMouth(BigDecimal needToPayNextMouth) {
        this.needToPayNextMouth = needToPayNextMouth;
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