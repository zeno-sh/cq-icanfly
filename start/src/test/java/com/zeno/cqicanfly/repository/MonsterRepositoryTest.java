package com.zeno.cqicanfly.repository;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.zeno.cqicanfly.dto.MonsterDTO;
import com.zeno.cqicanfly.mybatis.entity.MonsterConfigPO;
import com.zeno.cqicanfly.mybatis.entity.ScenesConfigPO;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import utils.JsonFileLoadUtils;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MonsterRepositoryTest extends BaseTest{
    @Autowired
    private MonsterRepository monsterRepository;

    @Test
    void insert() throws Exception {
        String jsonFile = "/Users/zhulinfeng/Documents/GitSpace/cq-icanfly/start/src/main/resources/jsonfile/Monster.json";
        String jsonStr = JsonFileLoadUtils.loadJsonFile(jsonFile);
        List<MonsterConfigPO> list = convertJsonObj(MonsterConfigPO.class, jsonStr);
        System.out.println(JSON.toJSONString(list));
        monsterRepository.insert(list);
    }

    @Test
    void queryByMonsterEntityId() {
        MonsterConfigPO monsterConfigPO = new MonsterConfigPO();
        PageParam<MonsterConfigPO> pageParam = new PageParam<MonsterConfigPO>().setPageNum(1).setPageSize(10).setOrderBy("entityid desc");
        PageInfo<MonsterDTO> page = monsterRepository.page(pageParam);
        System.out.println(JSON.toJSONString(page));
    }

    @Test
    void queryByMonsterName() {
    }
}