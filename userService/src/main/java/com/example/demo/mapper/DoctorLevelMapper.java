package com.example.demo.mapper;

import com.example.demo.entity.domain.DoctorLevel;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author h
* @description 针对表【tb_doctor_level】的数据库操作Mapper
* @createDate 2023-11-29 09:30:48
* @Entity com.example.demo.entity.domain.DoctorLevel
*/
@Mapper
public interface DoctorLevelMapper extends BaseMapper<DoctorLevel> {

}




