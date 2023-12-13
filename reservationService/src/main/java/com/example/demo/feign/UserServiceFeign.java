package com.example.demo.feign;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName：Service1Feign
 * @Author：Acmsdy
 * @Date：2023-11-05 20:41
 * @Describe：
 */
//@Service

@FeignClient(value = "userService")
@LoadBalancerClient("userService")
public interface UserServiceFeign {
    @RequestMapping("/departmentCategories/list")
    Page<Object> departmentCategoriesList(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize);
    @RequestMapping("/department/list")
    Page<Object> departmentList(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize,@RequestParam("departmentCategoriesId") String departmentCategoriesId);
    @RequestMapping("/doctor/list")
    Page<Object> doctorList(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize,@RequestParam("departmentId") String departmentId);
    @RequestMapping("/doctor/select")
    String doctorNameSelectById(@RequestParam("doctorId") String doctorId);
    @RequestMapping("/patient/select")
    String patientNameSelectById(@RequestParam("patientId") String patientId);
}
