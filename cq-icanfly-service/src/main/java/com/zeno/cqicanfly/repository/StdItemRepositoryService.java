package com.zeno.cqicanfly.repository;

import com.zeno.cqicanfly.mybatis.entity.StdItemsPO;
import com.zeno.cqicanfly.mybatis.entity.StdItemsPOExample;
import com.zeno.cqicanfly.mybatis.mapper.StdItemsPOMapper;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StdItemRepositoryService {
    @Autowired
    private StdItemsPOMapper stdItemsPOMapper;

    public void insert(List<StdItemsPO> recordList) {
        recordList.forEach(record->{
            StdItemsPO existPO = stdItemsPOMapper.selectByPrimaryKey(record.getId());
            if (existPO != null) {
                return;
            }
            stdItemsPOMapper.insertSelective(record);
        });
    }

    public Integer queryItemIdByName(String name) {
        StdItemsPOExample example = new StdItemsPOExample();
        StdItemsPOExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo(name);
        List<StdItemsPO> list = stdItemsPOMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        return list.get(0).getId();
    }

    public List<StdItemsPO> batchQueryByItemId(List<Integer> itemIds) {
        StdItemsPOExample example = new StdItemsPOExample();
        StdItemsPOExample.Criteria criteria = example.createCriteria();
        criteria.andIdIn(itemIds);
        return stdItemsPOMapper.selectByExample(example);
    }

}
