package com.zeno.cqicanfly.repository;

import com.google.common.collect.Lists;
import com.zeno.cqicanfly.mybatis.entity.DropTablePO;
import com.zeno.cqicanfly.mybatis.entity.DropTablePOExample;
import com.zeno.cqicanfly.mybatis.mapper.DropTablePOMapper;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DropTableRepository {
    @Autowired
    private DropTablePOMapper dropTablePOMapper;

    public void insert(List<DropTablePO> records) {
        if (CollectionUtils.isNotEmpty(records)) {
            records.forEach(record -> {
                if (queryById(record.getId()) == null) {
                    dropTablePOMapper.insertSelective(record);
                }
            });
        }
    }

    public DropTablePO queryById(Integer id) {
        return dropTablePOMapper.selectByPrimaryKey(id);
    }

    public List<DropTablePO> batchQueryId(List<Integer> ids) {
        DropTablePOExample example = new DropTablePOExample();
        DropTablePOExample.Criteria criteria = example.createCriteria();
        criteria.andIdIn(ids);
        return dropTablePOMapper.selectByExample(example);
    }
}
