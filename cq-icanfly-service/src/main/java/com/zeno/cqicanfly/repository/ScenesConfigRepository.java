package com.zeno.cqicanfly.repository;

import com.zeno.cqicanfly.mybatis.entity.ScenesConfigPO;
import com.zeno.cqicanfly.mybatis.entity.ScenesConfigPOExample;
import com.zeno.cqicanfly.mybatis.mapper.ScenesConfigPOMapper;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ScenesConfigRepository {

    @Autowired
    private ScenesConfigPOMapper scenesConfigPOMapper;

    public void insert(List<ScenesConfigPO> records) {
        if (CollectionUtils.isNotEmpty(records)) {
            records.forEach(record->{
                if (queryByScenesId(record.getSceneid()) == null) {
                    scenesConfigPOMapper.insertSelective(record);
                }
            });
        }
    }

    public ScenesConfigPO queryByScenesId(Integer scenesId) {
        ScenesConfigPOExample example = new ScenesConfigPOExample();
        ScenesConfigPOExample.Criteria criteria = example.createCriteria();
        criteria.andSceneidEqualTo(scenesId);
        List<ScenesConfigPO> scenesConfigPOS = scenesConfigPOMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(scenesConfigPOS)) {
            return scenesConfigPOS.get(0);
        }
        return null;
    }
}
