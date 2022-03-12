package com.zeno.cqicanfly.repository;

import com.google.common.collect.Lists;
import com.zeno.cqicanfly.dto.MonsterDTO;
import com.zeno.cqicanfly.mybatis.entity.MonsterConfigPO;
import com.zeno.cqicanfly.mybatis.entity.MonsterConfigPOExample;
import com.zeno.cqicanfly.mybatis.mapper.MonsterConfigPOMapper;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class MonsterRepository implements BaseRepository<MonsterConfigPO, MonsterDTO> {

    @Autowired
    private MonsterConfigPOMapper monsterConfigPOMapper;

    public void insert(List<MonsterConfigPO> records) {
        if (CollectionUtils.isNotEmpty(records)) {
            records.forEach(record -> {
                if (queryByMonsterEntityId(record.getEntityid()) == null) {
                    monsterConfigPOMapper.insertSelective(record);
                }
            });
        }
    }

    public List<MonsterConfigPO> queryAll() {
        MonsterConfigPOExample example = new MonsterConfigPOExample();
        MonsterConfigPOExample.Criteria criteria = example.createCriteria();
        return monsterConfigPOMapper.selectByExample(example);
    }

    public MonsterConfigPO queryByMonsterEntityId(Integer entityId) {
        MonsterConfigPOExample example = new MonsterConfigPOExample();
        MonsterConfigPOExample.Criteria criteria = example.createCriteria();
        criteria.andEntityidEqualTo(entityId);
        List<MonsterConfigPO> list = monsterConfigPOMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(list)) {
            return list.get(0);
        }
        return null;
    }

    public List<MonsterConfigPO> queryByMonsterName(String name) {
        MonsterConfigPOExample example = new MonsterConfigPOExample();
        MonsterConfigPOExample.Criteria criteria = example.createCriteria();
        criteria.andNameLike(name);
        return monsterConfigPOMapper.selectByExample(example);
    }

    @Override
    public List<MonsterDTO> list(MonsterConfigPO po) {
        MonsterConfigPOExample example = new MonsterConfigPOExample();
        MonsterConfigPOExample.Criteria criteria = example.createCriteria();
        if (po != null && po.getEntityid() != null) {
            criteria.andEntityidEqualTo(po.getEntityid());
        }
        if (po != null && StringUtils.isNotBlank(po.getName())) {
            criteria.andNameLike("%" + po.getName() + "%");
        }
        List<MonsterConfigPO> monsterConfigPOS = monsterConfigPOMapper.selectByExample(example);
        return convertPoToDto(monsterConfigPOS);
    }

    @Override
    public List<MonsterDTO> convertPoToDto(List<MonsterConfigPO> monsterConfigPOS) {
        if (CollectionUtils.isEmpty(monsterConfigPOS)) {
            return Collections.emptyList();
        }
        List<MonsterDTO> monsterDTOList = Lists.newArrayList();
        monsterConfigPOS.forEach(po -> monsterDTOList.add(MonsterDTO.builder()
                .monsterId(po.getEntityid())
                .monsterName(po.getName())
                .dropGroupId(po.getDropid())
                .build()));
        return monsterDTOList;
    }
}
