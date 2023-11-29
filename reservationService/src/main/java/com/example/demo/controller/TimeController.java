package com.example.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.domain.Time;
import com.example.demo.entity.query.TimeQuery;
import com.example.demo.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName：TimeController
 * @Author：Acmsdy
 * @Date：2023-11-28 20:49
 * @Describe：
 */
//@EnableFeignClients(basePackages = {"com.example.demo.feign"})
@EnableDiscoveryClient
@Controller
@RequestMapping("/time")
public class TimeController {
    @Autowired
    private TimeService timeService;

    @ResponseBody
    @RequestMapping("/list")
    public Page<Time> list(TimeQuery timeQuery){
        Page<Time> timePage = timeService.selectPage(timeQuery);
        return timePage;
    }
    @ResponseBody
    @RequestMapping("/insert")
    public boolean insert(Time time){
        return timeService.save(time);
    }
    @ResponseBody
    @RequestMapping("/delete")
    public boolean delete(String id){
        return timeService.removeById(id);
    }
    @ResponseBody
    @RequestMapping("/update")
    public boolean update(Time time){
        return timeService.updateById(time);
    }
}
