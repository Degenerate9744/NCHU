package com.example.demo.mapper;

import com.example.demo.entity.domain.Admin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author h
* @description 针对表【tb_admin】的数据库操作Mapper
* @createDate 2023-11-28 14:53:11
* @Entity com.example.demo.entity.domain.Admin
*/
@Mapper
public interface AdminMapper extends BaseMapper<Admin> {

}




