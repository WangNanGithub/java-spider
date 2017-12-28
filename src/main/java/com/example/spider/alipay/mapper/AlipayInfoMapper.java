package com.example.spider.alipay.mapper;

import com.example.spider.alipay.entity.AlipayInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AlipayInfoMapper {

    int insert(AlipayInfo alipayInfo);

}