package com.zeno.cqicanfly.mybatis.mapper;

import com.zeno.cqicanfly.mybatis.entity.ItemMergePO;
import com.zeno.cqicanfly.mybatis.entity.ItemMergePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemMergePOMapper {
    long countByExample(ItemMergePOExample example);

    int deleteByExample(ItemMergePOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ItemMergePO record);

    int insertSelective(ItemMergePO record);

    List<ItemMergePO> selectByExample(ItemMergePOExample example);

    ItemMergePO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ItemMergePO record, @Param("example") ItemMergePOExample example);

    int updateByExample(@Param("record") ItemMergePO record, @Param("example") ItemMergePOExample example);

    int updateByPrimaryKeySelective(ItemMergePO record);

    int updateByPrimaryKey(ItemMergePO record);
}