package com.wangchuan.cloud.controller;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestSchema(schemaId = "providerController")
@RequestMapping("/")
public class ProviderController {

	@GetMapping("provider/{id}")
	public String getRequestId(@PathVariable("id") String id) {
		return "response 200, request id: " + id;
	}
}
