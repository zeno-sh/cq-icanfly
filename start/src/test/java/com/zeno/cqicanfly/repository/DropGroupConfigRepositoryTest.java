package com.zeno.cqicanfly.repository;

import com.alibaba.fastjson.JSON;
import com.zeno.cqicanfly.mybatis.entity.DropGroupConfigPO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import utils.JsonFileLoadUtils;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DropGroupConfigRepositoryTest extends BaseTest {
    @Autowired
    private DropGroupConfigRepository dropGroupConfigRepository;

    @Test
    void insert() throws Exception {
        String jsonFile = "/Users/zhulinfeng/Documents/GitSpace/cq-icanfly/start/src/main/resources/jsonfile/DropGroupConfig.json";
        String jsonStr = JsonFileLoadUtils.loadJsonFile(jsonFile).replace("group","groupConfig");
        List list = convertJsonObj(DropGroupConfigPO.class, jsonStr);
        System.out.println(JSON.toJSONString(list));
        dropGroupConfigRepository.insert(list);
    }

    @Test
    void queryById() {
    }
}