package com.zeno.cqicanfly.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class DropTableDTO implements Serializable {
    private Integer dropTableId;
    private String dropType;
    private Integer tableRate;
    private String tableRateStr;
    private String timeLimit;
    private String weekLimit;
    private List<DropItemDTO> dropItems;
}
