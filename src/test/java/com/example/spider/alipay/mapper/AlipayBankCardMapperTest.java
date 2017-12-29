package com.example.spider.alipay.mapper;

import com.example.spider.alipay.entity.AlipayBankCard;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: WangNan
 * Email：nan.wang@htouhui.com
 * Date: 2017-12-27
 * Time: 上午11:31
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AlipayBankCardMapperTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private AlipayBankCardMapper alipayBankCardMapper;

    @Test
    public void insert() {
        AlipayBankCard alipayBankCard = AlipayBankCard.builder()
                .userId(1001L)
                .cardLastNum("1001")
                .openStatus("yes")
                .bankName("ABC")
                .cardType("储蓄卡")
                .mobile("133****3333")
                .activeDate(new Date())
                .showUserName("test")
                .build();

        int insert = alipayBankCardMapper.insert(alipayBankCard);
        assertEquals(1, insert);
    }

}