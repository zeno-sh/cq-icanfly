package com.zeno.cqicanfly.bxcq.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.zeno.cqicanfly.bxcq.bo.DropTableBO;
import com.zeno.cqicanfly.bxcq.enums.BaseEnum;
import com.zeno.cqicanfly.bxcq.enums.DropTypeEnum;
import com.zeno.cqicanfly.bxcq.jsonobj.DropTableJsonBO;
import com.zeno.cqicanfly.bxcq.service.DropTableQueryService;
import com.zeno.cqicanfly.configpublish.ConfigFileService;
import com.zeno.cqicanfly.configpublish.FileEditService;
import com.zeno.cqicanfly.dto.luaconfig.ConfigFileDTO;
import com.zeno.cqicanfly.dto.luaconfig.FileEditDTO;
import com.zeno.cqicanfly.exception.DbQueryException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author zeno
 * @Date 2022/3/15
 */
@Service
public class DropTableQueryServiceImpl implements DropTableQueryService, BaseService<DropTableBO> {
    @Autowired
    private FileEditService fileEditService;
    @Autowired
    private ConfigFileService configFileService;

    @Override
    public List<DropTableBO> queryByDropTableId(Integer dropTableId) {
        ConfigFileDTO monsterFile = configFileService.queryByFileName("droptable.config");
        if (monsterFile == null) {
            throw new DbQueryException("查询掉落组配置文件失败");
        }
        Integer fileId = monsterFile.getFileId();
        FileEditDTO fileEditDTO = fileEditService.queryPublishByFileId(fileId);
        String fileJson = fileEditDTO.getFileJson();
        List<DropTableBO> dropTableBOList = jsonObjConverterBo(fileJson);

        return dropTableBOList.stream().filter(dropTableBO -> dropTableBO.getDropTableId().equals(dropTableId)).collect(Collectors.toList());
    }

    @Override
    public List<DropTableBO> jsonObjConverterBo(String jsonStr) {
        List<DropTableBO> dropTableBOList = Lists.newArrayList();
        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        jsonObject.forEach((id, obj) -> {
            DropTableJsonBO jsonBO = JSONObject.parseObject(JSON.toJSONString(obj), DropTableJsonBO.class);
            DropTableBO bo = new DropTableBO();
            bo.setDropTableType(jsonBO.getDropTableType());
            bo.setDropTableTypeStr(BaseEnum.valueOfEnum(DropTypeEnum.class, jsonBO.getDropTableType()).getDesc());
            bo.setDropTableId(jsonBO.getDropTableId());
            bo.setIsDropBest(jsonBO.getIsDropbest());
            dropTableBOList.add(bo);
        });
        return dropTableBOList;
    }

}
