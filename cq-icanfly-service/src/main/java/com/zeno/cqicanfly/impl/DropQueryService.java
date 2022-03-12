package com.zeno.cqicanfly.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.zeno.cqicanfly.dto.DropGroupDTO;
import com.zeno.cqicanfly.dto.DropGroupInnerDTO;
import com.zeno.cqicanfly.dto.DropItemDTO;
import com.zeno.cqicanfly.dto.DropTableDTO;
import com.zeno.cqicanfly.enums.AwardTypeEnum;
import com.zeno.cqicanfly.enums.DropTypeEnum;
import com.zeno.cqicanfly.mybatis.entity.DropGroupConfigPO;
import com.zeno.cqicanfly.mybatis.entity.DropTablePO;
import com.zeno.cqicanfly.mybatis.entity.MonsterConfigPO;
import com.zeno.cqicanfly.mybatis.entity.StdItemsPO;
import com.zeno.cqicanfly.repository.DropGroupConfigRepository;
import com.zeno.cqicanfly.repository.DropTableRepository;
import com.zeno.cqicanfly.repository.MonsterRepository;
import com.zeno.cqicanfly.repository.StdItemRepositoryService;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class DropQueryService {

    @Autowired
    private MonsterRepository monsterRepository;
    @Autowired
    private DropGroupConfigRepository dropGroupConfigRepository;
    @Autowired
    private DropTableRepository dropTableRepository;
    @Autowired
    private StdItemRepositoryService stdItemRepositoryService;

    public DropGroupDTO queryDropConfigByMonsterId(Integer monsterId) {
        MonsterConfigPO monsterConfigPO = monsterRepository.queryByMonsterEntityId(monsterId);
        if (monsterConfigPO == null) {
            throw new RuntimeException("未找到怪物！");
        }
        System.out.println("查询到怪物信息：" + JSON.toJSONString(monsterConfigPO));
        Integer dropid = monsterConfigPO.getDropid();
        if (dropid == null) {
            throw new RuntimeException("我是个小垃圾，什么都不爆:)");
        }

        //根据掉落组id查询详情
        DropGroupConfigPO dropGroupConfigPO = dropGroupConfigRepository.queryById(dropid);
        if (dropGroupConfigPO == null || StringUtils.isBlank(dropGroupConfigPO.getGroupConfig())) {
            throw new RuntimeException("我是个小垃圾，什么都不爆:) PS：GM偷懒了，没有配掉落物品！");
        }

        DropGroupDTO dropGroupDTO = new DropGroupDTO();
        dropGroupDTO.setDropGroupId(dropid);
        dropGroupDTO.setMonsterId(monsterId);
        dropGroupDTO.setMonsterName(monsterConfigPO.getName());

        //1.type=2时用到的子表爆率总和
        Integer groupDropType = dropGroupConfigPO.getType();
        dropGroupDTO.setDropGroupType(DropTypeEnum.valuesOf(groupDropType));

        List<DropGroupInnerDTO> innerGroupList = JSONObject.parseArray(dropGroupConfigPO.getGroupConfig(), DropGroupInnerDTO.class);
        innerGroupList.forEach(dropGroupInnerDTO -> dropGroupInnerDTO.setDropType(groupDropType));
        //爆率总和
        int groupRate = 0;
        if (groupDropType == DropTypeEnum.QUANZHONG.getCode()) {
            groupRate = innerGroupList.stream().mapToInt(DropGroupInnerDTO::getRate).sum();
        }

        //查询掉落表
        List<Integer> dropTableIds = innerGroupList.stream().map(DropGroupInnerDTO::getId).collect(Collectors.toList());
        List<DropTablePO> dropTablePOList = dropTableRepository.batchQueryId(dropTableIds);
        if (CollectionUtils.isEmpty(dropTablePOList)) {
            throw new RuntimeException("没有找到掉落表哦~");
        }

        Map<Integer, DropTablePO> tablePOMap = dropTablePOList.stream().collect(Collectors.toMap(DropTablePO::getId, Function.identity(), (k1, k2) -> k1));
        List<DropTableDTO> dropTableDTOList = Lists.newArrayList();
        int finalGroupRate = groupRate;
        innerGroupList.forEach(dropGroupInnerDTO -> {
            DropTableDTO dto = new DropTableDTO();
            DropTablePO po = tablePOMap.get(dropGroupInnerDTO.getId());
            dto.setDropTableId(dropGroupInnerDTO.getId());
            dto.setTableRate(dropGroupInnerDTO.getRate());
            String dropItemType = DropTypeEnum.valuesOf(po.getType());
            dto.setDropType(dropItemType);
            if (dropGroupInnerDTO.getDropType() == DropTypeEnum.QUANZHONG.getCode()) {
                // 自身爆率/总爆率之和
                BigDecimal multiply = new BigDecimal(dropGroupInnerDTO.getRate()).divide(new BigDecimal(finalGroupRate), 2, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                dto.setTableRateStr(multiply + "%");
            } else {
                dto.setTableRateStr(dropGroupInnerDTO.getRate() + "%");
            }
            dto.setTimeLimit(po.getTimeLimit());
            dto.setWeekLimit(po.getWeeklimit());

            List<DropItemDTO> itemDTOList = JSONObject.parseArray(po.getDropTable(), DropItemDTO.class);
            if (CollectionUtils.isEmpty(itemDTOList)) {
                System.out.println(String.format("dropId=%s,没有配置掉落道具", dropGroupInnerDTO.getId()));
                return;
            }
            List<Integer> itemIds = itemDTOList.stream().map(DropItemDTO::getId).collect(Collectors.toList());
            List<StdItemsPO> itemPOList = stdItemRepositoryService.batchQueryByItemId(itemIds);
            Map<Integer, StdItemsPO> poMap = itemPOList.stream().collect(Collectors.toMap(StdItemsPO::getId, Function.identity(), (k1, k2) -> k1));

            int itemSumRate = itemDTOList.stream().mapToInt(DropItemDTO::getRate).sum();
            itemDTOList.forEach(itemDTO -> {
                StdItemsPO itemPO = poMap.get(itemDTO.getId());
                itemDTO.setDropItemType(dropItemType);
                if (itemDTO.getType() == AwardTypeEnum.QATBINDMONEY.getCode()) {
                    itemDTO.setItemName(AwardTypeEnum.QATBINDMONEY.getDesc());
                } else if (itemDTO.getType() == AwardTypeEnum.QATEQUIPMENT.getCode()) {
                    itemDTO.setItemName(itemPO.getName());
                }
                if (itemDTO.getType() == DropTypeEnum.QUANZHONG.getCode()) {
                    BigDecimal multiply = new BigDecimal(itemDTO.getRate()).divide(new BigDecimal(itemSumRate), 2, RoundingMode.HALF_UP).multiply(new BigDecimal(100));
                    itemDTO.setRateStr(multiply + "%");
                } else {
                    itemDTO.setRateStr(itemDTO.getRate() + "%");
                }
            });
            dto.setDropItems(itemDTOList);
            dropTableDTOList.add(dto);
        });
        dropGroupDTO.setDropTables(dropTableDTOList);
        return dropGroupDTO;
    }

//    private List<DropItemDTO> getDropItems(String dropItemStr) {
//
//    }
}
