package com.wangchuan.cloud;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Springboot启动类
 */
@SpringBootApplication
@EnableServiceComb  // serviceComb服务注册
public class ProviderServiceApplication {
	public static void main(String[] args) {
        SpringApplication.run(ProviderServiceApplication.class, args);
	}
}
