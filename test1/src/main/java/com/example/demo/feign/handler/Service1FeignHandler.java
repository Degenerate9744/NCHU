package com.example.demo.feign.handler;

import com.example.demo.feign.Service1Feign;
import org.springframework.stereotype.Component;

/**
 * @ClassName：Service1FeignHandler
 * @Author：Acmsdy
 * @Date：2023-11-12 16:17
 * @Describe：
 */
@Component
public class Service1FeignHandler implements Service1Feign {
    @Override
    public String feignTest() {
        String fallback = "测试熔断";
        return fallback;
    }
}
