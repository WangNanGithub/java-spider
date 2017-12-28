package com.example.spider.alipay.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 支付宝绑卡信息
 *
 * @author wangnan
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AlipayBankCard implements Serializable {

    private static final long serialVersionUID = -1826148112176258071L;
    /**
     * ID
     */
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
     * 银行预留手机号
     */
    private String mobile;

    /**
     * 快捷支付开通日期
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

}
