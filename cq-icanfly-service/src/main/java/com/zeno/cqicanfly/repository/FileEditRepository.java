package com.zeno.cqicanfly.repository;

import com.zeno.cqicanfly.exception.DbQueryException;
import com.zeno.cqicanfly.mybatis.entity.FileEditPO;
import com.zeno.cqicanfly.mybatis.entity.FileEditPOExample;
import com.zeno.cqicanfly.mybatis.mapper.FileEditPOMapper;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author zeno
 * @Date 2022/3/13
 */
@Repository
public class FileEditRepository {
    @Autowired
    private FileEditPOMapper fileEditPOMapper;

    public boolean insert(FileEditPO fileEditPO) {
        return fileEditPOMapper.insertSelective(fileEditPO) > 0;
    }

    public List<FileEditPO> queryByFileId(Integer fileId) {
        FileEditPOExample example = new FileEditPOExample();
        example.setOrderByClause(" version desc");
        FileEditPOExample.Criteria criteria = example.createCriteria();
        criteria.andFileIdEqualTo(fileId);
        List<FileEditPO> fileEditPOS = fileEditPOMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(fileEditPOS)) {
            throw new DbQueryException("没有找到编辑信息");
        }
        return fileEditPOS;
    }

    public boolean updateStatus(Integer editId, Integer status) {
        FileEditPO po = fileEditPOMapper.selectByPrimaryKey(editId);
        if (po == null) {
            throw new DbQueryException("没有找到编辑信息");
        }
        po.setStatus(status);
        return fileEditPOMapper.updateByPrimaryKeySelective(po) > 0;
    }
}
