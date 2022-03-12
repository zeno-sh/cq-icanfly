package com.zeno.cqicanfly.mybatis.mapper;

import com.zeno.cqicanfly.mybatis.entity.ScenesConfigPO;
import com.zeno.cqicanfly.mybatis.entity.ScenesConfigPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScenesConfigPOMapper {
    long countByExample(ScenesConfigPOExample example);

    int deleteByExample(ScenesConfigPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScenesConfigPO record);

    int insertSelective(ScenesConfigPO record);

    List<ScenesConfigPO> selectByExample(ScenesConfigPOExample example);

    ScenesConfigPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ScenesConfigPO record, @Param("example") ScenesConfigPOExample example);

    int updateByExample(@Param("record") ScenesConfigPO record, @Param("example") ScenesConfigPOExample example);

    int updateByPrimaryKeySelective(ScenesConfigPO record);

    int updateByPrimaryKey(ScenesConfigPO record);
}