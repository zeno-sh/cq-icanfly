package com.zeno.cqicanfly.bxcq.service.impl;

import com.alibaba.fastjson.JSON;
import com.zeno.cqicanfly.bxcq.bo.DropTableBO;
import com.zeno.cqicanfly.bxcq.service.DropTableQueryService;
import com.zeno.cqicanfly.repository.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author zeno
 * @Date 2022/3/15
 */
class DropTableQueryServiceImplTest extends BaseTest {

    @Autowired
    private DropTableQueryService dropTableQueryService;

    @Test
    void queryByDropTableId() {
        List<DropTableBO> dropTableBOList = dropTableQueryService.queryByDropTableId(2010027);
        System.out.println(JSON.toJSONString(dropTableBOList));
    }

    @Test
    void jsonObjConverterBo() {
    }
}