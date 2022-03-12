package com.zeno.cqicanfly.controller;

import com.github.pagehelper.PageInfo;
import com.zeno.cqicanfly.dto.DropGroupDTO;
import com.zeno.cqicanfly.dto.MonsterDTO;
import com.zeno.cqicanfly.impl.DropQueryService;
import com.zeno.cqicanfly.impl.MonsterQueryService;
import com.zeno.cqicanfly.response.WebResponse;
import com.zeno.cqicanfly.response.WebResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MonsterController {

    @Autowired
    private DropQueryService dropQueryService;
    @Autowired
    private MonsterQueryService monsterQueryService;

    @GetMapping("/monster")
    @ResponseBody
    public WebResponse<PageInfo<MonsterDTO>> pageQueryMonster(@RequestParam(value = "monsterName", defaultValue = "") String monsterName,
                                                              @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                              @RequestParam(value = "pageSize", defaultValue = "20") Integer pageSize) {

        return WebResponseBuilder.success(monsterQueryService.pageQueryMonster(monsterName, pageNum,pageSize));
    }

    @GetMapping("/dropGroup")
    @ResponseBody
    public WebResponse<DropGroupDTO> queryDropInfo(@RequestParam Integer monsterId) {
        return WebResponseBuilder.success(dropQueryService.queryDropConfigByMonsterId(monsterId));
    }

}
