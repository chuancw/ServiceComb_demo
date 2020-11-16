package com.wangchuan.cloud.demo.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {
	int getCount();
}
