package com.example.spider.alipay.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 支付宝缴费信息
 *
 * @author wangnan
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AlipayChargeAccount implements Serializable {

    private static final long serialVersionUID = 746888954168456867L;
    /**
     * ID
     */
    private Long id;

    /**
     * 用户ID
     */
    private Long userId;

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

}
