package com.zeno.cqicanfly.impl;

import com.zeno.cqicanfly.Lua2JsonService;
import com.zeno.cqicanfly.repository.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author zeno
 * @Date 2022/3/13
 */
class Lua2JsonServiceImplTest extends BaseTest {

    @Autowired
    private Lua2JsonService lua2JsonService;

    @Test
    void jsonStringByLua() {
        String luaFile = "/Users/zhulinfeng/Documents/GitSpace/cq-icanfly/start/src/main/resources/luafile/Scences.lua";
        try {
            String s = lua2JsonService.jsonStringByLua(luaFile);
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}