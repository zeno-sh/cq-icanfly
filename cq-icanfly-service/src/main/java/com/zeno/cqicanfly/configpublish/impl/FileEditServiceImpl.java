package com.zeno.cqicanfly.configpublish.impl;

import com.google.common.base.Preconditions;
import com.zeno.cqicanfly.configpublish.FileEditService;
import com.zeno.cqicanfly.dto.luaconfig.FileEditDTO;
import com.zeno.cqicanfly.enums.FileEditStatusEnum;
import com.zeno.cqicanfly.exception.DbQueryException;
import com.zeno.cqicanfly.mybatis.entity.FileEditPO;
import com.zeno.cqicanfly.repository.FileEditRepository;
import com.zeno.cqicanfly.utils.BeanCopyUtils;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author zeno
 * @Date 2022/3/13
 */
@Service
public class FileEditServiceImpl implements FileEditService {

    @Autowired
    private FileEditRepository fileEditRepository;

    @Override
    public Boolean modifyFileConfig(Integer fileId, String fileConfig, String fileJson) {

        Preconditions.checkArgument(StringUtils.isNotBlank(fileConfig), "lua配置文件内容为空");
        Preconditions.checkArgument(fileId != null, "文件Id为空");

        int version = 1;
        FileEditPO po = new FileEditPO();
        po.setFileId(fileId);
        po.setFileConfig(fileConfig);
        po.setStatus(FileEditStatusEnum.STORAGE.getCode());
        po.setFileJson(fileJson);
        List<FileEditPO> fileEditPOS = fileEditRepository.queryByFileId(fileId);
        if (CollectionUtils.isNotEmpty(fileEditPOS)) {
            version = fileEditPOS.get(0).getVersion() + 1;
        }
        po.setVersion(version);
        return fileEditRepository.insert(po);
    }

    @Override
    public Boolean modifyFileEditStatus(Integer editId, Integer status) {
        return null;
    }

    @Override
    public FileEditDTO queryPublishByFileId(Integer fileId) {
        FileEditPO po = fileEditRepository.queryByFileIdAndStatus(fileId, FileEditStatusEnum.PUBLISH.getCode());
        if (po == null) {
            throw new DbQueryException("没有查询到最新的发布记录");
        }
        return BeanCopyUtils.copyFromObj(po, FileEditDTO.class);
    }
}
