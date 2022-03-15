package com.zeno.cqicanfly.controller;

import com.zeno.cqicanfly.bxcq.bo.DropGroupBO;
import com.zeno.cqicanfly.bxcq.bo.MonsterBO;
import com.zeno.cqicanfly.bxcq.bo.PageBO;
import com.zeno.cqicanfly.bxcq.service.DropConfigQueryService;
import com.zeno.cqicanfly.bxcq.service.MonsterQueryService;
import com.zeno.cqicanfly.response.WebResponse;
import com.zeno.cqicanfly.response.WebResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
public class MonsterController {

    @Autowired
    private DropConfigQueryService dropConfigQueryService;
    @Autowired
    private MonsterQueryService monsterQueryService;

    @GetMapping("/monster")
    @ResponseBody
    public WebResponse<PageBO<MonsterBO>> pageQueryMonster(@RequestParam(value = "monsterName", defaultValue = "") String monsterName,
                                                           @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                           @RequestParam(value = "pageSize", defaultValue = "20") Integer pageSize) throws ExecutionException {

        return WebResponseBuilder.success(monsterQueryService.pageQueryByMonsterName(monsterName, pageNum, pageSize));
    }

    @GetMapping("/dropGroup")
    @ResponseBody
    public WebResponse<DropGroupBO> queryDropInfo(@RequestParam Integer dropGroupId) throws ExecutionException {
        return WebResponseBuilder.success(dropConfigQueryService.queryByDropGroupId(dropGroupId));
    }

}
