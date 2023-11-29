package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.common.util.HospitalUtil;
import com.example.demo.entity.domain.Nurse;
import com.example.demo.entity.domain.Nurse;
import com.example.demo.entity.query.NurseQuery;
import com.example.demo.entity.query.NurseQuery;
import com.example.demo.service.NurseService;
import com.example.demo.mapper.NurseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author h
* @description 针对表【tb_nurse】的数据库操作Service实现
* @createDate 2023-11-28 14:43:57
*/
@Service
public class NurseServiceImpl extends ServiceImpl<NurseMapper, Nurse> implements NurseService{
    @Autowired
    private NurseMapper nurseMapper;
    @Override
    public Page<Nurse> selectPage(NurseQuery nurseQuery) {
        if (nurseQuery == null) {
            nurseQuery = new NurseQuery();
        }
        //设置分页信息
        Page<Nurse> page = Page.of(nurseQuery.getPageNum(),nurseQuery.getPageSize());
        QueryWrapper<Nurse> queryWrapper = HospitalUtil.generateQueryWrapper(nurseQuery);
        //查询数据
        Page<Nurse> nursePage = nurseMapper.selectPage(page, queryWrapper);
        return nursePage;
    }
}




