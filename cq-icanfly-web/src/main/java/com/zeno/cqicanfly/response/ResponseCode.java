package com.zeno.cqicanfly.response;

public enum ResponseCode {
    OK(20000, "成功"),
    ILLEGAL_ARGUMENT(400, "参数错误"),
    SERVER_ERROR(500, "服务器错误"),
    BUSINESS_ERROR(600, "业务处理错误"),
    PERSISTENCE_ERROR(601, "持久化错误"),
    ;

    private int code;
    private String msg;

    ResponseCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public boolean isSuccess() {
        return this.code == OK.getCode();
    }

    public static boolean isSuccess(Integer code) {
        if (code != null) {
            return code == OK.getCode();
        }
        return false;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
