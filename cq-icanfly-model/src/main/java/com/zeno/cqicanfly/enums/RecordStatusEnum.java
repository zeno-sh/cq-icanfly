package com.zeno.cqicanfly.enums;

/**
 * @Author zeno
 * @Date 2022/3/13
 */
public enum RecordStatusEnum {
    VALID(1, "有效"),
    UN_VALID(0, "无效"),
    ;

    private int code;
    private String desc;

    RecordStatusEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
