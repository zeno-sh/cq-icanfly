package com.zeno.cqicanfly.impl;

import com.github.pagehelper.PageInfo;
import com.zeno.cqicanfly.dto.MonsterDTO;
import com.zeno.cqicanfly.mybatis.entity.MonsterConfigPO;
import com.zeno.cqicanfly.repository.MonsterRepository;
import com.zeno.cqicanfly.repository.PageParam;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MonsterQueryService {

    @Autowired
    private MonsterRepository monsterRepository;

    public PageInfo<MonsterDTO> pageQueryMonster(String monsterName,Integer pageNum, Integer pageSize) {
        MonsterConfigPO params = new MonsterConfigPO();
        params.setName(monsterName);
        PageParam<MonsterConfigPO> pageParam = new PageParam<MonsterConfigPO>().setParam(params).setPageNum(pageNum).setPageSize(pageSize).setOrderBy("entityid desc");
        PageInfo<MonsterDTO> page = monsterRepository.page(pageParam);
        if (CollectionUtils.isEmpty(page.getList())) {
            throw new RuntimeException("什么怪物信息都没有查到！");
        }
        return page;
    }
}
