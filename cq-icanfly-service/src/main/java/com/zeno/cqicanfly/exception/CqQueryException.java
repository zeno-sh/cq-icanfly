package com.zeno.cqicanfly.exception;

/**
 * @Author zeno
 * @Date 2022/3/15
 */
public class CqQueryException extends RuntimeException{
    public CqQueryException(String message) {
        super(message);
    }

    public CqQueryException(String message, Throwable cause) {
        super(message, cause);
    }
}
