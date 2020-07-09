package com.wangchuan.cloud.controller;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.apache.servicecomb.provider.springmvc.reference.RestTemplateBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@RestSchema(schemaId = "consumerController")
@RequestMapping("/")
public class ConsumerController {

	private final RestTemplate restTemplate = RestTemplateBuilder.create();

	private static final String SERVICE_NAME = "provider-service";

	@GetMapping("consumer/{id}")
	public String getRequestId(@PathVariable("id") String id) {
		String result = restTemplate.getForObject("cse://" + SERVICE_NAME + "/provider/" + id, String.class);
		return result;
	}
}