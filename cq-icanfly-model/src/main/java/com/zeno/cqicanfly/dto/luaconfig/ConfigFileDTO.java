package com.zeno.cqicanfly.dto.luaconfig;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author zeno
 * @Date 2022/3/13
 */
@Data
public class ConfigFileDTO implements Serializable {

    private Integer fileId;

    private String filePath;

    private String fileName;

    private String fileLuaTableHeader;

    private Boolean toPhpStatus;
}
