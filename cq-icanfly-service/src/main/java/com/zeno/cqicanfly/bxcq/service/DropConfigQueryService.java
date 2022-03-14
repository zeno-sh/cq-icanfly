package com.zeno.cqicanfly.bxcq.service;

import com.zeno.cqicanfly.bxcq.bo.DropGroupBO;

/**
 * @Author zeno
 * @Date 2022/3/15
 */
public interface DropConfigQueryService {

    DropGroupBO queryByDropGroupId(Integer dropGroupId);
}
