package com.zeno.cqicanfly.mybatis.mapper;

import com.zeno.cqicanfly.mybatis.entity.FlagsConfigPO;
import com.zeno.cqicanfly.mybatis.entity.FlagsConfigPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlagsConfigPOMapper {
    long countByExample(FlagsConfigPOExample example);

    int deleteByExample(FlagsConfigPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FlagsConfigPO record);

    int insertSelective(FlagsConfigPO record);

    List<FlagsConfigPO> selectByExample(FlagsConfigPOExample example);

    FlagsConfigPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FlagsConfigPO record, @Param("example") FlagsConfigPOExample example);

    int updateByExample(@Param("record") FlagsConfigPO record, @Param("example") FlagsConfigPOExample example);

    int updateByPrimaryKeySelective(FlagsConfigPO record);

    int updateByPrimaryKey(FlagsConfigPO record);
}