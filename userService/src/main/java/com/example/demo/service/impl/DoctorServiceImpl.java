package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.common.util.HospitalUtil;
import com.example.demo.entity.domain.Doctor;
import com.example.demo.entity.query.DoctorQuery;
import com.example.demo.service.DoctorService;
import com.example.demo.mapper.DoctorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author h
* @description 针对表【tb_doctor】的数据库操作Service实现
* @createDate 2023-11-28 10:19:41
*/
@Service
public class DoctorServiceImpl extends ServiceImpl<DoctorMapper, Doctor> implements DoctorService{
    @Autowired
    private DoctorMapper doctorMapper;
    @Override
    public Page<Doctor> selectPage(DoctorQuery doctorQuery) {
        if (doctorQuery == null) {
            doctorQuery = new DoctorQuery();
        }
        //设置分页信息
        Page<Doctor> page = Page.of(doctorQuery.getPageNum(),doctorQuery.getPageSize());
        QueryWrapper<Doctor> queryWrapper = HospitalUtil.generateQueryWrapper(doctorQuery);
        //查询数据
        Page<Doctor> doctorPage = doctorMapper.selectPage(page, queryWrapper);
        return doctorPage;
    }
}




