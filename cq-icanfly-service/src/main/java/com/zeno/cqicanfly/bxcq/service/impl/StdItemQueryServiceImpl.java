package com.zeno.cqicanfly.bxcq.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.zeno.cqicanfly.bxcq.bo.MonsterBO;
import com.zeno.cqicanfly.bxcq.bo.StdItemBO;
import com.zeno.cqicanfly.bxcq.enums.BaseEnum;
import com.zeno.cqicanfly.bxcq.enums.MonsterTypeEnum;
import com.zeno.cqicanfly.bxcq.jsonobj.MonsterJsonBO;
import com.zeno.cqicanfly.bxcq.jsonobj.StdItemJsonBO;
import com.zeno.cqicanfly.bxcq.service.StdItemQueryService;
import com.zeno.cqicanfly.configpublish.ConfigFileService;
import com.zeno.cqicanfly.configpublish.FileEditService;
import com.zeno.cqicanfly.dto.luaconfig.ConfigFileDTO;
import com.zeno.cqicanfly.dto.luaconfig.FileEditDTO;
import com.zeno.cqicanfly.exception.DbQueryException;
import com.zeno.cqicanfly.exception.QueryException;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author zeno
 * @Date 2022/3/15
 */
@Service
public class StdItemQueryServiceImpl implements StdItemQueryService, BaseService<StdItemBO> {

    @Autowired
    private FileEditService fileEditService;
    @Autowired
    private ConfigFileService configFileService;

    @Override
    public List<StdItemBO> queryAllItems() {
        ConfigFileDTO monsterFile = configFileService.queryByFileName("StdItems.config");
        if (monsterFile == null) {
            throw new DbQueryException("查询怪物配置文件失败");
        }
        Integer fileId = monsterFile.getFileId();
        FileEditDTO fileEditDTO = fileEditService.queryPublishByFileId(fileId);
        return jsonObjConverterBo(fileEditDTO.getFileJson());
    }

    @Override
    public List<StdItemBO> batchQueryByItemIds(List<Integer> itemIds) {
        List<StdItemBO> stdItemBOS = queryAllItems();
        List<StdItemBO> findItemList = Lists.newArrayList();
        stdItemBOS.forEach(bo -> {
            if (itemIds.contains(bo.getItemId())) {
                findItemList.add(bo);
            }
        });
        if (CollectionUtils.isEmpty(stdItemBOS)) {
            throw new QueryException("没有查询到对应道具");
        }
        return findItemList;
    }

    @Override
    public List<StdItemBO> jsonObjConverterBo(String jsonStr) {
        List<StdItemBO> stdItemBOS = Lists.newArrayList();
        JSONObject monsterObj = JSONObject.parseObject(jsonStr);
        monsterObj.forEach((id, obj) -> {
            StdItemJsonBO jsonBO = JSONObject.parseObject(JSON.toJSONString(obj), StdItemJsonBO.class);
            StdItemBO bo = new StdItemBO();
            bo.setItemId(jsonBO.getId());
            bo.setItemName(jsonBO.getName());
            stdItemBOS.add(bo);
        });
        return stdItemBOS;
    }
}
