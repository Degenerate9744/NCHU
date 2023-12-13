package com.example.demo.entity.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import lombok.*;

/**
 * 
 * @TableName tb_doctor
 */
@TableName(value ="tb_doctor")
@Getter
@Setter
public class Doctor implements Serializable {
    /**
     * 
     */
    @TableId(value = "doctor_id")
    private String doctorId;

    /**
     * 
     */
    @TableField(value = "doctor_name")
    private String doctorName;

    /**
     * 职称id
     */
    @TableField(value = "doctor_level_id")
    private String doctorLevelId;

    /**
     * 
     */
    @TableField(value = "phone_number")
    private String phoneNumber;

    /**
     * 
     */
    @TableField(value = "introduction")
    private String introduction;

    /**
     * 
     */
    @TableField(value = "state")
    private Integer state;

    /**
     * 
     */
    @TableField(value = "room_id")
    private String roomId;

    /**
     * 
     */
    @TableField(value = "base_number_source_amount")
    private Integer baseNumberSourceAmount;

    /**
     * 
     */
    @TableField(value = "add_number_source_amount")
    private Integer addNumberSourceAmount;

    /**
     * 
     */
    @TableField(value = "residue_number_source_amount")
    private Integer residueNumberSourceAmount;

    @TableField(value = "department_id")
    private String departmentId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}