package com.zeno.cqicanfly.mybatis.mapper;

import com.zeno.cqicanfly.mybatis.entity.ConfigFilePO;
import com.zeno.cqicanfly.mybatis.entity.ConfigFilePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigFilePOMapper {
    long countByExample(ConfigFilePOExample example);

    int deleteByExample(ConfigFilePOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ConfigFilePO record);

    int insertSelective(ConfigFilePO record);

    List<ConfigFilePO> selectByExample(ConfigFilePOExample example);

    ConfigFilePO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ConfigFilePO record, @Param("example") ConfigFilePOExample example);

    int updateByExample(@Param("record") ConfigFilePO record, @Param("example") ConfigFilePOExample example);

    int updateByPrimaryKeySelective(ConfigFilePO record);

    int updateByPrimaryKey(ConfigFilePO record);
}