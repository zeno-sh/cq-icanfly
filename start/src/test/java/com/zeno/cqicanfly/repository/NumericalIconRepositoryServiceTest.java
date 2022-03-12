package com.zeno.cqicanfly.repository;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zeno.cqicanfly.mybatis.entity.NumericalIconPO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import utils.JsonFileLoadUtils;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class NumericalIconRepositoryServiceTest {

    @Autowired
    private NumericalIconRepositoryService numericalIconRepositoryService;

    @Test
    void insert() throws Exception {
        String itemPath = "src/test/java/com/zeno/cqicanfly/repository/json/NumericalIcon.json";
        String json = JsonFileLoadUtils.loadJsonFile(itemPath);
        List<NumericalIconPO> numericalIconPOList = new ArrayList<>();
        JSONObject jsonObject = JSONObject.parseObject(json);
        jsonObject.forEach((s, o) -> {
            NumericalIconPO numericalIconPO = JSONObject.parseObject(JSON.toJSONString(o), NumericalIconPO.class);
            numericalIconPOList.add(numericalIconPO);
        });
        numericalIconRepositoryService.insert(numericalIconPOList);
    }
}