package com.htouhui.loan.large.order;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class Order implements Serializable {
    /**
     * 订单 ID
     */
    private Long id;

    /**
     * 用户 ID
     */
    private Long userId;

    /**
     * 用户申请金额
     */
    private BigDecimal requestAmount;

    /**
     * 用户申请期限
     */
    private Integer requestPeriod;

    /**
     * 用户申请期限单位，0：天，1：月，2：年
     */
    private Integer requestPeriodUnit;

    /**
     * 用户申请期数
     */
    private Integer requestNo;

    /**
     * 用户申请利率
     */
    private BigDecimal requestRate;

    /**
     * 最终审批金额
     */
    private BigDecimal amount;

    /**
     * 最终审批期限
     */
    private Integer period;

    /**
     * 最终审批期限单位，0：天，1：月，2：年
     */
    private Integer periodUnit;

    /**
     * 最终审批期数
     */
    private Integer no;

    /**
     * 最终审批利率
     */
    private BigDecimal rate;

    /**
     * 订单状态
     */
    private Integer status;

    /**
     * 放款日期
     */
    private Date loanDate;

    /**
     * 是否逾期, 0-逾期, 1-未逾期
     */
    private Byte due;

    /**
     * 成功借款次数
     */
    private Integer isReloan;

    /**
     * 已还期数
     */
    private Integer repaymentNo;

    /**
     * 审核人
     */
    private String clerk;

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

    public BigDecimal getRequestAmount() {
        return requestAmount;
    }

    public void setRequestAmount(BigDecimal requestAmount) {
        this.requestAmount = requestAmount;
    }

    public Integer getRequestPeriod() {
        return requestPeriod;
    }

    public void setRequestPeriod(Integer requestPeriod) {
        this.requestPeriod = requestPeriod;
    }

    public Integer getRequestPeriodUnit() {
        return requestPeriodUnit;
    }

    public void setRequestPeriodUnit(Integer requestPeriodUnit) {
        this.requestPeriodUnit = requestPeriodUnit;
    }

    public Integer getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(Integer requestNo) {
        this.requestNo = requestNo;
    }

    public BigDecimal getRequestRate() {
        return requestRate;
    }

    public void setRequestRate(BigDecimal requestRate) {
        this.requestRate = requestRate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Integer getPeriodUnit() {
        return periodUnit;
    }

    public void setPeriodUnit(Integer periodUnit) {
        this.periodUnit = periodUnit;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public Byte getDue() {
        return due;
    }

    public void setDue(Byte due) {
        this.due = due;
    }

    public Integer getIsReloan() {
        return isReloan;
    }

    public void setIsReloan(Integer isReloan) {
        this.isReloan = isReloan;
    }

    public Integer getRepaymentNo() {
        return repaymentNo;
    }

    public void setRepaymentNo(Integer repaymentNo) {
        this.repaymentNo = repaymentNo;
    }

    public String getClerk() {
        return clerk;
    }

    public void setClerk(String clerk) {
        this.clerk = clerk;
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