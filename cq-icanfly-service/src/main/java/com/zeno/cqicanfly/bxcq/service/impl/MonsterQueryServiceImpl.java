package com.zeno.cqicanfly.bxcq.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.Lists;
import com.zeno.cqicanfly.bxcq.bo.MonsterBO;
import com.zeno.cqicanfly.bxcq.bo.PageBO;
import com.zeno.cqicanfly.utils.RamPager;
import com.zeno.cqicanfly.bxcq.enums.BaseEnum;
import com.zeno.cqicanfly.bxcq.enums.MonsterTypeEnum;
import com.zeno.cqicanfly.bxcq.jsonobj.MonsterJsonBO;
import com.zeno.cqicanfly.bxcq.service.MonsterQueryService;
import com.zeno.cqicanfly.configpublish.ConfigFileService;
import com.zeno.cqicanfly.configpublish.FileEditService;
import com.zeno.cqicanfly.dto.luaconfig.ConfigFileDTO;
import com.zeno.cqicanfly.dto.luaconfig.FileEditDTO;
import com.zeno.cqicanfly.exception.DbQueryException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
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

    Cache<Integer, List<MonsterBO>> monsterCache = CacheBuilder.newBuilder().expireAfterAccess(12, TimeUnit.HOURS).build();

    @Override
    public List<MonsterBO> queryAll() throws ExecutionException {
        return monsterCache.get(1, () -> {
            ConfigFileDTO monsterFile = configFileService.queryByFileName("Monster.config");
            if (monsterFile == null) {
                throw new DbQueryException("查询怪物配置文件失败");
            }
            Integer fileId = monsterFile.getFileId();
            FileEditDTO fileEditDTO = fileEditService.queryPublishByFileId(fileId);
            String fileJson = fileEditDTO.getFileJson();
            return jsonObjConverterBo(fileJson);
        });
    }

    @Override
    public List<MonsterBO> batchQueryByMonsterIds(List<Integer> monsterIds) {
        return null;
    }

    @Override
    public List<MonsterBO> jsonObjConverterBo(String jsonStr) {
        List<MonsterBO> monsterBOList = Lists.newArrayList();
        JSONObject monsterObj = JSONObject.parseObject(jsonStr);
        monsterObj.forEach((id, obj) -> {
            MonsterJsonBO jsonBO = JSONObject.parseObject(JSON.toJSONString(obj), MonsterJsonBO.class);
            MonsterBO bo = new MonsterBO();
            bo.setMonsterName(jsonBO.getName());
            bo.setMonsterId(jsonBO.getEntityid());
            bo.setDropGroupId(jsonBO.getDropid());
            bo.setMonsterType(jsonBO.getMonsterType());
            Integer monsterType = jsonBO.getMonsterType();
            if (MonsterTypeEnum.contains(monsterType)) {
                bo.setMonsterTypeStr(BaseEnum.valueOfEnum(MonsterTypeEnum.class, monsterType).getDesc());
            } else {
                bo.setMonsterTypeStr("未知类型");
            }
            monsterBOList.add(bo);
        });
        return monsterBOList.stream().sorted(Comparator.comparing(MonsterBO::getMonsterId).reversed()).collect(Collectors.toList());
    }

    @Override
    public PageBO<MonsterBO> pageQueryByMonsterName(String monsterName, Integer pageNum, Integer pageSize) throws ExecutionException {
        List<MonsterBO> monsterBOList = Lists.newArrayList();
        if (StringUtils.isBlank(monsterName)) {
            monsterBOList.addAll(this.queryAll());
        } else {
            List<MonsterBO> filterByName = this.queryAll().stream().filter(monsterBO -> monsterBO.getMonsterName().contains(monsterName)).collect(Collectors.toList());
            monsterBOList.addAll(filterByName);
        }
        RamPager<MonsterBO> monsterBORamPager = new RamPager<>(monsterBOList, pageSize);
        List<MonsterBO> list = monsterBORamPager.page(pageNum);

        PageBO<MonsterBO> pageBO = new PageBO<>();
        pageBO.setPageNum(pageNum);
        pageBO.setPageSize(pageSize);
        pageBO.setTotal(monsterBOList.size());
        pageBO.setPageCount(monsterBORamPager.getPageCount());
        pageBO.setList(list);
        return pageBO;
    }
}
