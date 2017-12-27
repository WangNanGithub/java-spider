package com.example.spider.alipay.constants.element;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: WangNan
 * Email：nan.wang@htouhui.com
 * Date: 2017-12-27
 * Time: 下午5:37
 */
public interface TradeElement {

    /**
     * 交易记录
     */
    String TRADE_URL = "https://consumeprod.alipay.com/record/index.htm";

    String TRADE_TABLE_XPATH = "//*[@id=\"tradeRecordsIndex\"]/tbody";

    String TRADE_TYPE_CLASS = "img";                    // 分类
    String TRADE_DATE_CLASS = "time";                   // 交易时间

    String TRADE_NAME_CLASS = "name";
    String TRADE_DETAIL_TITLE_CLASS = "consume-title";  // 交易名称
    String TRADE_DETAIL_NO_CLASS = "J-tradeNo";         // 交易流水号
    String TRADE_DETAIL_NAME_CLASS = "name";            // 交易对方账户

    String TRADE_AMOUNT_CLASS = "amount";               // 交易金额
    String TRADE_DETAIL_CLASS = "detail";
    String TRADE_DETAIL_URL_CLASS = "icon-detail";      // 交易详情

    String TRADE_STATUS_CLASS = "status";               // 交易状态

}
