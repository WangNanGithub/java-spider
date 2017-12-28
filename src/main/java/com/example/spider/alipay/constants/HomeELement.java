package com.example.spider.alipay.constants;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: WangNan
 * Email：nan.wang@htouhui.com
 * Date: 2017-12-27
 * Time: 下午1:59
 */
public interface HomeELement {

    /**
     * 登陆后首页元素
     */
    String INDEX_URL = "https://my.alipay.com/portal/i.htm";                                            // 支付宝首页 URL

    /* 账户名 */
    String LOGIN_NAME_XPATH = "//*[@id=\"J-userInfo-account-userEmail\"]";                              // 登陆名

    /* 余额 */
    String SHOW_BALANCE_XPATH = "//*[@id=\"J-assets-balance\"]/div[2]/div/i";                           // 显示余额按钮
    String BALANCE_XPATH = "//*[@id=\"J-assets-balance\"]/div[1]/div/div[2]/div/strong";                // 余额

    /* 余额宝 */
    String SHOW_YEB_XPATH = "//*[@id=\"J-assets-mfund\"]/div[2]/div[1]/i";                              // 显示余额宝金额按钮
    String YEB_XPATH = "//*[@id=\"J-assets-mfund-amount\"]/strong";                                     // 余额宝
    String YEB_INCOME_ID = "J-income-num";                                                              // 余额宝总收益

    /* 花呗 */
    String HB_AMOUNT_XPATH = "//*[@id=\"J-assets-pcredit\"]/div/div/div[2]/div/p[2]/strong";            // 花呗总额度
    String HB_REST_AMOUNT_XPATH = "//*[@id=\"J-assets-pcredit\"]/div/div/div[2]/div/p[1]/span/strong";  // 花呗剩余额度
    String HB_NEXT_MOUTH_NEED_TO_PAY_XPATH = "";                                                        // 花呗下期需还

    // 账户设置
    String ACCOUNT_SET_XPATH = "//*[@id=\"globalContainer\"]/div[2]/div/div[2]/ul/li[3]/a";             // 账户设置超链接
    String ACCOUNT_SET_URL= "https://my.alipay.com/portal/account/index.htm";                           // 账户设置地址

    // 银行卡
    String BANK_CARD_XPATH= "//*[@id=\"J-assets-other-zht\"]/ul/li[1]/span/a";                          // 银行卡管理
    String BANK_CARD_URL= "https://zht.alipay.com/asset/bankList.htm";                                  // 银行卡管理 URL
}
