package com.example.demo.entity.query;

import com.baomidou.mybatisplus.annotation.TableField;
import com.example.demo.common.base.BaseQuery;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @ClassName：DepartmentQuery
 * @Author：Acmsdy
 * @Date：2023-12-11 16:50
 * @Describe：
 */
@Getter
@Setter
@ToString
public class DepartmentQuery extends BaseQuery {
    @TableField(value = "department_categories_id")
    private String departmentCategoriesId;
}
