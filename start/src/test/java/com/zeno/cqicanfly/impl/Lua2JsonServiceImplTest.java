package com.zeno.cqicanfly.impl;

import com.zeno.cqicanfly.Lua2JsonService;
import com.zeno.cqicanfly.configpublish.FileEditService;
import com.zeno.cqicanfly.repository.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import utils.FileLoadUtils;

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

        String dropGroupFile = "/Users/zhulinfeng/Documents/GitSpace/cq-icanfly/start/src/main/resources/luafile/DropGroup.lua";
        String dropTableFile = "/Users/zhulinfeng/Documents/GitSpace/cq-icanfly/start/src/main/resources/luafile/DropTable.lua";
        String itemFile = "/Users/zhulinfeng/Documents/GitSpace/cq-icanfly/start/src/main/resources/luafile/StdItems.lua";

        String dropGroupFileStr = FileLoadUtils.loadFile(dropGroupFile);
        String dropTableFileStr = FileLoadUtils.loadFile(dropTableFile);
        String itemFileStr = FileLoadUtils.loadFile(itemFile);

        String dropGroupFileJson = readLuaFile(dropGroupFile);
        String dropTableFileJson = readLuaFile(dropTableFile);
        String itemFileJson = readLuaFile(itemFile);


        Integer dropGroupFileId = 2;
        Integer dropTableFileId = 3;
        Integer itemFileId = 4;

        save(dropGroupFileId, dropGroupFileStr, dropGroupFileJson);
        save(dropTableFileId, dropTableFileStr, dropTableFileJson);
        save(itemFileId, itemFileStr, itemFileJson);
    }

    private void save(Integer fileId, String fileStr, String json) {
        Boolean result = fileEditService.modifyFileConfig(fileId, fileStr, json);
//        System.out.println(result);
    }

    private String readLuaFile(String luaFile) {
        try {
            String luaStr = lua2JsonService.readJsonString(luaFile);
            return luaStr;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}