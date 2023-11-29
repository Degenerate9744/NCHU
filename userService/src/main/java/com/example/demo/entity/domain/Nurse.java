package com.example.demo.entity.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName tb_nurse
 */
@TableName(value ="tb_nurse")
@Data
public class Nurse implements Serializable {
    /**
     * 
     */
    @TableId(value = "nurse_id")
    private String nurseId;

    /**
     * 
     */
    @TableField(value = "nurse_name")
    private String nurseName;

    /**
     * 护士职级
     */
    @TableField(value = "nurse_level_id")
    private String nurseLevelId;

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

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}