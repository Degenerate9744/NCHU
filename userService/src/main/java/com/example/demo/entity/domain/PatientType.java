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
 * @TableName tb_patient_type
 */
@TableName(value ="tb_patient_type")
@Setter
@Getter
public class PatientType implements Serializable {
    /**
     * 
     */
    @TableId(value = "patient_type_id")
    private String patientTypeId;

    /**
     * 
     */
    @TableField(value = "patient_type_name")
    private String patientTypeName;

    /**
     * 
     */
    @TableField(value = "reduction_time")
    private Integer reductionTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}