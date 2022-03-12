package com.zeno.cqicanfly.mybatis.mapper;

import com.zeno.cqicanfly.mybatis.entity.StdItemsPO;
import com.zeno.cqicanfly.mybatis.entity.StdItemsPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StdItemsPOMapper {
    long countByExample(StdItemsPOExample example);

    int deleteByExample(StdItemsPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StdItemsPO record);

    int insertSelective(StdItemsPO record);

    List<StdItemsPO> selectByExampleWithBLOBs(StdItemsPOExample example);

    List<StdItemsPO> selectByExample(StdItemsPOExample example);

    StdItemsPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StdItemsPO record, @Param("example") StdItemsPOExample example);

    int updateByExampleWithBLOBs(@Param("record") StdItemsPO record, @Param("example") StdItemsPOExample example);

    int updateByExample(@Param("record") StdItemsPO record, @Param("example") StdItemsPOExample example);

    int updateByPrimaryKeySelective(StdItemsPO record);

    int updateByPrimaryKeyWithBLOBs(StdItemsPO record);

    int updateByPrimaryKey(StdItemsPO record);
}