package com.zeno.cqicanfly.bxcq.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.zeno.cqicanfly.bxcq.bo.DropItemBO;
import com.zeno.cqicanfly.bxcq.bo.DropTableBO;
import com.zeno.cqicanfly.bxcq.bo.StdItemBO;
import com.zeno.cqicanfly.bxcq.enums.AwardTypeEnum;
import com.zeno.cqicanfly.bxcq.enums.BaseEnum;
import com.zeno.cqicanfly.bxcq.enums.DropTypeEnum;
import com.zeno.cqicanfly.bxcq.jsonobj.DropTableJsonBO;
import com.zeno.cqicanfly.bxcq.service.DropTableQueryService;
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
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
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
    @Autowired
    private StdItemQueryService stdItemQueryService;

    Cache<String, String> configCache = CacheBuilder.newBuilder().expireAfterAccess(12, TimeUnit.HOURS).build();

    private final String fileName = "droptable.config";

    @Override
    public List<DropTableBO> queryByDropTableId(Integer dropTableId) throws ExecutionException {


        String fileJson = configCache.get(fileName, () -> {
            ConfigFileDTO monsterFile = configFileService.queryByFileName(fileName);
            if (monsterFile == null) {
                throw new DbQueryException("查询掉落组配置文件失败");
            }
            Integer fileId = monsterFile.getFileId();
            FileEditDTO fileEditDTO = fileEditService.queryPublishByFileId(fileId);
            return fileEditDTO.getFileJson();
        });
        List<DropTableBO> dropTableBOList = jsonObjConverterBo(fileJson).stream().filter(dropTableBO -> dropTableBO.getDropTableId().equals(dropTableId)).collect(Collectors.toList());

        List<Integer> itemIds = dropTableBOList.stream().map(DropTableBO::getDropItems).flatMap(List::stream).map(DropItemBO::getItemId).collect(Collectors.toList());
        List<StdItemBO> stdItemBOS = stdItemQueryService.batchQueryByItemIds(itemIds);
        Map<Integer, StdItemBO> itemMap = stdItemBOS.stream().collect(Collectors.toMap(StdItemBO::getItemId, Function.identity(), (k1, k2) -> k1));
        Map<Integer, Integer> dropTableSumRateMap = getDropTableSumRate(dropTableBOList);
        dropTableBOList.forEach(dropTableBO -> {
            Integer dropTableType = dropTableBO.getDropTableType();
            dropTableBO.getDropItems().forEach(dropItemBO -> {
                Integer itemType = dropItemBO.getItemType();
                String finalRate = dropItemBO.getRate() + "/" + dropItemBO.getRate();
                if (itemType == AwardTypeEnum.QATEQUIPMENT.getCode()) {
                    StdItemBO stdItemBO = itemMap.get(dropItemBO.getItemId());
                    dropItemBO.setItemName(stdItemBO.getItemName());
                }
                if (itemType == AwardTypeEnum.QATBINDMONEY.getCode()) {
                    dropItemBO.setItemName(AwardTypeEnum.QATBINDMONEY.getDesc());
                }
                if (itemType == AwardTypeEnum.QATYUANBAO.getCode()) {
                    dropItemBO.setItemName(AwardTypeEnum.QATYUANBAO.getDesc());
                }
                if (dropTableType == DropTypeEnum.QUANZHONG.getCode()) {
//                    BigDecimal baolv = new BigDecimal(dropItemBO.getRate()).divide(new BigDecimal(dropTableSumRateMap.get(dropItemBO.getDropTableId())), 10, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    finalRate = dropItemBO.getRate() + "/" + dropTableSumRateMap.get(dropItemBO.getDropTableId());
                }
                dropItemBO.setFinalRate(finalRate);
            });
        });
        return dropTableBOList;
    }

    private Map<Integer, Integer> getDropTableSumRate(List<DropTableBO> dropTableBOList) {
        Map<Integer, Integer> map = Maps.newHashMap();
        dropTableBOList.forEach(dropTableBO -> {
            Integer dropTableType = dropTableBO.getDropTableType();
            AtomicInteger sumRate = new AtomicInteger();
            dropTableBO.getDropItems().forEach(dropItemBO -> {
                if (dropTableType == DropTypeEnum.QUANZHONG.getCode()) {
                    sumRate.addAndGet(dropItemBO.getRate());
                }
            });
            map.put(dropTableBO.getDropTableId(), sumRate.get());
        });
        return map;
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
            List<DropItemBO> dropItemBOList = Lists.newArrayList();
            List<DropTableJsonBO.TableJsonBO> tableJsonBOS = jsonBO.getDropItems();
            if (CollectionUtils.isNotEmpty(tableJsonBOS)) {
                tableJsonBOS.forEach(tableJsonBO -> {
                    DropItemBO itemBO = new DropItemBO();
                    itemBO.setDropTableId(bo.getDropTableId());
                    itemBO.setDropTableType(bo.getDropTableType());
                    itemBO.setDropTableTypeStr(bo.getDropTableTypeStr());
                    itemBO.setItemId(tableJsonBO.getItemId());
                    itemBO.setItemType(tableJsonBO.getItemType());
                    itemBO.setCount(tableJsonBO.getCount());
                    itemBO.setRate(tableJsonBO.getRate());
                    dropItemBOList.add(itemBO);
                });
            }
            bo.setDropItems(dropItemBOList);
            dropTableBOList.add(bo);
        });
        return dropTableBOList;
    }

}
