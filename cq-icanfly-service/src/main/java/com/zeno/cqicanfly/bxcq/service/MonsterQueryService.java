package com.zeno.cqicanfly.bxcq.service;

import com.zeno.cqicanfly.bxcq.bo.MonsterBO;

import java.util.List;

/**
 * @Author zeno
 * @Date 2022/3/14
 */
public interface MonsterQueryService{

    List<MonsterBO> queryAll();

    List<MonsterBO> batchQueryByMonsterIds(List<Integer> monsterIds);

}
