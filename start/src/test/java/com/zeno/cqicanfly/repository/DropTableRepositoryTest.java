package com.zeno.cqicanfly.repository;

import com.zeno.cqicanfly.mybatis.entity.DropTablePO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import utils.JsonFileLoadUtils;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DropTableRepositoryTest extends BaseTest {
    @Autowired
    private DropTableRepository repository;

    @Test
    void insert() throws Exception {
        String jsonFile = "/Users/zhulinfeng/Documents/GitSpace/cq-icanfly/start/src/main/resources/jsonfile/DropTable.lua.json";
        String jsonStr = JsonFileLoadUtils.loadJsonFile(jsonFile);
        List list = convertJsonObj(DropTablePO.class, jsonStr.replace("table", "dropTable"));
        System.out.println(list);
        repository.insert(list);
    }

    @Test
    void queryById() {
    }
}