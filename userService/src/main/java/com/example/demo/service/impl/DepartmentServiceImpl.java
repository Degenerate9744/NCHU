package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.common.util.HospitalUtil;
import com.example.demo.entity.domain.Department;
import com.example.demo.entity.domain.Department;
import com.example.demo.entity.query.DepartmentQuery;
import com.example.demo.mapper.DepartmentMapper;
import com.example.demo.service.DepartmentService;
import com.example.demo.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author h
* @description 针对表【tb_department】的数据库操作Service实现
* @createDate 2023-12-11 16:44:37
*/
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements DepartmentService{
    @Autowired
    private DepartmentMapper departmentMapper;
    @Override
    public Page<Department> selectPage(DepartmentQuery departmentQuery) {
        if (departmentQuery == null) {
            departmentQuery = new DepartmentQuery();
        }
        //设置分页信息
        Page<Department> page = Page.of(departmentQuery.getPageNum(),departmentQuery.getPageSize());
        QueryWrapper<Department> queryWrapper = HospitalUtil.generateQueryWrapper(departmentQuery);
        //查询数据
        Page<Department> departmentPage = departmentMapper.selectPage(page, queryWrapper);
        return departmentPage;
    }
}




