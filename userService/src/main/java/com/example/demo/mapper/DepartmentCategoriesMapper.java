package com.example.demo.mapper;

import com.example.demo.entity.domain.DepartmentCategories;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author h
* @description 针对表【tb_department_categories】的数据库操作Mapper
* @createDate 2023-12-11 16:44:58
* @Entity com.example.demo.entity.domain.DepartmentCategories
*/
@Mapper
public interface DepartmentCategoriesMapper extends BaseMapper<DepartmentCategories> {

}




