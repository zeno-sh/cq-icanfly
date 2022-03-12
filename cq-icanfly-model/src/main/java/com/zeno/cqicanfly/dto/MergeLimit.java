package com.zeno.cqicanfly.dto;

import lombok.Data;

/**
 * 合成条件
 */
@Data
public class MergeLimit {
    /**
     * 官职
     */
    private Integer office;
    /**
     * VIP等级
     */
    private Integer vip;
    /**
     * 转生等级
     */
    private Integer zsLevel;
}
