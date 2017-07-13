package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 通过feign客户端来调用服务提供方的接口
 */
@RestController
public class DcController {

  private DcClient dcClient;

  @GetMapping("/consumer")
  public String dc(){
    return dcClient.consumer();
  }

  @Autowired
  public DcController(DcClient dcClient) {
    this.dcClient = dcClient;
  }
}
