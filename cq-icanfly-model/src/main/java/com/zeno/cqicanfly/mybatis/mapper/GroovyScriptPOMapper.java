package com.zeno.cqicanfly.mybatis.mapper;

import com.zeno.cqicanfly.mybatis.entity.GroovyScriptPO;
import com.zeno.cqicanfly.mybatis.entity.GroovyScriptPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroovyScriptPOMapper {
    long countByExample(GroovyScriptPOExample example);

    int deleteByExample(GroovyScriptPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GroovyScriptPO record);

    int insertSelective(GroovyScriptPO record);

    List<GroovyScriptPO> selectByExample(GroovyScriptPOExample example);

    GroovyScriptPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GroovyScriptPO record, @Param("example") GroovyScriptPOExample example);

    int updateByExample(@Param("record") GroovyScriptPO record, @Param("example") GroovyScriptPOExample example);

    int updateByPrimaryKeySelective(GroovyScriptPO record);

    int updateByPrimaryKey(GroovyScriptPO record);
}