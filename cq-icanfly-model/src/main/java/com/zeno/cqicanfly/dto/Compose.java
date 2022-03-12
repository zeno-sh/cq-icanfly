package com.zeno.cqicanfly.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 合成结果
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Compose {
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
