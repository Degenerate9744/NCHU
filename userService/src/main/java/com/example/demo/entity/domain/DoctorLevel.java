package com.example.demo.entity.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @TableName tb_doctor_level
 */
@TableName(value ="tb_doctor_level")
@Getter
@Setter
public class DoctorLevel implements Serializable {
    /**
     * 
     */
    @TableId(value = "doctor_level_id")
    private String doctorLevelId;

    /**
     * 
     */
    @TableField(value = "doctor_level_name")
    private String doctorLevelName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}