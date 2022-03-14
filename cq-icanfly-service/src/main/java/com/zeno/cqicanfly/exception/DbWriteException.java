package com.zeno.cqicanfly.exception;

/**
 * @Author zeno
 * @Date 2022/3/14
 */
public class DbWriteException extends RuntimeException {
    public DbWriteException(String message) {
        super(message);
    }

    public DbWriteException(String message, Throwable cause) {
        super(message, cause);
    }
}
