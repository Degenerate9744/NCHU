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
@FeignClient(value = "service123" ,fallback = Service1FeignHandler.class)
@LoadBalancerClient("service123")
public interface Service1Feign {
    @RequestMapping("/service/feignTest")
    String feignTest();
}
