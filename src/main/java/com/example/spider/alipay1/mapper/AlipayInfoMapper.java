package com.example.spider.alipay1.mapper;

import com.example.spider.alipay1.entity.AlipayInfo;
import com.example.spider.alipay1.entity.AlipayInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlipayInfoMapper {
    long countByExample(AlipayInfoExample example);

    int deleteByExample(AlipayInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AlipayInfo record);

    int insertSelective(AlipayInfo record);

    List<AlipayInfo> selectByExample(AlipayInfoExample example);

    AlipayInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AlipayInfo record, @Param("example") AlipayInfoExample example);

    int updateByExample(@Param("record") AlipayInfo record, @Param("example") AlipayInfoExample example);

    int updateByPrimaryKeySelective(AlipayInfo record);

    int updateByPrimaryKey(AlipayInfo record);
}