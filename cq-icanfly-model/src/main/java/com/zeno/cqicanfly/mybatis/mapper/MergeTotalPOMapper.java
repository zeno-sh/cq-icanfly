package com.zeno.cqicanfly.mybatis.mapper;

import com.zeno.cqicanfly.mybatis.entity.MergeTotalPO;
import com.zeno.cqicanfly.mybatis.entity.MergeTotalPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MergeTotalPOMapper {
    long countByExample(MergeTotalPOExample example);

    int deleteByExample(MergeTotalPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MergeTotalPO record);

    int insertSelective(MergeTotalPO record);

    List<MergeTotalPO> selectByExample(MergeTotalPOExample example);

    MergeTotalPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MergeTotalPO record, @Param("example") MergeTotalPOExample example);

    int updateByExample(@Param("record") MergeTotalPO record, @Param("example") MergeTotalPOExample example);

    int updateByPrimaryKeySelective(MergeTotalPO record);

    int updateByPrimaryKey(MergeTotalPO record);
}