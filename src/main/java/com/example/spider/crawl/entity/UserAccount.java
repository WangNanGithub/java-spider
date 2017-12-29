package com.example.spider.crawl.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户账号信息
 * <p>
 * Created with IntelliJ IDEA.
 * Description:
 * User: WangNan
 * Email：nan.wang@htouhui.com
 * Date: 2017-12-29
 * Time: 下午4:01
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserAccount implements Serializable {

    private static final long serialVersionUID = -3276652862740939700L;
    /**
     * ID
     */
    private Long id;

    /**
     * 用户 ID
     */
    private Long userId;

    /**
     * 账户类型
     */
    private CrawlType type;

    /**
     * 账号名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
