package com.example.spider.alipay.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;
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
@Alias("AlipayInfo")
public class AlipayInfo implements Serializable {

    private static final long serialVersionUID = -8874624992010623764L;

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
    private Date registerDate;

    /**
     * 是否实名认证
     */
    private String isRealName;

    /**
     * 是否会员保障
     */
    private String isProtected;

    /**
     * 账户余额
     */
    private BigDecimal balance;

    /**
     * 余额宝总收入
     */
    private BigDecimal income;

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
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
