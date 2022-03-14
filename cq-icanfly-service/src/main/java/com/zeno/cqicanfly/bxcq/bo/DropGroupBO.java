package com.zeno.cqicanfly.bxcq.bo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author zeno
 * @Date 2022/3/14
 */
@Data
public class DropGroupBO implements Serializable {

    /**
     * 掉落组Id
     */
    private Integer dropGroupId;
    /**
     * 掉落类型
     *
     * @see com.zeno.cqicanfly.bxcq.enums.DropTypeEnum
     */
    private Integer dropType;
    /**
     * 掉落类型
     */
    private String dropTypeStr;
    /**
     * 掉落表
     */
    private List<DropTableBO> dropTables;
}
