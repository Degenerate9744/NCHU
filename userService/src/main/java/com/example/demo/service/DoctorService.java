package com.example.demo.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.entity.domain.Doctor;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.domain.Doctor;
import com.example.demo.entity.query.DoctorQuery;

/**
* @author h
* @description 针对表【tb_doctor】的数据库操作Service
* @createDate 2023-11-28 10:19:41
*/
public interface DoctorService extends IService<Doctor> {
    Page<Doctor> selectPage(DoctorQuery doctorQuery);
}
