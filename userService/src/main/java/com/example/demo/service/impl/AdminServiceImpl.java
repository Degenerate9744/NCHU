package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.common.util.HospitalUtil;
import com.example.demo.entity.domain.Admin;
import com.example.demo.entity.domain.Admin;
import com.example.demo.entity.query.AdminQuery;
import com.example.demo.mapper.AdminMapper;
import com.example.demo.service.AdminService;
import com.example.demo.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author h
* @description 针对表【tb_admin】的数据库操作Service实现
* @createDate 2023-11-28 14:53:11
*/
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService{
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public Page<Admin> selectPage(AdminQuery adminQuery) {
        if (adminQuery == null) {
            adminQuery = new AdminQuery();
        }
        //设置分页信息
        Page<Admin> page = Page.of(adminQuery.getPageNum(),adminQuery.getPageSize());
        QueryWrapper<Admin> queryWrapper = HospitalUtil.generateQueryWrapper(adminQuery);
        //查询数据
        Page<Admin> adminPage = adminMapper.selectPage(page, queryWrapper);
        return adminPage;
    }
}




