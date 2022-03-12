package com.zeno.cqicanfly.mybatis.mapper;

import com.zeno.cqicanfly.mybatis.entity.MergeConfigPO;
import com.zeno.cqicanfly.mybatis.entity.MergeConfigPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MergeConfigPOMapper {
    long countByExample(MergeConfigPOExample example);

    int deleteByExample(MergeConfigPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MergeConfigPO record);

    int insertSelective(MergeConfigPO record);

    List<MergeConfigPO> selectByExample(MergeConfigPOExample example);

    MergeConfigPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MergeConfigPO record, @Param("example") MergeConfigPOExample example);

    int updateByExample(@Param("record") MergeConfigPO record, @Param("example") MergeConfigPOExample example);

    int updateByPrimaryKeySelective(MergeConfigPO record);

    int updateByPrimaryKey(MergeConfigPO record);
}