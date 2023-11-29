package com.example.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.domain.Nurse;
import com.example.demo.entity.query.NurseQuery;
import com.example.demo.service.NurseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName：NurseController
 * @Author：Acmsdy
 * @Date：2023-11-28 14:50
 * @Describe：
 */
@EnableDiscoveryClient
@Controller
@RequestMapping("/nurse")
public class NurseController {
    @Autowired
    private NurseService nurseService;


    @ResponseBody
    @RequestMapping("/list")
    public Page<Nurse> list(NurseQuery nurseQuery){
        Page<Nurse> nursePage = nurseService.selectPage(nurseQuery);
        return nursePage;
    }
    @ResponseBody
    @RequestMapping("/insert")
    public boolean insert(Nurse nurse){
        return nurseService.save(nurse);
    }
    @ResponseBody
    @RequestMapping("/delete")
    public boolean delete(String id){
        return nurseService.removeById(id);
    }
    @ResponseBody
    @RequestMapping("/update")
    public boolean update(Nurse nurse){
        return nurseService.updateById(nurse);
    }
}
