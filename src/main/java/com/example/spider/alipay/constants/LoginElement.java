package com.example.spider.alipay.constants;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: WangNan
 * Email：nan.wang@htouhui.com
 * Date: 2017-12-27
 * Time: 下午1:58
 */
public interface LoginElement {

    /**
     * 登陆页元素
     */
    String LOGIN_URL = "https://authzui.alipay.com/login/index.htm";// 登陆页面 URL

    String LOGIN_XPATH = "//*[@id=\"J-loginMethod-tabs\"]/li[2]";   // 账密登陆
    String LOGIN_ACCOUNT_ID = "J-input-user";                       // 账号输入框
    String LOGIN_PASSWORD_ID = "password_rsainput";                 // 密码输入框
    String LOGIN_SUBMIT_ID = "J-login-btn";                         // 登陆按钮

}
