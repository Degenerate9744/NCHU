package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.domain.PatientType;
import com.example.demo.service.PatientTypeService;
import com.example.demo.mapper.PatientTypeMapper;
import org.springframework.stereotype.Service;

/**
* @author h
* @description 针对表【tb_patient_type】的数据库操作Service实现
* @createDate 2023-11-29 20:55:34
*/
@Service
public class PatientTypeServiceImpl extends ServiceImpl<PatientTypeMapper, PatientType>
    implements PatientTypeService{

}




