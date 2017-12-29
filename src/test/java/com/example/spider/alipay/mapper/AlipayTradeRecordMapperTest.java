package com.example.spider.alipay.mapper;

import com.example.spider.alipay.entity.AlipayTradeRecord;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;

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
public class AlipayTradeRecordMapperTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private AlipayTradeRecordMapper alipayTradeRecordMapper;

    @Test
    public void insert() {
        AlipayTradeRecord alipayTradeRecord = AlipayTradeRecord.builder()
                .userId(1001L)
                .payTime(new Date())
                .tradeType("手机充值")
                .tradeNo("1234567890")
                .receiverName("test")
                .amount(new BigDecimal("100.00"))
                .status("success")
                .tradeDetailUrl("http://www.test.com")
                .build();

        int insert = alipayTradeRecordMapper.insert(alipayTradeRecord);
        assertEquals(1, insert);

    }
}