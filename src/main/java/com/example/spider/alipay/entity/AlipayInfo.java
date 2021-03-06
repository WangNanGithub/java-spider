package com.example.spider.alipay.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 支付宝账户信息
 *
 * @author wangnan
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AlipayInfo {

    /**
     * ID
     */
    private Long id;

    /**
     * 用户ID
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
     * 注册日期
     */
    private String regTime;

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
    private String balance;

    /**
     * 余额宝总收入
     */
    private BigDecimal income;

    /**
     * 是否身份证认证
     */
    private String isIdCard;

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

}
