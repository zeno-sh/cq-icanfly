package com.zeno.cqicanfly.mybatis.mapper;

import com.zeno.cqicanfly.mybatis.entity.MonsterConfigPO;
import com.zeno.cqicanfly.mybatis.entity.MonsterConfigPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MonsterConfigPOMapper {
    long countByExample(MonsterConfigPOExample example);

    int deleteByExample(MonsterConfigPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MonsterConfigPO record);

    int insertSelective(MonsterConfigPO record);

    List<MonsterConfigPO> selectByExample(MonsterConfigPOExample example);

    MonsterConfigPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MonsterConfigPO record, @Param("example") MonsterConfigPOExample example);

    int updateByExample(@Param("record") MonsterConfigPO record, @Param("example") MonsterConfigPOExample example);

    int updateByPrimaryKeySelective(MonsterConfigPO record);

    int updateByPrimaryKey(MonsterConfigPO record);
}