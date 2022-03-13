package com.zeno.cqicanfly.mybatis.mapper;

import com.zeno.cqicanfly.mybatis.entity.ConfigPublishPO;
import com.zeno.cqicanfly.mybatis.entity.ConfigPublishPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigPublishPOMapper {
    long countByExample(ConfigPublishPOExample example);

    int deleteByExample(ConfigPublishPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ConfigPublishPO record);

    int insertSelective(ConfigPublishPO record);

    List<ConfigPublishPO> selectByExample(ConfigPublishPOExample example);

    ConfigPublishPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ConfigPublishPO record, @Param("example") ConfigPublishPOExample example);

    int updateByExample(@Param("record") ConfigPublishPO record, @Param("example") ConfigPublishPOExample example);

    int updateByPrimaryKeySelective(ConfigPublishPO record);

    int updateByPrimaryKey(ConfigPublishPO record);
}