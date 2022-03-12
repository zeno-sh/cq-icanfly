package com.zeno.cqicanfly.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class BuyTypeDTO implements Serializable {

    // [{"limit":[{"times":1,"value":0}],"type":3}]

    private Integer type;

    private List<BuyLimitDTO> limit;
}
