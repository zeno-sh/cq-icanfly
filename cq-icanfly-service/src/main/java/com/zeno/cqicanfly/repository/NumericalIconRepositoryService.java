package com.zeno.cqicanfly.repository;

import com.zeno.cqicanfly.mybatis.entity.NumericalIconPO;
import com.zeno.cqicanfly.mybatis.mapper.NumericalIconPOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NumericalIconRepositoryService {

    @Autowired
    private NumericalIconPOMapper numericalIconPOMapper;

    public void insert(List<NumericalIconPO> records) {
        records.forEach(record->{
            if (numericalIconPOMapper.selectByPrimaryKey(record.getId()) == null) {
                numericalIconPOMapper.insert(record);
            }
        });
    }
}
