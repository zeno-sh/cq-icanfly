package com.zeno.cqicanfly.bxcq.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.zeno.cqicanfly.bxcq.bo.MonsterBO;
import com.zeno.cqicanfly.bxcq.enums.BaseEnum;
import com.zeno.cqicanfly.bxcq.enums.MonsterTypeEnum;
import com.zeno.cqicanfly.bxcq.jsonobj.MonsterJsonBO;
import com.zeno.cqicanfly.bxcq.service.MonsterQueryService;
import com.zeno.cqicanfly.configpublish.ConfigFileService;
import com.zeno.cqicanfly.configpublish.FileEditService;
import com.zeno.cqicanfly.dto.luaconfig.ConfigFileDTO;
import com.zeno.cqicanfly.dto.luaconfig.FileEditDTO;
import com.zeno.cqicanfly.exception.DbQueryException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author zeno
 * @Date 2022/3/15
 */
@Service
public class MonsterQueryServiceImpl implements BaseService<MonsterBO>, MonsterQueryService {

    @Autowired
    private FileEditService fileEditService;
    @Autowired
    private ConfigFileService configFileService;

    @Override
    public List<MonsterBO> queryAll() {
        ConfigFileDTO monsterFile = configFileService.queryByFileName("Monster.config");
        if (monsterFile == null) {
            throw new DbQueryException("查询怪物配置文件失败");
        }
        Integer fileId = monsterFile.getFileId();
        FileEditDTO fileEditDTO = fileEditService.queryPublishByFileId(fileId);
        String fileJson = fileEditDTO.getFileJson();
        return jsonObjConverterBo(fileJson);
    }

    @Override
    public List<MonsterBO> batchQueryByMonsterIds(List<Integer> monsterIds) {
        return null;
    }

    @Override
    public List<MonsterBO> jsonObjConverterBo(String jsonStr) {
        List<MonsterBO> monsterBOList = Lists.newArrayList();
        JSONObject monsterObj = JSONObject.parseObject(jsonStr);
        monsterObj.forEach((id, obj)->{
            MonsterJsonBO jsonBO = JSONObject.parseObject(JSON.toJSONString(obj), MonsterJsonBO.class);
            MonsterBO bo = new MonsterBO();
            bo.setMonsterName(jsonBO.getName());
            bo.setMonsterId(jsonBO.getEntityid());
            bo.setDropGroupId(jsonBO.getDropid());
            bo.setMonsterType(jsonBO.getMonsterType());
            Integer monsterType = jsonBO.getMonsterType();
            if (MonsterTypeEnum.contains(monsterType)) {
                bo.setMonsterTypeStr(BaseEnum.valueOfEnum(MonsterTypeEnum.class, monsterType).getDesc());
            }else{
                bo.setMonsterTypeStr("未知类型");
            }
            monsterBOList.add(bo);
        });
        return monsterBOList.stream().sorted(Comparator.comparing(MonsterBO::getMonsterId).reversed()).collect(Collectors.toList());
    }
}
