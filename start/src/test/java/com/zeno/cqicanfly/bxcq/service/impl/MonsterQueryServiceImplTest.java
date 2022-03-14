package com.zeno.cqicanfly.bxcq.service.impl;

import com.alibaba.fastjson.JSON;
import com.zeno.cqicanfly.bxcq.bo.MonsterBO;
import com.zeno.cqicanfly.bxcq.service.MonsterQueryService;
import com.zeno.cqicanfly.repository.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author zeno
 * @Date 2022/3/15
 */
class MonsterQueryServiceImplTest extends BaseTest {

    @Autowired
    private MonsterQueryService monsterQueryService;

    @Test
    void queryAll() {
        List<MonsterBO> monsterBOList = monsterQueryService.queryAll();
        System.out.println(JSON.toJSONString(monsterBOList));
    }

    @Test
    void batchQueryByMonsterIds() {
    }

    @Test
    void jsonObjConverterBo() {
    }
}