package com.zeno.cqicanfly.bxcq.service.impl;

import com.alibaba.fastjson.JSON;
import com.zeno.cqicanfly.bxcq.bo.DropGroupBO;
import com.zeno.cqicanfly.bxcq.service.DropConfigQueryService;
import com.zeno.cqicanfly.repository.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.ExecutionException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author zeno
 * @Date 2022/3/15
 */
class DropConfigQueryServiceImplTest extends BaseTest {

    @Autowired
    private DropConfigQueryService dropConfigQueryService;

    @Test
    void queryByDropGroupId() throws ExecutionException {
        DropGroupBO dropGroupBO = dropConfigQueryService.queryByDropGroupId(100557);
        System.out.println(JSON.toJSONString(dropGroupBO));
    }
}