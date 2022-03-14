package com.zeno.cqicanfly.dto.luaconfig;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author zeno
 * @Date 2022/3/15
 */
@Data
public class FileEditDTO implements Serializable {

    private Integer fileId;
    private Integer editId;
//    private String fileConfig;
    private String fileJson;
    private Integer version;
    private Integer status;
}
