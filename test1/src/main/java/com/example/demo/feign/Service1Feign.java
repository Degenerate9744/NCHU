package com.example.demo.feign;

import com.example.demo.feign.handler.Service1FeignHandler;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName：Service1Feign
 * @Author：Acmsdy
 * @Date：2023-11-05 20:41
 * @Describe：
 */
//@Service
@FeignClient(value = "userService" ,fallback = Service1FeignHandler.class)
@LoadBalancerClient("userService")
public interface Service1Feign {
    @RequestMapping("/admin/feignTest")
    String feignTest();
}
