package com.example.demo.feign;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName：Service1Feign
 * @Author：Acmsdy
 * @Date：2023-11-05 20:41
 * @Describe：
 */
//@Service
@FeignClient(value = "userService")
@LoadBalancerClient("userService")
public interface Service1Feign {
    @RequestMapping("/admin/test")
    String feignTest();
}
