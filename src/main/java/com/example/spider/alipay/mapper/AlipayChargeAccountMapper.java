package com.example.spider.alipay.mapper;

import com.example.spider.alipay.entity.AlipayChargeAccount;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AlipayChargeAccountMapper {

    int insert(AlipayChargeAccount record);

}