package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.common.util.HospitalUtil;
import com.example.demo.entity.domain.Patient;
import com.example.demo.entity.query.PatientQuery;
import com.example.demo.service.PatientService;
import com.example.demo.mapper.PatientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
* @author h
* @description 针对表【tb_patient】的数据库操作Service实现
* @createDate 2023-11-27 14:24:16
*/
@Service
public class PatientServiceImpl extends ServiceImpl<PatientMapper, Patient> implements PatientService{
    @Autowired
    private PatientMapper patientMapper;
    @Override
    public Page<Patient> selectPage(PatientQuery patientQuery) {
        if (patientQuery == null) {
            patientQuery = new PatientQuery();
        }
        //设置分页信息
        Page<Patient> page = Page.of(patientQuery.getPageNum(),patientQuery.getPageSize());
        QueryWrapper<Patient> queryWrapper = HospitalUtil.generateQueryWrapper(patientQuery);
        //查询数据
        Page<Patient> patientPage = patientMapper.selectPage(page, queryWrapper);
        return patientPage;
    }
}




