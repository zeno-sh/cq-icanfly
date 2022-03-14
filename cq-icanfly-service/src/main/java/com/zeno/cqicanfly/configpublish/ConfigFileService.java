package com.zeno.cqicanfly.configpublish;

import com.zeno.cqicanfly.dto.luaconfig.ConfigFileDTO;
import com.zeno.cqicanfly.exception.DbQueryException;
import com.zeno.cqicanfly.mybatis.entity.ConfigFilePO;

/**
 * @Author zeno
 * @Date 2022/3/13
 */
public interface ConfigFileService {

    /**
     * 保存配置文件信息
     *
     * @param fileName     文件名
     * @param relativePath 相对路径
     * @param fileHeader   文件头
     * @param toPhp        是否提供给前端服务器
     * @return
     */
    Boolean saveConfigFile(String fileName, String relativePath, String fileHeader, Integer toPhp);

    ConfigFileDTO queryByFileId(Integer fileId) throws DbQueryException;

    ConfigFilePO queryByFileName(String fileName) throws DbQueryException;
}
