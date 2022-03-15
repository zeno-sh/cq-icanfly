package com.zeno.cqicanfly.bxcq.bo;

import lombok.Data;

import java.util.List;

/**
 * @Author zeno
 * @Date 2022/3/16
 */
@Data
public class PageBO<T> {

    private Integer pageSize;
    private Integer pageNum;
    private Integer total;
    private Integer pageCount;
    private List<T> list;
}
