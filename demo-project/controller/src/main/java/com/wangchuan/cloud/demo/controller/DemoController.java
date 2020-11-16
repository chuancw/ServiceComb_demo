package com.wangchuan.cloud.demo.controller;


import com.wangchuan.cloud.demo.service.DemoService;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

@RestSchema(schemaId = "demoController")
public class DemoController {

	@Resource
	private DemoService demoService;

	@GetMapping("demo/test")
	public int getValue() {
		return demoService.getValue();
	}
}