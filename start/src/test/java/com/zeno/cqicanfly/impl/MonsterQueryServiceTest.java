package com.zeno.cqicanfly.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.zeno.cqicanfly.dto.MonsterDTO;
import com.zeno.cqicanfly.repository.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class MonsterQueryServiceTest extends BaseTest {

    @Autowired
    private MonsterQueryService monsterQueryService;

    @Test
    void pageQueryMonster() {
        PageInfo<MonsterDTO> pageInfo = monsterQueryService.pageQueryMonster("领", 1, 100);
        System.out.println(JSON.toJSONString(pageInfo));
    }
}