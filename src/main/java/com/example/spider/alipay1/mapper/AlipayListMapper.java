package com.example.spider.alipay1.mapper;

import com.example.spider.alipay1.entity.AlipayList;
import com.example.spider.alipay1.entity.AlipayListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlipayListMapper {
    long countByExample(AlipayListExample example);

    int deleteByExample(AlipayListExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AlipayList record);

    int insertSelective(AlipayList record);

    List<AlipayList> selectByExample(AlipayListExample example);

    AlipayList selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AlipayList record, @Param("example") AlipayListExample example);

    int updateByExample(@Param("record") AlipayList record, @Param("example") AlipayListExample example);

    int updateByPrimaryKeySelective(AlipayList record);

    int updateByPrimaryKey(AlipayList record);
}