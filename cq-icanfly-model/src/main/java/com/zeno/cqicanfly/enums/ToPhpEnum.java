package com.zeno.cqicanfly.enums;

/**
 * @Author zeno
 * @Date 2022/3/13
 */
public enum ToPhpEnum {
    YES(1, "需要"),
    NO(0, "需要"),
    ;

    private int code;
    private String desc;

    ToPhpEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static boolean contains(int code) {
        ToPhpEnum[] values = ToPhpEnum.values();
        for (ToPhpEnum toPhpEnum : values) {
            if (code == toPhpEnum.getCode()) {
                return true;
            }
        }
        return false;
    }
}
