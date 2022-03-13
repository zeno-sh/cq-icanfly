package com.zeno.cqicanfly;

import com.zeno.cqicanfly.exception.Json2LuaException;

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
    String luaStringByJson(String jsonFilePath) throws Json2LuaException;
}
