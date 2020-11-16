package com.wangchuan.cloud;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Springboot启动类
 */
@SpringBootApplication
@EnableServiceComb
public class ConsumerApplication {
	public static void main(String[] args) {
		List<Integer> result= new ArrayList<>();
		SpringApplication.run(ConsumerApplication.class, args);
	}
}