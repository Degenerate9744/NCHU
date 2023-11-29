package com.example.demo.mapper;

import com.example.demo.entity.domain.Time;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author h
* @description 针对表【tb_time】的数据库操作Mapper
* @createDate 2023-11-28 20:42:34
* @Entity com.example.demo.entity.domain.Time
*/
@Mapper
public interface TimeMapper extends BaseMapper<Time> {

}




