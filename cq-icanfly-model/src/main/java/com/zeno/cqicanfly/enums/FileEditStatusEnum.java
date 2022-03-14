package com.zeno.cqicanfly.enums;

/**
 * @Author zeno
 * @Date 2022/3/14
 */
public enum FileEditStatusEnum {
    UN_VALID(0, "删除"),
    STORAGE(1, "暂存"),
    PUBLISH(2, "已发布"),
    ;

    private int code;
    private String desc;

    FileEditStatusEnum(int code, String desc) {
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
