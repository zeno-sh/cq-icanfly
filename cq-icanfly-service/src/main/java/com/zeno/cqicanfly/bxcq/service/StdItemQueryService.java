package com.zeno.cqicanfly.bxcq.service;

import com.zeno.cqicanfly.bxcq.bo.StdItemBO;

import java.util.List;

/**
 * @Author zeno
 * @Date 2022/3/15
 */
public interface StdItemQueryService {

    List<StdItemBO> queryAllItems();

    List<StdItemBO> batchQueryByItemIds(List<Integer> itemIds);

}
