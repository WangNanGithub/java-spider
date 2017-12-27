package com.example.spider.alipay.mapper;

import com.example.spider.alipay.entity.AlipayList;
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
 * Time: 下午1:27
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AlipayListMapperTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private AlipayListMapper alipayListMapper;

    @Test
    public void insert() {
        AlipayList alipayList = AlipayList.builder()
                .userId(1001L)
                .payTime(System.currentTimeMillis())
                .tradeType("手机充值")
                .tradeNoType("中国联通")
                .tradeNo("1234567890")
                .receiverName("test")
                .amount(new BigDecimal("100.00"))
                .status("success")
                .source("taobao")
                .alipayName("test")
                .tradeClassification("test")
                .tradeDetailUrl("http://www.test.com")
                .build();

        int insert = alipayListMapper.insert(alipayList);
        assertEquals(1, insert);

    }
}