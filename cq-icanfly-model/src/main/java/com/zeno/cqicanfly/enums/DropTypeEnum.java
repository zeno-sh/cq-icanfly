package com.zeno.cqicanfly.enums;

import lombok.Getter;

@Getter
public enum DropTypeEnum {
    SUIJI(1, "固定概率"),
    QUANZHONG(2, "权重"),
    ;

    private int code;
    private String desc;

    DropTypeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static String valuesOf(int code) {
        DropTypeEnum[] values = DropTypeEnum.values();
        for (DropTypeEnum dropTypeEnum : values) {
            if (dropTypeEnum.code == code) {
                return dropTypeEnum.getDesc();
            }
        }
        return null;
    }
}
