package com.zeno.cqicanfly.bxcq.service.impl;

import java.util.List;

/**
 * @Author zeno
 * @Date 2022/3/15
 */
public interface BaseService<T> {

    /**
     * json对象转领域对象
     *
     * @param jsonStr
     * @return
     */
    List<T> jsonObjConverterBo(String jsonStr);
}
