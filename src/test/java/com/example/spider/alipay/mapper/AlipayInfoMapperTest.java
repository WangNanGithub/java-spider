package com.example.spider.alipay.mapper;

import com.example.spider.alipay.entity.AlipayInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: WangNan
 * Email：nan.wang@htouhui.com
 * Date: 2017-12-27
 * Time: 下午1:18
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AlipayInfoMapperTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private AlipayInfoMapper alipayInfoMapper;

    @Test
    public void insert() {
        AlipayInfo alipayInfo = AlipayInfo.builder()
                .userId(1001L)
                .loginName("test")
                .realName("test")
                .idCard("1234567891234567890")
                .email("1234567@qq.com")
                .phone("13333333333")
                .taobaoName("test")
                .registerDate("2017-11-11")
                .isRealName("yes")
                .isProtected("yes")
                .isPhone("yes")
                .secretLevel("high")
                .balance(new BigDecimal("1000.00"))
                .income(new BigDecimal("1000.00"))
                .isIdcard("yes")
                .amount(new BigDecimal("1000.00"))
                .totalAmount(new BigDecimal("1000.00"))
                .needToPayNextMouth(new BigDecimal("1000.00"))
                .build();

        int insert = alipayInfoMapper.insert(alipayInfo);
        assertEquals(1, insert);
    }
}