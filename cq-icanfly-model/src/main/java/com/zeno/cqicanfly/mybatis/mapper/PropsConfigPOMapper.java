package com.zeno.cqicanfly.mybatis.mapper;

import com.zeno.cqicanfly.mybatis.entity.PropsConfigPO;
import com.zeno.cqicanfly.mybatis.entity.PropsConfigPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PropsConfigPOMapper {
    long countByExample(PropsConfigPOExample example);

    int deleteByExample(PropsConfigPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PropsConfigPO record);

    int insertSelective(PropsConfigPO record);

    List<PropsConfigPO> selectByExample(PropsConfigPOExample example);

    PropsConfigPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PropsConfigPO record, @Param("example") PropsConfigPOExample example);

    int updateByExample(@Param("record") PropsConfigPO record, @Param("example") PropsConfigPOExample example);

    int updateByPrimaryKeySelective(PropsConfigPO record);

    int updateByPrimaryKey(PropsConfigPO record);
}