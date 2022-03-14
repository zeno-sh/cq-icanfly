package com.zeno.cqicanfly;

import com.zeno.cqicanfly.exception.Lua2JsonException;

import java.io.IOException;

/**
 * @Author zeno
 * @Date 2022/3/13
 */
public interface Lua2JsonService {

    /**
     * lua转json字符串
     *
     * @param luaFilePath
     * @return
     * @throws Lua2JsonException
     */
    String readJsonString(String luaFilePath) throws Lua2JsonException, IOException, InterruptedException;

}