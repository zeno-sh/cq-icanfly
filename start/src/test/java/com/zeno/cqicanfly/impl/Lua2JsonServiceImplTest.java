package com.zeno.cqicanfly.impl;

import com.zeno.cqicanfly.Lua2JsonService;
import com.zeno.cqicanfly.configpublish.FileEditService;
import com.zeno.cqicanfly.repository.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import utils.JsonFileLoadUtils;

import java.io.IOException;

/**
 * @Author zeno
 * @Date 2022/3/13
 */
class Lua2JsonServiceImplTest extends BaseTest {

    @Autowired
    private Lua2JsonService lua2JsonService;
    @Autowired
    private FileEditService fileEditService;

    @Test
    void jsonStringByLua() throws Exception {
//        String luaFile = "/Users/zhulinfeng/Documents/GitSpace/cq-icanfly/start/src/main/resources/luafile/Scences.lua";
        String luaFile = "/Users/zhulinfeng/Documents/GitSpace/cq-icanfly/start/src/main/resources/luafile/Monster.lua";
        String json = readLuaFile(luaFile);
        String fileStr = JsonFileLoadUtils.loadJsonFile(luaFile);
//        System.out.println(fileStr);
        Boolean result = fileEditService.modifyFileConfig(1, fileStr, json);
        System.out.println(result);
    }

    private String readLuaFile(String luaFile) {
        try {
            String luaStr = lua2JsonService.readJsonString(luaFile);
            System.out.println(luaStr);
            return luaStr;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}