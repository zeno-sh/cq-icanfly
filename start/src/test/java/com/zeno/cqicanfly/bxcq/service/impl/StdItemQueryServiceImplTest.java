package com.zeno.cqicanfly.bxcq.service.impl;

import com.alibaba.fastjson.JSON;
import com.zeno.cqicanfly.bxcq.bo.StdItemBO;
import com.zeno.cqicanfly.bxcq.service.StdItemQueryService;
import com.zeno.cqicanfly.repository.BaseTest;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.concurrent.ExecutionException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author zeno
 * @Date 2022/3/15
 */
class StdItemQueryServiceImplTest extends BaseTest {

    @Autowired
    private StdItemQueryService stdItemQueryService;

    @Test
    void queryAllItems() throws ExecutionException {
        List<StdItemBO> stdItemBOS = stdItemQueryService.queryAllItems();
        System.out.println(JSON.toJSONString(stdItemBOS));
    }

    @Test
    void batchQueryByItemIds() throws ExecutionException {
        List<StdItemBO> stdItemBOS = stdItemQueryService.batchQueryByItemIds(Lists.newArrayList(1, 199));
        System.out.println(JSON.toJSONString(stdItemBOS));
    }
}