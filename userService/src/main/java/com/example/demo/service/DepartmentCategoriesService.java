package com.example.demo.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.domain.DepartmentCategories;
import com.example.demo.entity.domain.DepartmentCategories;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.query.DepartmentCategoriesQuery;

/**
* @author h
* @description 针对表【tb_department_categories】的数据库操作Service
* @createDate 2023-12-11 16:44:58
*/
public interface DepartmentCategoriesService extends IService<DepartmentCategories> {
    Page<DepartmentCategories> selectPage(DepartmentCategoriesQuery departmentCategoriesQuery);
}
