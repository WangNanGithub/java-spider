package com.example.spider.alipay.mapper;

import com.example.spider.alipay.entity.AlipayBankCard;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AlipayBankCardMapper {

    int insert(AlipayBankCard record);

}