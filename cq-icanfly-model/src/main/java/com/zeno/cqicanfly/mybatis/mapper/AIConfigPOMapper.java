package com.zeno.cqicanfly.mybatis.mapper;

import com.zeno.cqicanfly.mybatis.entity.AIConfigPO;
import com.zeno.cqicanfly.mybatis.entity.AIConfigPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AIConfigPOMapper {
    long countByExample(AIConfigPOExample example);

    int deleteByExample(AIConfigPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AIConfigPO record);

    int insertSelective(AIConfigPO record);

    List<AIConfigPO> selectByExample(AIConfigPOExample example);

    AIConfigPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AIConfigPO record, @Param("example") AIConfigPOExample example);

    int updateByExample(@Param("record") AIConfigPO record, @Param("example") AIConfigPOExample example);

    int updateByPrimaryKeySelective(AIConfigPO record);

    int updateByPrimaryKey(AIConfigPO record);
}