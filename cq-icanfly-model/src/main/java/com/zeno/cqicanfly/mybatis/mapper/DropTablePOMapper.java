package com.zeno.cqicanfly.mybatis.mapper;

import com.zeno.cqicanfly.mybatis.entity.DropTablePO;
import com.zeno.cqicanfly.mybatis.entity.DropTablePOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DropTablePOMapper {
    long countByExample(DropTablePOExample example);

    int deleteByExample(DropTablePOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DropTablePO record);

    int insertSelective(DropTablePO record);

    List<DropTablePO> selectByExample(DropTablePOExample example);

    DropTablePO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DropTablePO record, @Param("example") DropTablePOExample example);

    int updateByExample(@Param("record") DropTablePO record, @Param("example") DropTablePOExample example);

    int updateByPrimaryKeySelective(DropTablePO record);

    int updateByPrimaryKey(DropTablePO record);
}