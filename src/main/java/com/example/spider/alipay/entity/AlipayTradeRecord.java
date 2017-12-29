package com.example.spider.alipay.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
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
public class AlipayTradeRecord implements Serializable {

    private static final long serialVersionUID = -8398916262250917897L;
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
    private Date payTime;

    /**
     * 交易名称
     */
    private String tradeType;

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
