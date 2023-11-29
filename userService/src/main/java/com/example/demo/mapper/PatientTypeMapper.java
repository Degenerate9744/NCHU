package com.example.demo.mapper;

import com.example.demo.entity.domain.PatientType;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author h
* @description 针对表【tb_patient_type】的数据库操作Mapper
* @createDate 2023-11-29 20:55:34
* @Entity com.example.demo.entity.domain.PatientType
*/
@Mapper
public interface PatientTypeMapper extends BaseMapper<PatientType> {

}




