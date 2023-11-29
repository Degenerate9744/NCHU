package com.example.demo.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.domain.Nurse;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.domain.Patient;
import com.example.demo.entity.query.NurseQuery;
import com.example.demo.entity.query.PatientQuery;

/**
* @author h
* @description 针对表【tb_nurse】的数据库操作Service
* @createDate 2023-11-28 14:43:57
*/
public interface NurseService extends IService<Nurse> {
    Page<Nurse> selectPage(NurseQuery nurseQuery);
}
