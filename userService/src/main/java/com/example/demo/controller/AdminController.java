package com.example.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.domain.Admin;
import com.example.demo.entity.query.AdminQuery;
import com.example.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName：AdminController
 * @Author：Acmsdy
 * @Date：2023-11-28 14:56
 * @Describe：
 */
@EnableDiscoveryClient
@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @ResponseBody
    @RequestMapping("/test")
    public String test(){
        return "test successful!";
    }
    @ResponseBody
    @RequestMapping("/list")
    public Page<Admin> list(AdminQuery adminQuery){
        Page<Admin> adminPage = adminService.selectPage(adminQuery);
        return adminPage;
    }
    @ResponseBody
    @RequestMapping("/insert")
    public boolean insert(Admin admin){
        return adminService.save(admin);
    }
    @ResponseBody
    @RequestMapping("/delete")
    public boolean delete(String id){
        return adminService.removeById(id);
    }
    @ResponseBody
    @RequestMapping("/update")
    public boolean update(Admin admin){
        return adminService.updateById(admin);
    }
    @ResponseBody
    @RequestMapping("/feignTest")
    public String feignTest(){
        return "test ok";
    }

}
