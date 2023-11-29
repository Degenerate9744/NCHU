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
 * @TableName tb_nurse_level
 */
@TableName(value ="tb_nurse_level")
@Getter
@Setter
public class NurseLevel implements Serializable {
    /**
     * 
     */
    @TableId(value = "nurse_level_id")
    private String nurseLevelId;

    /**
     * 
     */
    @TableField(value = "nurse_level_name")
    private String nurseLevelName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}