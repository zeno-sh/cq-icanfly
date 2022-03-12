package com.zeno.cqicanfly.repository;

import com.zeno.cqicanfly.mybatis.entity.*;
import com.zeno.cqicanfly.mybatis.mapper.ItemMergePOMapper;
import com.zeno.cqicanfly.mybatis.mapper.MergeConfigPOMapper;
import com.zeno.cqicanfly.mybatis.mapper.MergeTotalPOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class MergeRepositoryService {
    @Autowired
    private MergeTotalPOMapper mergeTotalPOMapper;

    @Autowired
    private MergeConfigPOMapper mergeConfigPOMapper;

    @Autowired
    private ItemMergePOMapper itemMergePOMapper;

    /**
     * 一级合成目录
     *
     * @param records
     */
    public void insertMergeTotal(List<MergeTotalPO> records) {
        records.forEach(record -> {
            if (mergeTotalPOMapper.selectByPrimaryKey(record.getId()) == null) {
                mergeTotalPOMapper.insert(record);
            }
        });
    }

    /**
     * 二级合成目录
     *
     * @param records
     */
    public void insertMergeConfig(List<MergeConfigPO> records) {
        records.forEach(record -> {
            mergeConfigPOMapper.insert(record);
        });
    }

    public void insertItemMerge(List<ItemMergePO> records) {
        records.forEach(record -> {
            if (loadByFirstId(record.getEid()) == null) {
                itemMergePOMapper.insertSelective(record);
            }
        });
    }

    public MergeConfigPO queryMergeConfigByName(String name) {
        MergeConfigPOExample example = new MergeConfigPOExample();
        MergeConfigPOExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo(name);
        List<MergeConfigPO> mergeConfigPOS = mergeConfigPOMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(mergeConfigPOS)) {
            return null;
        }
        return mergeConfigPOS.get(0);
    }

    public Integer queryMaxEid() {
        List<ItemMergePO> list = findAllItemMerge(" Eid desc");
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        return list.get(0).getEid();
    }

    public List<ItemMergePO> findAllItemMerge(String orderBy) {
        ItemMergePOExample example = new ItemMergePOExample();
        example.setOrderByClause(orderBy);
        return itemMergePOMapper.selectByExample(example);
    }

    public List<MergeConfigPO> findAllSecondMerge() {
        MergeConfigPOExample example = new MergeConfigPOExample();
        return mergeConfigPOMapper.selectByExample(example);
    }


    private MergeConfigPO loadMergeConfigByFirstId(Integer firstId) {
        MergeConfigPOExample example = new MergeConfigPOExample();
        MergeConfigPOExample.Criteria criteria = example.createCriteria();
        criteria.andFirstIndexEqualTo(firstId);
        List<MergeConfigPO> mergeConfigPOS = mergeConfigPOMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(mergeConfigPOS)) {
            return null;
        }
        return mergeConfigPOS.get(0);
    }

    private ItemMergePO loadByFirstId(Integer eid) {
        ItemMergePOExample example = new ItemMergePOExample();
        ItemMergePOExample.Criteria criteria = example.createCriteria();
        criteria.andEidEqualTo(eid);
        List<ItemMergePO> list = itemMergePOMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        return list.get(0);
    }

}
