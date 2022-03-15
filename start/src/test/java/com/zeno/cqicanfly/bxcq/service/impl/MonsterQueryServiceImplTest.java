package com.zeno.cqicanfly.bxcq.service.impl;

import com.alibaba.fastjson.JSON;
import com.zeno.cqicanfly.bxcq.bo.MonsterBO;
import com.zeno.cqicanfly.bxcq.bo.PageBO;
import com.zeno.cqicanfly.utils.RamPager;
import com.zeno.cqicanfly.bxcq.service.MonsterQueryService;
import com.zeno.cqicanfly.repository.BaseTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * @Author zeno
 * @Date 2022/3/15
 */
class MonsterQueryServiceImplTest extends BaseTest {

    @Autowired
    private MonsterQueryService monsterQueryService;

    @Test
    void queryAll() throws ExecutionException {
        List<MonsterBO> monsterBOList = monsterQueryService.queryAll();
        System.out.println(JSON.toJSONString(monsterBOList));
    }

    @Test
    void batchQueryByMonsterIds() {
    }

    @Test
    void jsonObjConverterBo() {
    }

    @Test
    void pageTest() throws ExecutionException {
//        String name = "神话";
        String name = "";
        PageBO<MonsterBO> pageBO = monsterQueryService.pageQueryByMonsterName(name, 1, 20);
        System.out.println(JSON.toJSONString(pageBO));
        PageBO<MonsterBO> pageBO2 = monsterQueryService.pageQueryByMonsterName(name, 2, 20);
        System.out.println(JSON.toJSONString(pageBO2));
    }
}