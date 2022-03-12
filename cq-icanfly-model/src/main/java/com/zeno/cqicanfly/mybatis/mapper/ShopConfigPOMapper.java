package com.zeno.cqicanfly.mybatis.mapper;

import com.zeno.cqicanfly.mybatis.entity.ShopConfigPO;
import com.zeno.cqicanfly.mybatis.entity.ShopConfigPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopConfigPOMapper {
    long countByExample(ShopConfigPOExample example);

    int deleteByExample(ShopConfigPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopConfigPO record);

    int insertSelective(ShopConfigPO record);

    List<ShopConfigPO> selectByExample(ShopConfigPOExample example);

    ShopConfigPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopConfigPO record, @Param("example") ShopConfigPOExample example);

    int updateByExample(@Param("record") ShopConfigPO record, @Param("example") ShopConfigPOExample example);

    int updateByPrimaryKeySelective(ShopConfigPO record);

    int updateByPrimaryKey(ShopConfigPO record);
}