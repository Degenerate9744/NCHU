package com.example.demo.mapper;

import com.example.demo.entity.domain.Patient;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author h
* @description 针对表【tb_patient】的数据库操作Mapper
* @createDate 2023-11-27 14:24:16
* @Entity com.example.demo.entity.domain.Patient
*/
@Mapper
public interface PatientMapper extends BaseMapper<Patient> {

}




