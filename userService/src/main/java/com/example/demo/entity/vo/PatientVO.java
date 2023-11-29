package com.example.demo.entity.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName：PatientVO
 * @Author：Acmsdy
 * @Date：2023-11-29 20:56
 * @Describe：
 */
@Getter
@Setter
public class PatientVO {
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

    @TableField(value = "patient_type_name")
    private String patientTypeName;
}
