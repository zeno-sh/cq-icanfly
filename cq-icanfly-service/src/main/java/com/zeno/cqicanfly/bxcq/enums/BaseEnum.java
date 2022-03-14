package com.zeno.cqicanfly.bxcq.enums;

import java.lang.reflect.Field;
import java.util.Objects;

/**
 * @Author zeno
 * @Date 2022/3/14
 */
public interface BaseEnum {

    /** code */
    String DEFAULT_CODE_NAME = "code";

    /** desc */
    String DEFAULT_DESC_NAME = "desc";

    /**
     * get enum code
     *
     * @return enum code
     */
    default Integer getCode() {
        return Integer.valueOf(getFieldValue(DEFAULT_CODE_NAME));
    }

    /**
     * get enum desc value
     *
     * @return enum desc value
     */
    default String getDesc() {
        return getFieldValue(DEFAULT_DESC_NAME);
    }

    /**
     * parse enum code 2 enum
     *
     * @param enumClazz {param-0: enum class}
     * @param code {param-1: enum code}
     * @param <T> {param-2: enum type}
     * @return {return enum}
     */
    static <T extends Enum<T>> T valueOfEnum(Class<T> enumClazz, Integer code) {
        Objects.requireNonNull(enumClazz);
        if (null == code) {
            throw new IllegalArgumentException("enum code can not be null");
        }

        if (enumClazz.isAssignableFrom(BaseEnum.class) || !BaseEnum.class.isAssignableFrom(enumClazz)) {
            throw new IllegalArgumentException("enum must impl BaseEnum");
        }

        T[] enumConstantList = enumClazz.getEnumConstants();
        if (null == enumConstantList || enumConstantList.length == 0) {
            throw new IllegalArgumentException("parse enum err");
        }

        for (T element : enumConstantList) {
            BaseEnum baseEnum = (BaseEnum) element;
            if (code.equals(baseEnum.getCode())) {
                return element;
            }
        }

        throw new IllegalArgumentException("enum mapping is null");
    }

    default String getFieldValue(String defaultDescName) {
        try {
            Field field = this.getClass().getDeclaredField(defaultDescName);
            field.setAccessible(true);
            return field.get(this).toString();

        } catch (Exception e) {

            throw new RuntimeException(e);
        }
    }
}
