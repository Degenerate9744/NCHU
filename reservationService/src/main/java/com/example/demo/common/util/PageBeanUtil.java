package com.example.demo.common.util;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.common.bean.PageBean;

/**
 * PageBean工具类
 *
 * @author: hc
 * @date: 2023/5/4
 */
public class PageBeanUtil {

    /**
     * 将MyBatis的Page对象转换成我们自定义的PageBean对象
     *
     * @param page
     */
    public static <T, V> PageBean<V> page2PageBean(Page<T> page) {
        if (page == null) {
            return null;
        }
        PageBean<V> pageBean = new PageBean<>();
        pageBean.setSize(page.getSize());
        pageBean.setCurrent(page.getCurrent());
        pageBean.setTotal(page.getTotal());
        pageBean.setPages(page.getPages());
        return pageBean;
    }

}
