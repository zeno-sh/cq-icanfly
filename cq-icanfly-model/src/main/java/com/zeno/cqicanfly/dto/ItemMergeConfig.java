package com.zeno.cqicanfly.dto;

import lombok.Data;

import java.util.List;

@Data
public class ItemMergeConfig {

    private Integer index;
    private Integer second_index;
    private Integer Eid;
    private Compose compose;
    private List<MergeTable> table;
    private Integer level;
    private Integer circle;
    private Integer openserverday;
    private MergeLimit mergelimit;
    private String limitTips;
    private Integer area;
    private String text;
    private Integer redpoint;
    private RedPoint redpointlimit;
    private String buttontxt10;
    private Integer mergebutton10;
}
