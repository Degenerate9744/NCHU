package com.example.demo.entity.query;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.example.demo.common.base.BaseQuery;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @ClassName：StaffQuery
 * @Author：Acmsdy
 * @Date：2023-11-28 9:16
 * @Describe：
 */
@Getter
@Setter
@ToString
public class DoctorQuery extends BaseQuery {
    /*医生查询条件*/
    /**
     *
     */
    @TableId(value = "doctor_id")
    private String doctorId;

    @TableField(value = "doctor_name")
    private String doctorName;

    /**
     * 职称id
     */
    @TableField(value = "doctor_level_id")
    private String doctorLevelId;

    /**
     *
     */
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
    @TableField(value = "state")
    private Integer state;

    /**
     *
     */
    @TableField(value = "room_id")
    private String roomId;

    @TableField(value = "department_id")
    private String departmentId;

}
