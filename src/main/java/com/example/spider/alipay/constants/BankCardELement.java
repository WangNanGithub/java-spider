package com.example.spider.alipay.constants;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: WangNan
 * Email：nan.wang@htouhui.com
 * Date: 2017-12-27
 * Time: 下午2:31
 */
public interface BankCardELement {

    /**
     * 绑定的银行卡
     */
    String BANK_CARD_URL = "https://zht.alipay.com/asset/bankList.htm";             // 银行卡页地址

    String BANK_CARD_ALL_CLASS = "J-card-box";                                      // 所有银行卡
    String BANK_CARD_ALL_XPATH = "//*[@id=\"container\"]/div[1]/div[1]/div";        // 所有银行卡
    String BANK_CARD_CLASS = "card-box";                                            // 单张银行卡
    String BANK_CARD_XPATH = "//*[@class=\"card-box\"]";                                            // 单张银行卡
    String BANK_CARD_NAME_CLASS = "bank-name";                                      // 银行名称
    String BANK_CARD_LAST_NUM_CLASS = "bank-num4";                                  // 银行卡号后4位
    String BANK_CARD_TYPE_CLASS = "card-type";                                      // 银行卡类型([class] card-type-DC:储蓄卡, card-type-CC:信用卡)
    String BANK_CARD_ACTIVE_SELECTOR = "div.express-status > span:nth-child(2)";    // 是否开通快捷支付
    String BANK_CARD_MANAGE_CLASS = "div.express-else > a";                         // 银行卡管理

    // 跳转到单张银行卡详情页
    String BANK_CARD_USER_NAME_XPATH = "//*[@id=\"container\"]/div[1]/div[1]/div/div[1]/div[1]/div";    // 持卡人姓名
    String BANK_CARD_PHONE_XPATH = "//*[@id=\"container\"]/div[1]/div[1]/div/div[3]/div/div[3]/span";   // 银行预留手机号
    String BANK_CARD_ACTIVE_DATE_XPATH = "//*[@id=\"container\"]/div[1]/div[1]/div/div[3]/div/div[4]"; // 快捷支付开通日

}