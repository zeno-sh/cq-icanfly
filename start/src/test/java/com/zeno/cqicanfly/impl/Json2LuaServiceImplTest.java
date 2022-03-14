package com.zeno.cqicanfly.impl;

import com.zeno.cqicanfly.Json2LuaService;
import com.zeno.cqicanfly.repository.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

/**
 * @Author zeno
 * @Date 2022/3/13
 */
class Json2LuaServiceImplTest extends BaseTest {

    @Autowired
    private Json2LuaService json2LuaService;

    @Test
    void luaStringByJson() {
        String jsonFile = "/Users/zhulinfeng/Documents/lua-config/ShopConfig.json";
        String s = null;
        try {
            s = json2LuaService.readLuaString(jsonFile);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(s);
    }
}