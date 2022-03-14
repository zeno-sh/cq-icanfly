package com.zeno.cqicanfly.bxcq.bo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author zeno
 * @Date 2022/3/14
 */
@Data
public class DropTableBO implements Serializable {

    /**
     * 掉落组类型
     *
     * @see com.zeno.cqicanfly.bxcq.enums.DropTypeEnum
     */
    private Integer dropGroupType;
    /**
     * 掉落类型
     *
     * @see com.zeno.cqicanfly.bxcq.enums.DropTypeEnum
     */
    private Integer dropTableType;
    /**
     * 掉落类型
     */
    private String dropTableTypeStr;
    /**
     * 爆率
     */
    private Integer rate;
    /**
     * 计算后的爆率
     */
    private String finalRate;
    /**
     * 掉落表Id
     */
    private Integer dropTableId;
    /**
     * 是否掉落极品
     * 1=是
     */
    private Integer isDropBest;
    /**
     * 掉落物品
     */
    private List<DropItemBO> dropItems;
}
