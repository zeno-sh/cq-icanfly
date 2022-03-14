package com.zeno.cqicanfly;

import com.zeno.cqicanfly.exception.Json2LuaException;

import java.io.IOException;

/**
 * @Author zeno
 * @Date 2022/3/13
 */
public interface Json2LuaService {

    /**
     * json 转 lua table
     *
     * @param jsonFilePath
     * @return
     * @throws Json2LuaException
     */
    String readLuaString(String jsonFilePath) throws Json2LuaException, IOException, InterruptedException;
}
