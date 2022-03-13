package com.zeno.cqicanfly.mybatis.mapper;

import com.zeno.cqicanfly.mybatis.entity.FileEditPO;
import com.zeno.cqicanfly.mybatis.entity.FileEditPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileEditPOMapper {
    long countByExample(FileEditPOExample example);

    int deleteByExample(FileEditPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FileEditPO record);

    int insertSelective(FileEditPO record);

    List<FileEditPO> selectByExample(FileEditPOExample example);

    FileEditPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FileEditPO record, @Param("example") FileEditPOExample example);

    int updateByExample(@Param("record") FileEditPO record, @Param("example") FileEditPOExample example);

    int updateByPrimaryKeySelective(FileEditPO record);

    int updateByPrimaryKey(FileEditPO record);
}