package com.example.spider.alipay.mapper;

import com.example.spider.alipay.entity.AlipayChargeAccount;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: WangNan
 * Email：nan.wang@htouhui.com
 * Date: 2017-12-27
 * Time: 下午1:12
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AlipayChargeAccountMapperTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private AlipayChargeAccountMapper alipayChargeAccountMapper;

    @Test
    public void insert() {
        AlipayChargeAccount chargeAccount = AlipayChargeAccount.builder()
                .userId(1001L)
                .chargeItem("phone")
                .area("beijing")
                .chargeUnit("中国联通")
                .chargeAccount("test")
                .chargeNumber("13333333333")
                .chargeReminder("reminder")
                .build();

        int insert = alipayChargeAccountMapper.insert(chargeAccount);
        assertEquals(1, insert);
    }
}