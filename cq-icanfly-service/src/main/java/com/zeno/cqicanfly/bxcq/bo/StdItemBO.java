package com.zeno.cqicanfly.bxcq.bo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author zeno
 * @Date 2022/3/15
 */
@Data
public class StdItemBO implements Serializable {
    private Integer itemId;
    private String itemName;
}
