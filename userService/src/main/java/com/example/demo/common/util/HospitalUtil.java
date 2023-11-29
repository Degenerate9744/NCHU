package com.example.demo.common.util;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entity.domain.Patient;
import com.example.demo.entity.query.PatientQuery;

import java.lang.reflect.Field;

/**
 * @ClassName：HospitalUtil
 * @Author：Acmsdy
 * @Date：2023-11-28 10:59
 * @Describe：
 */
public class HospitalUtil {
    public static <T> QueryWrapper<T> generateQueryWrapper(Object queryObject) {
        QueryWrapper<T> queryWrapper = new QueryWrapper<>();
        Class<?> clazz = queryObject.getClass();
        Field[] fields = clazz.getDeclaredFields();
        try {
            for (Field field : fields) {
                field.setAccessible(true);
                Object value = field.get(queryObject);
                if (value != null) {
                    if (value instanceof String) {
                        queryWrapper.eq(getName(field.getName()), value);
                    } else {
                        queryWrapper.eq(field.getName(), value);
                    }
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return queryWrapper;
    }
    public static String getName(String name){
        String realName = "";
        for (int i = 0; i < name.length(); i++) {
            if(Character.isUpperCase(name.charAt(i))){
                realName = realName + "_";
                realName = realName + Character.toLowerCase(name.charAt(i));

            }else {
                realName = realName + name.charAt(i);
            }
        }
        return realName;
    }
}
