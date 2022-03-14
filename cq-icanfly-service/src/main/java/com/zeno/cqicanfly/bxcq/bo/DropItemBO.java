package com.zeno.cqicanfly.bxcq.bo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author zeno
 * @Date 2022/3/14
 */
@Data
public class DropItemBO implements Serializable {
    /**
     * 掉落表Id
     */
    private Integer dropTableId;
    /**
     * 掉落表类型
     */
    private Integer dropTableType;
    /**
     * 掉落表类型
     */
    private String dropTableTypeStr;
    /**
     * 物品爆率
     */
    private Integer rate;
    /**
     * 计算后的爆率
     */
    private String finalRate;
    /**
     * 物品Id
     */
    private Integer itemId;
    /**
     * 物品名称
     */
    private String itemName;
    /**
     * 物品类型
     *
     * @see com.zeno.cqicanfly.bxcq.enums.AwardTypeEnum
     */
    private Integer itemType;
    /**
     * 物品类型
     */
    private String itemTypeStr;
    /**
     * 掉落数量
     */
    private Integer count;
}
