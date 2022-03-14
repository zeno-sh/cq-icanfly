package com.zeno.cqicanfly.exception;

/**
 * @Author zeno
 * @Date 2022/3/15
 */
public class QueryException extends RuntimeException {
    public QueryException(String message) {
        super(message);
    }

    public QueryException(String message, Throwable cause) {
        super(message, cause);
    }
}
