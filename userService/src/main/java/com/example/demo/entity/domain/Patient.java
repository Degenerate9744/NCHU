package com.example.demo.entity.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import lombok.*;

/**
 * 
 * @TableName tb_patient
 */
@TableName(value ="tb_patient")
@Setter
@Getter
public class Patient implements Serializable {
    /**
     * 
     */
    @TableId(value = "patient_id")
    private String patientId;

    /**
     * 
     */
    @TableField(value = "patient_name")
    private String patientName;

    /**
     * 
     */
    @TableField(value = "sex")
    private String sex;

    /**
     * 
     */
    @TableField(value = "age")
    private Integer age;

    /**
     * 
     */
    @TableField(value = "phone_number")
    private String phoneNumber;

    /**
     * 
     */
    @TableField(value = "address")
    private String address;

    /**
     * 
     */
    @TableField(value = "state")
    private Integer state;

    /**
     * 
     */
    @TableField(value = "relationship_with_account_holder")
    private String relationshipWithAccountHolder;

    /**
     * 
     */
    @TableField(value = "order_id")
    private String orderId;

    /**
     * 
     */
    @TableField(value = "patient_type_id")
    private String patientTypeId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}