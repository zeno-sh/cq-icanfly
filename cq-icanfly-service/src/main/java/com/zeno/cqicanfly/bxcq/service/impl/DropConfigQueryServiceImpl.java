package com.zeno.cqicanfly.bxcq.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
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
import com.zeno.cqicanfly.exception.QueryException;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

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

    public Cache<Integer, FileEditDTO> configCache = CacheBuilder.newBuilder().expireAfterAccess(12, TimeUnit.HOURS).build();

    private static final String fileName = "dropgroup.config";

    @Override
    public DropGroupBO queryByDropGroupId(Integer dropGroupId) throws ExecutionException {
        ConfigFileDTO monsterFile = configFileService.queryByFileName(fileName);
        if (monsterFile == null) {
            throw new DbQueryException("查询掉落组配置文件失败");
        }
        Integer fileId = monsterFile.getFileId();
        FileEditDTO fileEditDTO = configCache.get(fileId, () -> fileEditService.queryPublishByFileId(fileId));
        String fileJson = fileEditDTO.getFileJson();
        DropGroupBO dropGroupBO = new DropGroupBO();

        List<DropTableBO> allList = Lists.newArrayList();
        List<DropGroupJsonBO> jsonBOList = jsonObjConverterBo(fileJson).stream().filter(dropGroupJsonBO -> dropGroupJsonBO.getId().equals(dropGroupId)).collect(Collectors.toList());
        if (CollectionUtils.isEmpty(jsonBOList)) {
            throw new QueryException("没有查询到掉落组信息");
        }

        DropGroupJsonBO jsonBO = jsonBOList.get(0);
        String dropTypeStr= BaseEnum.valueOfEnum(DropTypeEnum.class, jsonBO.getType()).getDesc();
        Integer dropType = jsonBO.getType();
        List<DropGroupJsonBO.GroupJsonBO> groupJsonBOList = jsonBO.getGroup();
        Map<Integer, Integer> sumRateMap = getSumRateMap(jsonBOList);

        groupJsonBOList.forEach(groupJsonBO -> {
            Integer dropTableId = groupJsonBO.getId();
            List<DropTableBO> dropTableBOList;
            try {
                dropTableBOList = dropTableQueryService.queryByDropTableId(dropTableId);
            } catch (ExecutionException e) {
                e.printStackTrace();
                throw new QueryException("没有查询到掉落组信息");
            }
            dropTableBOList.forEach(dropTableBO -> {
                dropTableBO.setDropTableType(jsonBO.getType());
                dropTableBO.setDropTableTypeStr(dropTypeStr);
                String finalRate = groupJsonBO.getRate() + "";
                if (dropType == DropTypeEnum.QUANZHONG.getCode()) {
                    finalRate = groupJsonBO.getRate() + "/" + sumRateMap.get(jsonBO.getId());
                }
                dropTableBO.setFinalRate(finalRate);
                dropTableBO.setRate(groupJsonBO.getRate());
            });
            allList.addAll(dropTableBOList);
        });


        dropGroupBO.setDropGroupId(jsonBO.getId());
        dropGroupBO.setDropType(dropType);
        dropGroupBO.setDropTypeStr(dropTypeStr);
        dropGroupBO.setDropTables(allList);
        return dropGroupBO;
    }

    private Map<Integer, Integer> getSumRateMap(List<DropGroupJsonBO> jsonBOList) {
        Map<Integer, Integer> map = Maps.newHashMap();
        jsonBOList.forEach(dropGroupJsonBO -> {
            AtomicInteger sumRate = new AtomicInteger();
            dropGroupJsonBO.getGroup().forEach(groupJsonBO -> {
                if (dropGroupJsonBO.getType() == DropTypeEnum.QUANZHONG.getCode()) {
                    sumRate.addAndGet(groupJsonBO.getRate());
                    map.put(dropGroupJsonBO.getId(), sumRate.get());
                }
            });
        });

        return map;
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
