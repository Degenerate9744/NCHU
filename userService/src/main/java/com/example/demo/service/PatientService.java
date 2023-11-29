package com.example.demo.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.domain.Patient;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.query.PatientQuery;

/**
* @author h
* @description 针对表【tb_patient】的数据库操作Service
* @createDate 2023-11-27 14:24:16
*/
public interface PatientService extends IService<Patient> {
    Page<Patient> selectPage(PatientQuery patientQuery);
}
