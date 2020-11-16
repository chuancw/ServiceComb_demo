package com.wangchuan.cloud.demo.service;

import com.wangchuan.cloud.demo.dao.StudentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DemoServiceImpl implements DemoService {

	@Resource
	private StudentMapper studentMapper;

	@Override
	public int getValue() {
		return studentMapper.getCount();
	}
}
