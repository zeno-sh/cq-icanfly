package com.zeno.cqicanfly.utils;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BeanCopyUtils {
    /**
     * 从对象复制
     *
     * @param source 源对象
     * @param clazz  目标对象类型
     * @param <T>    对象类型
     * @return 目标对象
     */
    public static <T> T copyFromObj(Object source, Class<T> clazz) {
        if (source == null) {
            return null;
        }
        try {
            T t = clazz.newInstance();
            BeanUtils.copyProperties(source, t);
            return t;
        } catch (Exception e) {
            throw new IllegalStateException("instance fail:" + clazz, e);
        }
    }

    /**
     * 从列表复制
     *
     * @param source 源列表
     * @param clazz  目标对象类型
     * @param <T>    对象类型
     * @return 目标列表
     */
    public static <T> List<T> copyFromList(List source, Class<T> clazz) {
        if (CollectionUtils.isEmpty(source)) {
            return Collections.emptyList();
        }
        List<T> result = new ArrayList<T>(source.size());
        for (Object o : source) {
            result.add(copyFromObj(o, clazz));
        }
        return result;
    }
}
