package com.zeno.cqicanfly.bxcq.service;

import com.zeno.cqicanfly.bxcq.bo.StdItemBO;

import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * @Author zeno
 * @Date 2022/3/15
 */
public interface StdItemQueryService {

    List<StdItemBO> queryAllItems() throws ExecutionException;

    List<StdItemBO> batchQueryByItemIds(List<Integer> itemIds) throws ExecutionException;

}
