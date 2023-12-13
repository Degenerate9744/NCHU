package com.example.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.domain.Admin;
import com.example.demo.entity.domain.DepartmentCategories;
import com.example.demo.entity.query.AdminQuery;
import com.example.demo.entity.query.DepartmentCategoriesQuery;
import com.example.demo.service.DepartmentCategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName：DepartmentCategoriesController
 * @Author：Acmsdy
 * @Date：2023-12-11 16:46
 * @Describe：
 */
@EnableDiscoveryClient
@Controller
@RequestMapping("/departmentCategories")
public class DepartmentCategoriesController {
    @Autowired
    private DepartmentCategoriesService departmentCategoriesService;
    @ResponseBody
    @RequestMapping("/list")
    public Page<DepartmentCategories> list(DepartmentCategoriesQuery departmentCategoriesQuery){
        Page<DepartmentCategories> departmentCategoriesPage = departmentCategoriesService.selectPage(departmentCategoriesQuery);
        return departmentCategoriesPage;
    }
}
