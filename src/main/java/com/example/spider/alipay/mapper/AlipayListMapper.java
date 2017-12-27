package com.example.spider.alipay.mapper;

import com.example.spider.alipay.entity.AlipayList;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AlipayListMapper {

    int insert(AlipayList record);

}