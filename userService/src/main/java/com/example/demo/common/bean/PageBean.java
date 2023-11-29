package com.example.demo.common.bean;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class PageBean<T> {
    /**
     * 每页显示的条数
     */
    private Long size;
    /**
     * 当前的页码
     */
    private Long current;
    /**
     * 一共有多少条记录
     */
    private Long total;
    /**
     * 一共有多少页
     */
    private Long pages;
    /**
     * 每一页所显示的数据
     */
    private List<T> records;

}
