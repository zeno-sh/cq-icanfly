package com.zeno.cqicanfly.repository;

import com.github.pagehelper.IPage;
import lombok.Data;
import lombok.experimental.Accessors;

@Data   // 为省略冗余代码使用lombok 实际应有常规Getter/Setter Construction toString等
@Accessors(chain = true) // 此lombok注解是为了实现 Entity伪Build 譬如: entity.setX(x).setY(y)
public class PageParam<T> implements IPage {

    //  description = "页码", defaultValue =  1
    private Integer pageNum = 1;

    //  description = "页数", defaultValue = 20
    private Integer pageSize = 20;

    //  description = "排序", example = "id desc"
    private String orderBy;

    //  description = "参数"
    private T param;

    public PageParam<T> setOrderBy(String orderBy) {
        this.orderBy = orderBy; // 此处可优化 优化详情且看解析
        return this;
    }
}
