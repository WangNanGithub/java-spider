package com.example.spider.crawl.mapper;

import com.example.spider.crawl.entity.CrawlType;
import com.example.spider.crawl.entity.UserAccount;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: WangNan
 * Email：nan.wang@htouhui.com
 * Date: 2017-12-29
 * Time: 下午4:08
 */
@Mapper
public interface UserAccountInfoMapper {

    @Select("SELECT username, password FROM pdl_user_account WHERE user_id = #{userId} AND type = #{type, typeHandler=org.apache.ibatis.type.EnumTypeHandler}")
    UserAccount findByUserIdAndType(@Param("userId") long userId, @Param("type") CrawlType type);

    @Insert("INSERT INTO pdl_user_account(user_id, type, username, password) VALUE(#{userId}, #{type, typeHandler=org.apache.ibatis.type.EnumTypeHandler}, #{username}, #{password})")
    int insert(UserAccount account);

}
