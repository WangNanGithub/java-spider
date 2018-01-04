package com.example.spider;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: WangNan
 * Email：nan.wang@htouhui.com
 * Date: 2018-01-02
 * Time: 下午6:37
 */
public class AppTest {

    @Test
    public void test() throws Exception {
        for (int i = 0; i <= 1024; i++) {
            if ((i & -i) == i) {
                System.out.println(i);
            }
        }
    }

}
