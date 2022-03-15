package com.zeno.cqicanfly.bxcq.service;

import com.zeno.cqicanfly.bxcq.bo.DropTableBO;

import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * @Author zeno
 * @Date 2022/3/15
 */
public interface DropTableQueryService {

    List<DropTableBO> queryByDropTableId(Integer dropTableId) throws ExecutionException;
}
