package com.example.spider.alipay.constants;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: WangNan
 * Email：nan.wang@htouhui.com
 * Date: 2017-12-27
 * Time: 下午2:59
 */
public interface ChargeElement {

    /**
     * 缴费
     */
    String CHARGE_URL = "https://jiaofei.alipay.com/market/chargeRemindInfoEntering.htm";       // 缴费页地址

    /**
     * 先遍历表单获取每一行
     * 再遍历每一行获取每一个单元格
     * td[0] : 缴费项目
     * td[1] : 地区
     * td[2] : 收费单位
     * td[3] : 户名
     * td[4] : 缴费号码
     * td[5] : 缴费提醒
     */
    String CHARGE_TABLE_XPATH = "//*[@id=\"container\"]/div[1]/div/div/div[3]/table/tbody";     // 缴费信息表单

}
