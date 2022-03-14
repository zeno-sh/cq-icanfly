package com.zeno.cqicanfly.configpublish;

import com.zeno.cqicanfly.Lua2JsonService;
import com.zeno.cqicanfly.repository.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

/**
 * @Author zeno
 * @Date 2022/3/13
 */
class FileEditServiceTest extends BaseTest {

    @Autowired
    private FileEditService fileEditService;
    @Autowired
    private Lua2JsonService lua2JsonService;

    @Test
    void modifyFileConfig() throws IOException, InterruptedException {
        String luaFile = "/Users/zhulinfeng/Documents/GitSpace/cq-icanfly/start/src/main/resources/luafile/Monster.lua";
        String luaStr = lua2JsonService.readJsonString(luaFile);

        Boolean result = fileEditService.modifyFileConfig(1, luaStr, null);
        System.out.println(result);
    }

    @Test
    void modifyFileEditStatus() {
    }
}