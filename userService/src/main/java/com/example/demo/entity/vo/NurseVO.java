package com.example.demo.entity.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName：NurseVO
 * @Author：Acmsdy
 * @Date：2023-11-29 20:31
 * @Describe：
 */
@Getter
@Setter
public class NurseVO {
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
    @TableField(value = "nurse_level_name")
    private String nurseLevelName;

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
}
