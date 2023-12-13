package com.example.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.feign.UserServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName：ReservationFront
 * @Author：Acmsdy
 * @Date：2023-12-10 21:11
 * @Describe：
 */
@EnableFeignClients(basePackages = {"com.example.demo.feign"})
@EnableDiscoveryClient
@Controller
@RequestMapping("/reservationFront")
@ComponentScan("com.example.demo")
public class ReservationFrontController {
    @Autowired
    private UserServiceFeign userServiceFeign;
    @ResponseBody
    @RequestMapping("/first")
    public Page<Object> first(Integer pageNum,Integer pageSize){
        Page<Object> first = userServiceFeign.departmentCategoriesList(pageNum,pageSize);
        return first;
    }
    @ResponseBody
    @RequestMapping("/second")
    public Page<Object> second(Integer pageNum,Integer pageSize,String id){
        Page<Object> second = userServiceFeign.departmentList(pageNum,pageSize,id);
        return second;
    }
    @ResponseBody
    @RequestMapping("/fourth")
    public Page<Object> fourth(Integer pageNum,Integer pageSize,String id){
        Page<Object> fourth = userServiceFeign.doctorList(pageNum,pageSize,id);
        return fourth;
    }
}
