package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.common.util.HospitalUtil;
import com.example.demo.entity.domain.DepartmentCategories;
import com.example.demo.entity.domain.DepartmentCategories;
import com.example.demo.entity.query.DepartmentCategoriesQuery;
import com.example.demo.mapper.DepartmentCategoriesMapper;
import com.example.demo.service.DepartmentCategoriesService;
import com.example.demo.mapper.DepartmentCategoriesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author h
* @description 针对表【tb_department_categories】的数据库操作Service实现
* @createDate 2023-12-11 16:44:58
*/
@Service
public class DepartmentCategoriesServiceImpl extends ServiceImpl<DepartmentCategoriesMapper, DepartmentCategories> implements DepartmentCategoriesService{
    @Autowired
    private DepartmentCategoriesMapper departmentCategoriesMapper;
    @Override
    public Page<DepartmentCategories> selectPage(DepartmentCategoriesQuery departmentCategoriesQuery) {
        if (departmentCategoriesQuery == null) {
            departmentCategoriesQuery = new DepartmentCategoriesQuery();
        }
        //设置分页信息
        Page<DepartmentCategories> page = Page.of(departmentCategoriesQuery.getPageNum(),departmentCategoriesQuery.getPageSize());
        QueryWrapper<DepartmentCategories> queryWrapper = HospitalUtil.generateQueryWrapper(departmentCategoriesQuery);
        //查询数据
        Page<DepartmentCategories> departmentCategoriesPage = departmentCategoriesMapper.selectPage(page, queryWrapper);
        return departmentCategoriesPage;
    }
}




