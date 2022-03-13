package com.zeno.cqicanfly.exception;

/**
 * @Author zeno
 * @Date 2022/3/13
 */
public class DbQueryException extends RuntimeException {
    public DbQueryException(String message) {
        super(message);
    }

    public DbQueryException(String message, Throwable cause) {
        super(message, cause);
    }
}
