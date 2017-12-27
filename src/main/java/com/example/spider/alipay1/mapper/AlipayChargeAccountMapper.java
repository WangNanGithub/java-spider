package com.example.spider.alipay1.mapper;

import com.example.spider.alipay1.entity.AlipayChargeAccount;
import com.example.spider.alipay1.entity.AlipayChargeAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlipayChargeAccountMapper {
    long countByExample(AlipayChargeAccountExample example);

    int deleteByExample(AlipayChargeAccountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AlipayChargeAccount record);

    int insertSelective(AlipayChargeAccount record);

    List<AlipayChargeAccount> selectByExample(AlipayChargeAccountExample example);

    AlipayChargeAccount selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AlipayChargeAccount record, @Param("example") AlipayChargeAccountExample example);

    int updateByExample(@Param("record") AlipayChargeAccount record, @Param("example") AlipayChargeAccountExample example);

    int updateByPrimaryKeySelective(AlipayChargeAccount record);

    int updateByPrimaryKey(AlipayChargeAccount record);
}