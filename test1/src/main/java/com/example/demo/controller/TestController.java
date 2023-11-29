package com.example.demo.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.nacos.api.annotation.NacosProperties;
import com.example.demo.feign.Service1Feign;
import com.example.demo.feign.handler.Service1FeignHandler;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName：TestController
 * @Author：Acmsdy
 * @Date：2023-11-03 21:20
 * @Describe：
 */
//@SpringBootApplication
@EnableFeignClients(basePackages = {"com.example.demo.feign"})
//@EnableFeignClients
@EnableDiscoveryClient
@Controller
@RequestMapping("/test")
@RefreshScope
@ComponentScan("com.example.demo")
public class TestController {

    @Autowired
    private Service1Feign s1;

    @Value("${student.name}")
    private String name;

    @ResponseBody
    @RequestMapping("/user")
    public String getUser(){
        String str = "大风起兮云飞扬";
        System.out.println(str);
        return str;
    }

    @ResponseBody
    @RequestMapping("/getConfig")
    public String getConfig(){
        System.out.println(name);
        return name;
    }

    @ResponseBody
    @RequestMapping("/testFeign")
    @SentinelResource(value = "/test/wrong",blockHandler = "testFeignBlockHandler",blockHandlerClass = TestController.class)
    public String testFeign(){
        System.out.println(s1.feignTest());
        return s1.feignTest();
    }
    @ResponseBody
    @RequestMapping("/wrong")
    public static String testFeignBlockHandler(BlockException e){
        String msg = "不好意思，前方拥挤，请您稍后再试";
        return msg;
    }

    //public static void main(String[] args) {
    //    SpringApplication.run(TestController.class, args);
    //}
}
