package com.example.demo.common.base;

/**
 * @ClassName：BaseQuery
 * @Author：Acmsdy
 * @Date：2023-11-27 15:05
 * @Describe：
 */

import com.example.demo.common.constant.HospitalConst;
import lombok.Getter;
import lombok.Setter;
/**
 * 查询基类
 * @author: hc
 * @date: 2023/7/2
 */
@Setter
public class BaseQuery {
    /**
     * 页码
     */
    private Integer pageNum;
    /**
     * 页面大小
     */
    private Integer pageSize;

    public Integer getPageNum() {
        if (pageNum == null) {
            return HospitalConst.PAGE_NUM;
        }
        return pageNum;
    }

    public Integer getPageSize() {
        if (pageSize == null) {
            return HospitalConst.PAGE_SIZE;
        }
        return pageSize;
    }
}

