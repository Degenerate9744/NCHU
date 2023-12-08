package com.example.demo.entity.query;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.demo.common.base.BaseQuery;
import lombok.*;

/**
 * @ClassName：PatientQuery
 * @Author：Acmsdy
 * @Date：2023-11-27 14:35
 * @Describe：
 */
@Getter
@Setter
@ToString
public class PatientQuery extends BaseQuery {
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
    @TableField(value = "phone_number")
    private String phoneNumber;


    /**
     *
     */
    @TableField(value = "state")
    private Integer state;

    /**
     *
     */
    @TableField(value = "patient_type_id")
    private String patientTypeId;

}
