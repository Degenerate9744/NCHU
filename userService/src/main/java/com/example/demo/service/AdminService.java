package com.example.demo.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.domain.Admin;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.domain.Admin;
import com.example.demo.entity.query.AdminQuery;

/**
* @author h
* @description 针对表【tb_admin】的数据库操作Service
* @createDate 2023-11-28 14:53:11
*/
public interface AdminService extends IService<Admin> {
    Page<Admin> selectPage(AdminQuery adminQuery);
}
