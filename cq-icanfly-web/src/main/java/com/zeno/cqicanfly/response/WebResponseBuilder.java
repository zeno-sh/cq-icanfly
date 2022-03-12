package com.zeno.cqicanfly.response;

public class WebResponseBuilder {

    public static <T> WebResponse<T> success() {
        return result(ResponseCode.OK.getCode(), ResponseCode.OK.getMsg(), null);
    }

    public static <T> WebResponse<T> success(T data) {
        return result(ResponseCode.OK.getCode(), ResponseCode.OK.getMsg(), data);
    }

    public static <T> WebResponse<T> fail(Integer code, String msg) {
        return result(code, msg, null);
    }

    public static <T> WebResponse<T> fail(ResponseCode responseCode, String msg) {
        return result(responseCode.getCode(), msg, null);
    }

    public static <T> WebResponse<T> illegalArgument(String msg) {
        return result(ResponseCode.ILLEGAL_ARGUMENT.getCode(), msg, null);
    }

    public static <T> WebResponse<T> businessError(String msg) {
        return result(ResponseCode.BUSINESS_ERROR.getCode(), msg, null);
    }

    public static <T> WebResponse<T> serverError() {
        return result(ResponseCode.SERVER_ERROR.getCode(), ResponseCode.SERVER_ERROR.getMsg(), null);
    }

    public static <T> WebResponse<T> fail(ResponseCode responseCode) {
        return result(responseCode.getCode(), responseCode.getMsg(), null);
    }

    public static <T> WebResponse<T> result(Integer code, String msg, T data) {
        WebResponse<T> webResponse = new WebResponse<>();
        webResponse.setCode(code);
        webResponse.setMessage(msg);
        webResponse.setData(data);
        return webResponse;
    }


}
