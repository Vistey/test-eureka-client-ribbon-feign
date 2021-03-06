package com.example.demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 创建一个Feign的客户端接口定义
 * 使用@FeignClient注解来指定这个接口所要调用的服务名称
 * 接口中定义的各个函数使用Spring MVC的注解就可以来绑定服务提供方的REST接口
 */
@FeignClient("test-eureka-client")
public interface DcClient {

  /**
   * 绑定test-eureka-client服务的/dc接口
   */
  @GetMapping("/dc")
  String consumer();
}
