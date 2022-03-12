package com.zeno.cqicanfly.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 合成公式
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MergeTable implements Serializable {
    /**
     * 0=道具
     */
    private Integer type;
    /**
     * 道具Id
     */
    private Integer id;
    /**
     * 合成数量
     */
    private Integer count;
}
