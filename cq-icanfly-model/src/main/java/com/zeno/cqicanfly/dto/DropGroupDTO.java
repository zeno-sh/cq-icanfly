package com.zeno.cqicanfly.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class DropGroupDTO implements Serializable {

    private Integer monsterId;
    private String monsterName;
    private Integer dropGroupId;
    private String dropGroupType;
    private List<DropTableDTO> dropTables;

}
