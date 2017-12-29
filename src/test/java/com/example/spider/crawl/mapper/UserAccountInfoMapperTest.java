package com.example.spider.crawl.mapper;

import com.example.spider.crawl.entity.CrawlType;
import com.example.spider.crawl.entity.UserAccount;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: WangNan
 * Email：nan.wang@htouhui.com
 * Date: 2017-12-29
 * Time: 下午4:29
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserAccountInfoMapperTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private UserAccountInfoMapper userAccountInfoMapper;

    @Test
    @Commit
    public void insert() {
        UserAccount account = UserAccount.builder()
                .userId(1001L)
                .type(CrawlType.ZHI_FU_BAO)
                .username("test")
                .password("test")
                .build();
        int insert = userAccountInfoMapper.insert(account);
        assertEquals(1, insert);

        UserAccount userAccount = userAccountInfoMapper.findByUserIdAndType(1001L, CrawlType.ZHI_FU_BAO);
        assertEquals("test", userAccount.getUsername());
        assertEquals("test", userAccount.getPassword());
    }
}