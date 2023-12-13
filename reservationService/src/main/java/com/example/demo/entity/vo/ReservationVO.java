package com.example.demo.entity.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @ClassName：ReservationVO
 * @Author：Acmsdy
 * @Date：2023-12-12 8:49
 * @Describe：
 */
@Getter
@Setter
public class ReservationVO {
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
    @TableField(value = "doctor_name")
    private String doctorName;

    /**
     *
     */
    @TableField(value = "money")
    private BigDecimal money;


    /**
     *
     */
    @TableField(value = "state")
    private Integer state;

    /**
     * 时段编号
     */
    @TableField(value = "start_time")
    private String startTime;
    @TableField(value = "end_time")
    private String endTime;

    /**
     *
     */
    @TableField(value = "patient_name")
    private String patientName;

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
}
