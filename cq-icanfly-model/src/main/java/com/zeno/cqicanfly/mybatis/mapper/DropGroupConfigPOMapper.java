package com.zeno.cqicanfly.mybatis.mapper;

import com.zeno.cqicanfly.mybatis.entity.DropGroupConfigPO;
import com.zeno.cqicanfly.mybatis.entity.DropGroupConfigPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DropGroupConfigPOMapper {
    long countByExample(DropGroupConfigPOExample example);

    int deleteByExample(DropGroupConfigPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DropGroupConfigPO record);

    int insertSelective(DropGroupConfigPO record);

    List<DropGroupConfigPO> selectByExample(DropGroupConfigPOExample example);

    DropGroupConfigPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DropGroupConfigPO record, @Param("example") DropGroupConfigPOExample example);

    int updateByExample(@Param("record") DropGroupConfigPO record, @Param("example") DropGroupConfigPOExample example);

    int updateByPrimaryKeySelective(DropGroupConfigPO record);

    int updateByPrimaryKey(DropGroupConfigPO record);
}