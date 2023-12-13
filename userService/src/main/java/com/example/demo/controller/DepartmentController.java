package com.example.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.domain.Admin;
import com.example.demo.entity.domain.Department;
import com.example.demo.entity.query.AdminQuery;
import com.example.demo.entity.query.DepartmentQuery;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName：DepartmentController
 * @Author：Acmsdy
 * @Date：2023-12-11 16:46
 * @Describe：
 */
@EnableDiscoveryClient
@Controller
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @ResponseBody
    @RequestMapping("/list")
    public Page<Department> list(DepartmentQuery departmentQuery){
        Page<Department> departmentPage = departmentService.selectPage(departmentQuery);
        return departmentPage;
    }
}
