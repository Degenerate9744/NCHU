package com.example.demo.mapper;

import com.example.demo.entity.domain.Department;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author h
* @description 针对表【tb_department】的数据库操作Mapper
* @createDate 2023-12-11 16:44:37
* @Entity com.example.demo.entity.domain.Department
*/
@Mapper
public interface DepartmentMapper extends BaseMapper<Department> {

}




