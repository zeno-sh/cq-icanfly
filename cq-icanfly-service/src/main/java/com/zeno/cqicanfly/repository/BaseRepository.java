package com.zeno.cqicanfly.repository;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zeno.cqicanfly.utils.BeanCopyUtils;

import java.util.List;

public interface BaseRepository<PO, Result> {

    /**
     * 分页查询
     *
     * @param param 请求参数DTO
     * @return 分页集合
     */
    default PageInfo<Result> page(PageParam<PO> param) {
        PageInfo<PO> pageInfo = PageHelper.startPage(param).doSelectPageInfo(() -> list(param.getParam()));
        PageInfo newPageInfo = BeanCopyUtils.copyFromObj(pageInfo, PageInfo.class);
        newPageInfo.setList(convertPoToDto(pageInfo.getList()));
        return newPageInfo;
    }

    ;

    /**
     * 集合查询
     *
     * @param param 查询参数
     * @return 查询响应
     */
    List<Result> list(PO param);

    /**
     * 将PO结果转换成DTO
     *
     * @param list
     * @return
     */
    List<Result> convertPoToDto(List<PO> list);
}
