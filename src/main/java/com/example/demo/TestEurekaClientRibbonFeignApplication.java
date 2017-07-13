package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 通过@EnableFeignClients注解开启扫描Spring Cloud Feign客户端的功能
 */
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class TestEurekaClientRibbonFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestEurekaClientRibbonFeignApplication.class, args);
	}
}
