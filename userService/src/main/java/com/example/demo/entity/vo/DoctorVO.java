package com.example.demo.entity.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @ClassName：DactorVO
 * @Author：Acmsdy
 * @Date：2023-11-29 8:51
 * @Describe：
 */
@Data
public class DoctorVO {
    @TableId(value = "doctor_id")
    private String doctorId;

    /**
     *
     */
    @TableField(value = "doctor_name")
    private String doctorName;

    @TableField(value = "doctor_level_name")
    private String doctorLevelName;

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
}
