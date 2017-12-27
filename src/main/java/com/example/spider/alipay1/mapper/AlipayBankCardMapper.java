package com.example.spider.alipay1.mapper;

import com.example.spider.alipay1.entity.AlipayBankCard;
import com.example.spider.alipay1.entity.AlipayBankCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlipayBankCardMapper {
    long countByExample(AlipayBankCardExample example);

    int deleteByExample(AlipayBankCardExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AlipayBankCard record);

    int insertSelective(AlipayBankCard record);

    List<AlipayBankCard> selectByExample(AlipayBankCardExample example);

    AlipayBankCard selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AlipayBankCard record, @Param("example") AlipayBankCardExample example);

    int updateByExample(@Param("record") AlipayBankCard record, @Param("example") AlipayBankCardExample example);

    int updateByPrimaryKeySelective(AlipayBankCard record);

    int updateByPrimaryKey(AlipayBankCard record);
}