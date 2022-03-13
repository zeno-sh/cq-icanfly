package com.zeno.cqicanfly.mybatis.mapper;

import com.zeno.cqicanfly.mybatis.entity.PublishLogPO;
import com.zeno.cqicanfly.mybatis.entity.PublishLogPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PublishLogPOMapper {
    long countByExample(PublishLogPOExample example);

    int deleteByExample(PublishLogPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PublishLogPO record);

    int insertSelective(PublishLogPO record);

    List<PublishLogPO> selectByExample(PublishLogPOExample example);

    PublishLogPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PublishLogPO record, @Param("example") PublishLogPOExample example);

    int updateByExample(@Param("record") PublishLogPO record, @Param("example") PublishLogPOExample example);

    int updateByPrimaryKeySelective(PublishLogPO record);

    int updateByPrimaryKey(PublishLogPO record);
}