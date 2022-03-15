package com.zeno.cqicanfly.bxcq.service;

import com.zeno.cqicanfly.bxcq.bo.MonsterBO;
import com.zeno.cqicanfly.bxcq.bo.PageBO;

import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * @Author zeno
 * @Date 2022/3/14
 */
public interface MonsterQueryService{

    List<MonsterBO> queryAll() throws ExecutionException;

    List<MonsterBO> batchQueryByMonsterIds(List<Integer> monsterIds);

    PageBO<MonsterBO> pageQueryByMonsterName(String monsterName, Integer pageNum, Integer pageSize) throws ExecutionException;
}
