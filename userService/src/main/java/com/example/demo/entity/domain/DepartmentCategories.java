package com.example.demo.entity.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName tb_department_categories
 */
@TableName(value ="tb_department_categories")
@Data
public class DepartmentCategories implements Serializable {
    /**
     * 科室大类id
     */
    @TableId(value = "department_categories_id")
    private String departmentCategoriesId;

    /**
     * 科室大类名称（如内科）
     */
    @TableField(value = "department_categories_name")
    private String departmentCategoriesName;

    /**
     * 下设细分科室数量
     */
    @TableField(value = "department_num")
    private Integer departmentNum;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}