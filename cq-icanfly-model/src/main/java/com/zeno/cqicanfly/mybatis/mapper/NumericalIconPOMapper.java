package com.zeno.cqicanfly.mybatis.mapper;

import com.zeno.cqicanfly.mybatis.entity.NumericalIconPO;
import com.zeno.cqicanfly.mybatis.entity.NumericalIconPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NumericalIconPOMapper {
    long countByExample(NumericalIconPOExample example);

    int deleteByExample(NumericalIconPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NumericalIconPO record);

    int insertSelective(NumericalIconPO record);

    List<NumericalIconPO> selectByExample(NumericalIconPOExample example);

    NumericalIconPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NumericalIconPO record, @Param("example") NumericalIconPOExample example);

    int updateByExample(@Param("record") NumericalIconPO record, @Param("example") NumericalIconPOExample example);

    int updateByPrimaryKeySelective(NumericalIconPO record);

    int updateByPrimaryKey(NumericalIconPO record);
}