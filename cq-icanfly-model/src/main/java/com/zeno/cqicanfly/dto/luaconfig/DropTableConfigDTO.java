package com.zeno.cqicanfly.dto.luaconfig;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Data
public class DropTableConfigDTO implements Serializable {
    private Integer id;

    private Integer type;

    private List<DropItemConfigDTO> table;

    private Map timeLimit;

    private Map weeklimit;

    private Integer isDropbest;

    private Integer loottype;

    private Integer limitopenserverDay;

    private Integer closeopenday;
}
