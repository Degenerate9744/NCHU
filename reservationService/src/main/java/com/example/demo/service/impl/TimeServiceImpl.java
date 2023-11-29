package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.common.util.HospitalUtil;
import com.example.demo.entity.domain.Time;
import com.example.demo.entity.query.TimeQuery;
import com.example.demo.service.TimeService;
import com.example.demo.mapper.TimeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author h
* @description 针对表【tb_time】的数据库操作Service实现
* @createDate 2023-11-28 20:42:34
*/
@Service
public class TimeServiceImpl extends ServiceImpl<TimeMapper, Time> implements TimeService{
    @Autowired
    private TimeMapper timeMapper;
    @Override
    public Page<Time> selectPage(TimeQuery timeQuery) {
        if (timeQuery == null) {
            timeQuery = new TimeQuery();
        }
        //设置分页信息
        Page<Time> page = Page.of(timeQuery.getPageNum(),timeQuery.getPageSize());
        QueryWrapper<Time> queryWrapper = HospitalUtil.generateQueryWrapper(timeQuery);
        //查询数据
        Page<Time> timePage = timeMapper.selectPage(page, queryWrapper);
        return timePage;
    }
}




