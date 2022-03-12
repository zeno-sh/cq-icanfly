package com.zeno.cqicanfly.repository;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zeno.cqicanfly.mybatis.entity.ScenesConfigPO;
import com.zeno.cqicanfly.mybatis.entity.StdItemsPO;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import utils.JsonFileLoadUtils;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ScenesConfigRepositoryTest {

    @Autowired
    private ScenesConfigRepository scenesConfigRepository;

    @Test
    void insert() throws Exception {
        String scenesJsonPath = "/Users/zhulinfeng/Documents/GitSpace/cq-icanfly/start/src/main/resources/jsonfile/Scenes.json";
        String jsonStr = JsonFileLoadUtils.loadJsonFile(scenesJsonPath);

        List<ScenesConfigPO> list = Lists.newArrayList();
        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        jsonObject.forEach((s, o) -> {
            ScenesConfigPO scenesConfigPO = JSONObject.parseObject(JSON.toJSONString(o), ScenesConfigPO.class);
            list.add(scenesConfigPO);
        });
//        System.out.println(JSON.toJSONString(list));
        scenesConfigRepository.insert(list);
    }

    @Test
    void queryByScenesId() {
    }
}