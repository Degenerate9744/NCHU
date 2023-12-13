package com.example.demo.entity.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName tb_department
 */
@TableName(value ="tb_department")
@Data
public class Department implements Serializable {
    /**
     * 
     */
    @TableId(value = "department_id")
    private String departmentId;

    /**
     * 
     */
    @TableField(value = "department_categories_id")
    private String departmentCategoriesId;

    /**
     * 
     */
    @TableField(value = "depatrment_name")
    private String depatrmentName;

    /**
     * 科室现有医生总数
     */
    @TableField(value = "doctor_totalnum")
    private Integer doctorTotalnum;

    /**
     * 每次的值班人数
     */
    @TableField(value = "doctor_oncallnum")
    private Integer doctorOncallnum;

    /**
     * 每个人的大概资讯时间
     */
    @TableField(value = "consultation_of_time")
    private Integer consultationOfTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}