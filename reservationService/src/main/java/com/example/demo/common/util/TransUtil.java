package com.example.demo.common.util;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.common.bean.PageBean;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName：TransUtil
 * @Author：Acmsdy
 * @Date：2023-11-29 15:59
 * @Describe：
 */
public abstract class TransUtil<T, V> {
    public PageBean<V> tPage2VPageBean(Page<T> tPage) {
        PageBean<V> vPageBean = PageBeanUtil.page2PageBean(tPage);
        final List<T> tList = tPage.getRecords();
        List<V> vList = tList2VList(tList);
        vPageBean.setRecords(vList);
        return vPageBean;
    }

    /**
     * List转换
     * @param tList
     * @return
     */
    public List<V> tList2VList(List<T> tList) {
        List<V> vList = new ArrayList<>();
        for (T tObj : tList) {
            final V vObj = tObj2VObj(tObj);
            vList.add(vObj);
        }
        return vList;
    }

    /**
     * 对象转换
     * @param Obj
     * @return
     */
    public abstract V tObj2VObj(T Obj);
}
