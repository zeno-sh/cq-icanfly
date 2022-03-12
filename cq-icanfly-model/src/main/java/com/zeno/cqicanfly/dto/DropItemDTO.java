package com.zeno.cqicanfly.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class DropItemDTO implements Serializable {
    private Integer id;
    private String itemName;
    private Integer rate;
    private String rateStr;
    private Integer type;
    private Integer count;
    private String dropItemType;
}
