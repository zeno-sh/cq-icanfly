package com.zeno.cqicanfly.configpublish.impl;

import com.google.common.base.Preconditions;
import com.zeno.cqicanfly.configpublish.ConfigFileService;
import com.zeno.cqicanfly.dto.luaconfig.ConfigFileDTO;
import com.zeno.cqicanfly.enums.ToPhpEnum;
import com.zeno.cqicanfly.exception.DbQueryException;
import com.zeno.cqicanfly.exception.QueryException;
import com.zeno.cqicanfly.mybatis.entity.ConfigFilePO;
import com.zeno.cqicanfly.repository.ConfigFileRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author zeno
 * @Date 2022/3/13
 */
@Service
public class ConfigFileServiceImpl implements ConfigFileService {

    @Autowired
    private ConfigFileRepository configFileRepository;

    @Override
    public Boolean saveConfigFile(String fileName, String relativePath, String fileHeader, Integer toPhp) {

        Preconditions.checkArgument(StringUtils.isNotBlank(fileName), "文件名为空");
        Preconditions.checkArgument(StringUtils.isNotBlank(relativePath), "文件相对路径为空");

        ConfigFilePO po = new ConfigFilePO();
        po.setFilePath(relativePath);
        po.setFileName(fileName);
        if (StringUtils.isNotBlank(fileHeader)) {
            po.setFileLuaTableHeader(fileHeader);
        }
        if (toPhp != null) {
            Preconditions.checkArgument(ToPhpEnum.contains(toPhp), "是否发送给前端状态不要瞎填~~");
            po.setToPhpStatus(toPhp);
        }

        return configFileRepository.insert(po);
    }

    @Override
    public ConfigFileDTO queryByFileId(Integer fileId) throws DbQueryException {
        return null;
    }

    @Override
    public ConfigFileDTO queryByFileName(String fileName) throws DbQueryException {
        ConfigFilePO po = configFileRepository.queryByFileName(fileName);
        if (po == null) {
            throw new QueryException("查询文件失败");
        }
        ConfigFileDTO dto = new ConfigFileDTO();
        dto.setFileId(po.getId());
        dto.setFilePath(po.getFilePath());
        dto.setFileName(po.getFileName());
        dto.setFileLuaTableHeader(po.getFileLuaTableHeader());
        dto.setToPhpStatus(po.getToPhpStatus()==ToPhpEnum.YES.getCode());

        return dto;
    }
}
