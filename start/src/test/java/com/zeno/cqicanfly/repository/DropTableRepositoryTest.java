package com.zeno.cqicanfly.repository;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import com.zeno.cqicanfly.dto.luaconfig.DropItemConfigDTO;
import com.zeno.cqicanfly.dto.luaconfig.DropTableConfigDTO;
import com.zeno.cqicanfly.mybatis.entity.DropTablePO;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import utils.JsonFileLoadUtils;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DropTableRepositoryTest extends BaseTest {
    @Autowired
    private DropTableRepository repository;

    @Test
    void insert() throws Exception {
        String jsonFile = "/Users/zhulinfeng/Documents/GitSpace/cq-icanfly/start/src/main/resources/jsonfile/DropTable.lua.json";
        String jsonStr = JsonFileLoadUtils.loadJsonFile(jsonFile);
        List list = convertJsonObj(DropTablePO.class, jsonStr.replace("table", "dropTable"));
        System.out.println(list);
        repository.insert(list);
    }

    @Test
    void queryById() {
        List<DropTablePO> dropTablePOS = repository.queryAll();

        List<DropTableConfigDTO> dropTableConfigDTOList = Lists.newArrayList();
        dropTablePOS.forEach(po -> {
            DropTableConfigDTO dto = new DropTableConfigDTO();
            dto.setId(po.getId());
            dto.setType(po.getType());
            dto.setTable(JSONArray.parseArray(po.getDropTable().replace("{}","[]"), DropItemConfigDTO.class));
            dto.setTimeLimit(Maps.newHashMap());

            dto.setWeeklimit(Maps.newHashMap());
            if (po.getIsDropbest() != null) {
                dto.setIsDropbest(po.getIsDropbest());
            }
            if (po.getLoottype() != null) {
                dto.setLoottype(po.getLoottype());
            }
            if (po.getLimitopenserverDay() != null) {
                dto.setLimitopenserverDay(po.getLimitopenserverDay());
            }
            if (po.getCloseopenday() != null) {
                dto.setCloseopenday(po.getCloseopenday());
            }
            dropTableConfigDTOList.add(dto);
        });

        JSONObject obj = new JSONObject();
        dropTableConfigDTOList.forEach(dto->{
            obj.put(String.valueOf(dto.getId()), dto);
        });
        System.out.println(obj.toJSONString());

    }
}