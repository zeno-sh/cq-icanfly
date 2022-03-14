package com.zeno.cqicanfly.bxcq.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.zeno.cqicanfly.bxcq.bo.DropGroupBO;
import com.zeno.cqicanfly.bxcq.bo.DropTableBO;
import com.zeno.cqicanfly.bxcq.enums.BaseEnum;
import com.zeno.cqicanfly.bxcq.enums.DropTypeEnum;
import com.zeno.cqicanfly.bxcq.jsonobj.DropGroupJsonBO;
import com.zeno.cqicanfly.bxcq.service.DropConfigQueryService;
import com.zeno.cqicanfly.bxcq.service.DropTableQueryService;
import com.zeno.cqicanfly.configpublish.ConfigFileService;
import com.zeno.cqicanfly.configpublish.FileEditService;
import com.zeno.cqicanfly.dto.luaconfig.ConfigFileDTO;
import com.zeno.cqicanfly.dto.luaconfig.FileEditDTO;
import com.zeno.cqicanfly.exception.DbQueryException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author zeno
 * @Date 2022/3/15
 */
@Service
public class DropConfigQueryServiceImpl implements DropConfigQueryService, BaseService<DropGroupJsonBO> {

    @Autowired
    private FileEditService fileEditService;
    @Autowired
    private ConfigFileService configFileService;
    @Autowired
    private DropTableQueryService dropTableQueryService;

    @Override
    public DropGroupBO queryByDropGroupId(Integer dropGroupId) {
        ConfigFileDTO monsterFile = configFileService.queryByFileName("dropgroup.config");
        if (monsterFile == null) {
            throw new DbQueryException("查询掉落组配置文件失败");
        }
        Integer fileId = monsterFile.getFileId();
        FileEditDTO fileEditDTO = fileEditService.queryPublishByFileId(fileId);
        String fileJson = fileEditDTO.getFileJson();

        DropGroupBO dropGroupBO = new DropGroupBO();

        List<DropTableBO> dropTableBOList = Lists.newArrayList();
        List<DropGroupJsonBO> jsonBOList = jsonObjConverterBo(fileJson);
        DropGroupJsonBO jsonBO = jsonBOList.get(0);
        List<DropGroupJsonBO.GroupJsonBO> dropTableList = jsonBO.getGroup();
        dropTableList.forEach(groupJsonBO -> {
            Integer dropTableId = groupJsonBO.getId();
            List<DropTableBO> innerDropTableBOList = dropTableQueryService.queryByDropTableId(dropTableId);
        });


        dropGroupBO.setDropGroupId(jsonBO.getId());
        dropGroupBO.setDropType(jsonBO.getType());
        dropGroupBO.setDropTypeStr(BaseEnum.valueOfEnum(DropTypeEnum.class, jsonBO.getType()).getDesc());
//        dropGroupBO.setDropTables();
        return null;
    }

    @Override
    public List<DropGroupJsonBO> jsonObjConverterBo(String jsonStr) {
        List<DropGroupJsonBO> jsonBOList = Lists.newArrayList();
        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        jsonObject.forEach((id, obj) -> {
            DropGroupJsonBO dropGroupJsonBO = JSONObject.parseObject(JSON.toJSONString(obj), DropGroupJsonBO.class);
            jsonBOList.add(dropGroupJsonBO);
        });
        return jsonBOList;
    }
}
