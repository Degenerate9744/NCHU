package com.example.demo.mapper;

import com.example.demo.entity.domain.NurseLevel;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author h
* @description 针对表【tb_nurse_level】的数据库操作Mapper
* @createDate 2023-11-29 20:34:45
* @Entity com.example.demo.entity.domain.NurseLevel
*/
@Mapper
public interface NurseLevelMapper extends BaseMapper<NurseLevel> {

}




