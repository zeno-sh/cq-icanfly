package com.zeno.cqicanfly.dto.luaconfig;

import lombok.Data;

import java.io.Serializable;

@Data
public class DropItemConfigDTO implements Serializable {
    private Integer id;
    private Integer type;
    private Integer count;
    private Integer rate;

}
