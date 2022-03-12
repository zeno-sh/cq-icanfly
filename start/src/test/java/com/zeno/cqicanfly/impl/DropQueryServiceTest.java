package com.zeno.cqicanfly.impl;

import com.alibaba.fastjson.JSON;
import com.zeno.cqicanfly.dto.DropGroupDTO;
import com.zeno.cqicanfly.repository.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class DropQueryServiceTest extends BaseTest {
    @Autowired
    private DropQueryService dropQueryService;

    @Test
    void queryDropConfigByMonsterId() {
        Integer monsterId = 92;
        DropGroupDTO dropGroupDTO = dropQueryService.queryDropConfigByMonsterId(monsterId);
        System.out.println(JSON.toJSONString(dropGroupDTO));

    }
}