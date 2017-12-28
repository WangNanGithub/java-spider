package com.example.spider.alipay.mapper;

import com.example.spider.alipay.entity.AlipayTradeRecord;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AlipayTradeRecordMapper {

    int insert(AlipayTradeRecord record);

}