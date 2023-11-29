package com.example.demo.entity.query;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.example.demo.common.base.BaseQuery;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName：AdminQuery
 * @Author：Acmsdy
 * @Date：2023-11-28 14:55
 * @Describe：
 */
@Getter
@Setter
public class AdminQuery extends BaseQuery {
    @TableId(value = "admin_id")
    private String adminId;

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
