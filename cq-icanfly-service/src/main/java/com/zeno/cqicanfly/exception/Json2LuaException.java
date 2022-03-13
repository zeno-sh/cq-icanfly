package com.zeno.cqicanfly.exception;

/**
 * @Author zeno
 * @Date 2022/3/13
 */
public class Json2LuaException extends RuntimeException{
    public Json2LuaException(String message) {
        super(message);
    }

    public Json2LuaException(String message, Throwable cause) {
        super(message, cause);
    }
}
