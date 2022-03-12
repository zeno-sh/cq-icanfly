package com.zeno.cqicanfly.repository;

import com.zeno.cqicanfly.mybatis.entity.DropGroupConfigPO;
import com.zeno.cqicanfly.mybatis.entity.DropGroupConfigPOExample;
import com.zeno.cqicanfly.mybatis.mapper.DropGroupConfigPOMapper;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DropGroupConfigRepository {
    @Autowired
    private DropGroupConfigPOMapper dropGroupConfigPOMapper;

    public void insert(List<DropGroupConfigPO> records) {
        if (CollectionUtils.isNotEmpty(records)) {
            records.forEach(record->{
                if (queryById(record.getId()) == null) {
                    dropGroupConfigPOMapper.insertSelective(record);
                }
            });
        }
    }

    public DropGroupConfigPO queryById(Integer id) {
        return dropGroupConfigPOMapper.selectByPrimaryKey(id);
    }
}
