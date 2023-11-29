package com.example.demo.mapper;

import com.example.demo.entity.domain.Nurse;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author h
* @description 针对表【tb_nurse】的数据库操作Mapper
* @createDate 2023-11-28 14:43:57
* @Entity com.example.demo.entity.domain.Nurse
*/
@Mapper
public interface NurseMapper extends BaseMapper<Nurse> {

}




