package com.zeno.cqicanfly.bxcq.enums;

/**
 * @Author zeno
 * @Date 2022/3/14
 */
public enum DropTypeEnum implements BaseEnum {
    GUDING(1, "固定概率"),
    QUANZHONG(2, "权重概率"),
    ;

    private int code;
    private String desc;

    DropTypeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
