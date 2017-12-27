package com.example.spider.alipay.constants.element;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: WangNan
 * Email：nan.wang@htouhui.com
 * Date: 2017-12-27
 * Time: 下午2:18
 */
public interface AccountElement {

    /**
     * 账户设置页面
     */
    String ACCOUNT_URL = "https://custweb.alipay.com/account/index.htm";                        // 账户页面地址

    String REAL_NAME_XPATH = "//*[@id=\"username\"]";                                           // 真实姓名
    String ID_CARD_XPATH = "//*[@id=\"account-main\"]/div/table/tbody/tr[1]/td[1]/span[3]";     // 身份证
    String IS_REAL_NAME_XPATH = "//*[@id=\"account-main\"]/div/table/tbody/tr[1]/td[1]/span[4]";// 实名认证结果
    String EMAIL_XPATH = "//*[@id=\"account-main\"]/div/table/tbody/tr[2]/td[1]/span";          // 绑定邮箱
    String PHONE_XPATH = "//*[@id=\"account-main\"]/div/table/tbody/tr[3]/td[1]/span";          // 绑定手机
    String TB_NAME_XPATH = "//*[@id=\"account-main\"]/div/table/tbody/tr[4]/td[1]";             // 淘宝账号
    String REG_DATE_XPATH = "//*[@id=\"account-main\"]/div/table/tbody/tr[7]/td[1]";            // 注册时间
    String PROTECTED_XPATH = "//*[@id=\"account-main\"]/div/table/tbody/tr[11]/td[1]";          // 会员保障
}
