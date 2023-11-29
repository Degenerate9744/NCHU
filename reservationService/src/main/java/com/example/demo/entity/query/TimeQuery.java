package com.example.demo.entity.query;

import com.baomidou.mybatisplus.annotation.TableId;
import com.example.demo.common.base.BaseQuery;
import lombok.Data;

/**
 * @ClassName：TimeQuery
 * @Author：Acmsdy
 * @Date：2023-11-28 20:43
 * @Describe：
 */
@Data
public class TimeQuery extends BaseQuery {
    /**
     *
     */
    @TableId(value = "time_id")
    private String timeId;
}
