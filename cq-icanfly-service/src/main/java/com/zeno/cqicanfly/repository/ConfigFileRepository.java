package com.zeno.cqicanfly.repository;

import com.zeno.cqicanfly.exception.DbQueryException;
import com.zeno.cqicanfly.exception.DbWriteException;
import com.zeno.cqicanfly.mybatis.entity.ConfigFilePO;
import com.zeno.cqicanfly.mybatis.entity.ConfigFilePOExample;
import com.zeno.cqicanfly.mybatis.mapper.ConfigFilePOMapper;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author zeno
 * @Date 2022/3/13
 */
@Repository
public class ConfigFileRepository {
    @Autowired
    private ConfigFilePOMapper configFilePOMapper;

    public boolean insert(ConfigFilePO po) {
        if (queryByFileName(po.getFileName()) != null) {
            throw new DbWriteException("已存在同名文件！");
        }
        return configFilePOMapper.insertSelective(po) > 0;
    }

    public ConfigFilePO queryByFileName(String fileName) {
        ConfigFilePOExample example = new ConfigFilePOExample();
        ConfigFilePOExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(fileName)) {
            criteria.andFileNameEqualTo(fileName);
        }
        List<ConfigFilePO> configFilePOS = configFilePOMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(configFilePOS)) {
            throw new DbQueryException("没有查询到文件信息~");
        }
        return configFilePOS.get(0);
    }

    public ConfigFilePO queryByFileIdAndFileName(Integer fileId, String fileName) {
        ConfigFilePOExample example = new ConfigFilePOExample();
        ConfigFilePOExample.Criteria criteria = example.createCriteria();
        if (fileId != null) {
            criteria.andIdEqualTo(fileId);
        }
        if (StringUtils.isNotBlank(fileName)) {
            criteria.andFileNameEqualTo(fileName);
        }
        List<ConfigFilePO> configFilePOS = configFilePOMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(configFilePOS)) {
            throw new DbQueryException("没有查询到文件信息~");
        }
        return configFilePOS.get(0);
    }
}
