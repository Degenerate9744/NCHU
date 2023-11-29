package com.example.demo.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.domain.Time;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.query.TimeQuery;

/**
* @author h
* @description 针对表【tb_time】的数据库操作Service
* @createDate 2023-11-28 20:42:34
*/
public interface TimeService extends IService<Time> {
    public Page<Time> selectPage(TimeQuery timeQuery);
}
