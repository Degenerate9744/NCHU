package com.example.demo.entity.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 
 * @TableName tb_reservation
 */
@TableName(value ="tb_reservation")
@Data
public class Reservation implements Serializable {
    /**
     * 
     */
    @TableId(value = "reservation_id")
    private String reservationId;

    /**
     * 诊室编号
     */
    @TableField(value = "room_id")
    private String roomId;

    /**
     * 
     */
    @TableField(value = "doctor_id")
    private String doctorId;

    /**
     * 
     */
    @TableField(value = "money")
    private BigDecimal money;

    /**
     * 号源序号
     */
    @TableField(value = "number_source_id")
    private String numberSourceId;

    /**
     * 
     */
    @TableField(value = "state")
    private Integer state;

    /**
     * 时段编号
     */
    @TableField(value = "time_id")
    private String timeId;

    /**
     * 
     */
    @TableField(value = "patient_id")
    private String patientId;

    /**
     * 
     */
    @TableField(value = "pay_state")
    private Integer payState;

    /**
     * 预约那天的年月日
     */
    @TableField(value = "reservation_time")
    private String reservationTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}