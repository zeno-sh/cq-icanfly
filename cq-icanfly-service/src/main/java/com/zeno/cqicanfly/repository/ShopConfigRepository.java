package com.zeno.cqicanfly.repository;

import com.zeno.cqicanfly.mybatis.entity.ShopConfigPO;
import com.zeno.cqicanfly.mybatis.entity.ShopConfigPOExample;
import com.zeno.cqicanfly.mybatis.mapper.ShopConfigPOMapper;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ShopConfigRepository {
    @Autowired
    private ShopConfigPOMapper shopConfigPOMapper;

    public void insert(List<ShopConfigPO> records) {
        if (CollectionUtils.isNotEmpty(records)) {
            records.forEach(record->{
                if (queryByShopId(record.getShopid()) == null) {
                    shopConfigPOMapper.insertSelective(record);
                }
            });
        }
    }

    public ShopConfigPO queryByShopId(Integer shopId) {
        ShopConfigPOExample example = new ShopConfigPOExample();
        ShopConfigPOExample.Criteria criteria = example.createCriteria();
        criteria.andShopidEqualTo(shopId);
        List<ShopConfigPO> shopConfigPOS = shopConfigPOMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(shopConfigPOS)) {
            return null;
        }
        return shopConfigPOS.get(0);
    }

    public List<ShopConfigPO> queryAll(){
        ShopConfigPOExample example = new ShopConfigPOExample();
        example.setOrderByClause(" shopid desc");
        return shopConfigPOMapper.selectByExample(example);
    }
}
