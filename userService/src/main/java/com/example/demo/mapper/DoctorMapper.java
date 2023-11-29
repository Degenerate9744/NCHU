package com.example.demo.mapper;

import com.example.demo.entity.domain.Doctor;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author h
* @description 针对表【tb_doctor】的数据库操作Mapper
* @createDate 2023-11-28 10:19:41
* @Entity com.example.demo.entity.domain.Doctor
*/
@Mapper
public interface DoctorMapper extends BaseMapper<Doctor> {

}




