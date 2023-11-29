package com.example.demo.entity.query;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.example.demo.common.base.BaseQuery;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @ClassName：ReservationQuery
 * @Author：Acmsdy
 * @Date：2023-11-28 20:42
 * @Describe：
 */
@Data
public class ReservationQuery extends BaseQuery {
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
     * 预约那天的年月日
     */
    @TableField(value = "reservation_time")
    private String reservationTime;
}
