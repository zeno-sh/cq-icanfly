package com.zeno.cqicanfly.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class BuyLimitDTO implements Serializable {

    //[{"limit":[{"times":1,"value":0}],"type":3}]

    private Integer times;

    private Integer value;
}
