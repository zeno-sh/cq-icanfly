package com.zeno.cqicanfly.exception;

/**
 * @Author zeno
 * @Date 2022/3/13
 */
public class Lua2JsonException extends RuntimeException{
    public Lua2JsonException(String message) {
        super(message);
    }

    public Lua2JsonException(String message, Throwable cause) {
        super(message, cause);
    }
}
