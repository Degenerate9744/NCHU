package com.example.demo.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.domain.Department;
import com.example.demo.entity.domain.Department;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.query.DepartmentQuery;

/**
* @author h
* @description 针对表【tb_department】的数据库操作Service
* @createDate 2023-12-11 16:44:37
*/
public interface DepartmentService extends IService<Department> {
    Page<Department> selectPage(DepartmentQuery departmentQuery);
}
