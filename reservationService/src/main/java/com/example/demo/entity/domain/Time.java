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
 * @TableName tb_time
 */
@TableName(value ="tb_time")
@Getter
@Setter
public class Time implements Serializable {
    /**
     * 
     */
    @TableId(value = "time_id")
    private String timeId;

    /**
     * 
     */
    @TableField(value = "start_time")
    private String startTime;

    /**
     * 
     */
    @TableField(value = "end_time")
    private String endTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}