package com.example.demo.entity.query;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.example.demo.common.base.BaseQuery;
import lombok.Data;

/**
 * @ClassName：NurseQuery
 * @Author：Acmsdy
 * @Date：2023-11-28 14:45
 * @Describe：
 */
@Data
public class NurseQuery extends BaseQuery {
    @TableId(value = "nurse_id")
    private String nurseId;

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
}
