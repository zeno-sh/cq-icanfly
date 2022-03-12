package com.zeno.cqicanfly.repository;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.zeno.cqicanfly.dto.Compose;
import com.zeno.cqicanfly.dto.ItemMergeConfig;
import com.zeno.cqicanfly.dto.MergeConfig;
import com.zeno.cqicanfly.dto.MergeTable;
import com.zeno.cqicanfly.mybatis.entity.ItemMergePO;
import com.zeno.cqicanfly.mybatis.entity.MergeConfigPO;
import com.zeno.cqicanfly.mybatis.entity.MergeTotalPO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import utils.JsonFileLoadUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SpringBootTest
class MergeRepositoryServiceTest {

    @Autowired
    private MergeRepositoryService mergeRepositoryService;
    @Autowired
    private StdItemRepositoryService stdItemRepositoryService;

    @Test
    public void insertMergeTotal() {
        String json = "{\"1\":{\"openZs\":0,\"sort\":1,\"id\":1,\"btn_source\":\"合成装备\",\"openserverDay\":0,\"openLv\":1},\"2\":{\"openZs\":0,\"sort\":3,\"id\":2,\"btn_source\":\"材料\",\"openserverDay\":0,\"openLv\":1},\"3\":{\"openZs\":0,\"sort\":4,\"id\":3,\"btn_source\":\"高阶装备\",\"openserverDay\":0,\"openLv\":1},\"4\":{\"openZs\":4,\"sort\":5,\"id\":4,\"btn_source\":\"神兵圣甲\",\"openserverDay\":0,\"openLv\":1},\"5\":{\"openZs\":999,\"sort\":6,\"id\":5,\"btn_source\":\"活动\",\"openserverDay\":1,\"openLv\":1},\"6\":{\"openZs\":6,\"sort\":2,\"id\":6,\"btn_source\":\"内功\",\"openserverDay\":1,\"openLv\":1},\"7\":{\"openZs\":0,\"sort\":7,\"id\":7,\"btn_source\":\"现金红包\",\"openserverDay\":1,\"openLv\":1},\"8\":{\"openZs\":3,\"sort\":8,\"id\":8,\"btn_source\":\"字诀\",\"openserverDay\":15,\"openLv\":1}}";
        List<MergeTotalPO> list = new ArrayList<>();
        JSONObject jsonObject = JSONObject.parseObject(json);
        jsonObject.forEach((s, o) -> {
            MergeTotalPO mergeTotalPO = JSONObject.parseObject(JSON.toJSONString(o), MergeTotalPO.class);

            list.add(mergeTotalPO);
        });
        mergeRepositoryService.insertMergeTotal(list);
    }

    @Test
    public void insertMergeConfig() throws Exception {
        String filePath = "jsonfile/ItemMerge.json";
        String json = JsonFileLoadUtils.loadJsonFile(filePath).replace("id", "firstIndex").replace("index", "secondIndex");
        JSONObject jsonObject = JSONObject.parseObject(json);
        List<MergeConfigPO> list = new ArrayList<>();
        jsonObject.forEach((key, value) -> {
            JSONObject secondObj = JSONObject.parseObject(JSON.toJSONString(value));
            secondObj.forEach((secondIndex, secondValue) -> {
                MergeConfigPO mergeConfigPO = JSONObject.parseObject(JSON.toJSONString(secondValue), MergeConfigPO.class);
                list.add(mergeConfigPO);
            });
        });
        System.out.println(JSON.toJSONString(list));
//        mergeRepositoryService.insertMergeConfig(list);
    }

    @Test
    public void insertItemMerge() throws Exception {
        String json = JsonFileLoadUtils.loadJsonFile("/Users/zhulinfeng/Documents/GitSpace/cq-icanfly/start/src/test/java/com/zeno/cqicanfly/repository/json/ItemMerge.json").replace("index", "firstIndex").replace("second_index", "secondIndex").replace("table", "mergeTable");
        JSONObject jsonObject = JSONObject.parseObject(json);
        List<ItemMergePO> list = new ArrayList<>();
        jsonObject.forEach((key, value) -> {
            JSONObject secondObj = JSONObject.parseObject(JSON.toJSONString(value));
            secondObj.forEach((secondIndex, secondValue) -> {
                JSONObject itemObj = JSONObject.parseObject(JSON.toJSONString(secondValue));
                itemObj.forEach((itemIndex, itemValue) -> {
                    ItemMergePO itemMergePO = JSONObject.parseObject(JSON.toJSONString(itemValue), ItemMergePO.class);
                    itemMergePO.setSecondIndex(Integer.valueOf(secondIndex));
                    list.add(itemMergePO);
                });

            });
        });
        System.out.println(JSON.toJSONString(list));
        mergeRepositoryService.insertItemMerge(list);
    }

    Integer firstIndex = 2;
    //转成材料的二级目录
    Integer secondIndex = 7;
    int itemType = 0;
    int moneyType = 2;

    @Test
    public void createItemMerge() {

        Integer maxEid = mergeRepositoryService.queryMaxEid();
        System.out.println(maxEid);
        maxEid++;

        //创建转成材料
        String itemName1 = "曜石[一转]";
        String itemName2 = "曜石[二转]";
        String itemName3 = "曜石[三转]";
        String itemName4 = "曜石[四转]";
        String itemName5 = "曜石[五转]";
        String itemName6 = "曜石[六转]";
        String itemNameGao = "曜石[高转]";
        String itemNameLian = "曜石[炼狱]";
        Integer hunho1Id = stdItemRepositoryService.queryItemIdByName(itemName1);
        Integer hunho2Id = stdItemRepositoryService.queryItemIdByName(itemName2);
        Integer hunho3Id = stdItemRepositoryService.queryItemIdByName(itemName3);
        Integer hunho4Id = stdItemRepositoryService.queryItemIdByName(itemName4);
        Integer hunho5Id = stdItemRepositoryService.queryItemIdByName(itemName5);
        Integer hunho6Id = stdItemRepositoryService.queryItemIdByName(itemName6);
        Integer hunho7Id = stdItemRepositoryService.queryItemIdByName(itemNameGao);
        Integer hunho8Id = stdItemRepositoryService.queryItemIdByName(itemNameLian);


        ItemMergePO i1 = buildItemMerge(maxEid++, hunho2Id, hunho1Id, 2, 30000);
        ItemMergePO i2 = buildItemMerge(maxEid++, hunho3Id, hunho2Id, 2, 50000);
        ItemMergePO i3 = buildItemMerge(maxEid++, hunho4Id, hunho3Id, 3, 100000);
        ItemMergePO i4 = buildItemMerge(maxEid++, hunho5Id, hunho4Id, 3, 500000);
        ItemMergePO i5 = buildItemMerge(maxEid++, hunho6Id, hunho5Id, 5, 1000000);
        ItemMergePO i6 = buildItemMerge(maxEid++, hunho7Id, hunho6Id, 5, 3000000);
        ItemMergePO i7 = buildItemMerge(maxEid++, hunho8Id, hunho7Id, 5, 10000000);
        List<ItemMergePO> itemMergePOList = Lists.newArrayList(i1, i2, i3, i4, i5, i6, i7);

        System.out.println("ItemList=" + JSON.toJSONString(itemMergePOList));
        mergeRepositoryService.insertItemMerge(itemMergePOList);
    }

    private ItemMergePO buildItemMerge(Integer maxEid, Integer composItemId, Integer originItemId, Integer needCount, Integer needMoney) {
        ItemMergePO itemMergePO = new ItemMergePO();
        itemMergePO.setFirstIndex(firstIndex);
        itemMergePO.setSecondIndex(secondIndex);
        itemMergePO.setEid(maxEid);
        //最终合成道具
        itemMergePO.setCompose(JSON.toJSONString(Compose.builder().id(composItemId).type(itemType).count(1).build()));
        itemMergePO.setLevel(1);
        //合成公式
        List<MergeTable> mergeTables = new ArrayList<>();
        //曜石1转
        mergeTables.add(MergeTable.builder().id(originItemId).type(itemType).count(needCount).build());
        //绑金1w
        mergeTables.add(MergeTable.builder().id(2).type(moneyType).count(needMoney).build());
        itemMergePO.setMergeTable(JSON.toJSONString(mergeTables));
        itemMergePO.setCircle(6);
        itemMergePO.setOpenserverday(1);
        itemMergePO.setText("合成");
        itemMergePO.setRedpoint(2);

        return itemMergePO;
    }

    @Test
    public void createItemMergeJson() {
        List<ItemMergePO> allItemMerge = mergeRepositoryService.findAllItemMerge(" Eid asc");
        Map<Integer, List<ItemMergePO>> groupByFirstIndex = allItemMerge.stream().collect(Collectors.groupingBy(ItemMergePO::getFirstIndex));
        System.out.println("groupByFirstIndex=" + JSON.toJSONString(groupByFirstIndex));
        JSONObject jsonObject = new JSONObject();
        groupByFirstIndex.forEach((firstIndex, firstList) -> {
            Map<Integer, List<ItemMergePO>> groupBySecondIndex = firstList.stream().collect(Collectors.groupingBy(ItemMergePO::getSecondIndex));
            JSONObject secondJsonObj = new JSONObject();

            groupBySecondIndex.forEach((secondIndex, secondList) -> {
                JSONObject itemJsonObj = new JSONObject();
                secondList.forEach(itemMergePO -> {
                    itemJsonObj.put(String.valueOf(itemMergePO.getEid()), convertItemMergeConfig(itemMergePO));
                });

                secondJsonObj.put(String.valueOf(secondIndex), itemJsonObj);
            });
            jsonObject.put(String.valueOf(firstIndex), secondJsonObj);
        });
        System.out.println("jsonObj=" + JSON.toJSONString(jsonObject).replace("eid","Eid"));

//        JSON.toJSONString().replace("firstIndex", "index").replace("secondIndex", "second_index").replace("mergeTable","table")
    }


    @Test
    public void createMergeConfigJson() {
        List<MergeConfigPO> allSecondMerge = mergeRepositoryService.findAllSecondMerge();
        Map<Integer, List<MergeConfigPO>> groupByFirstIndexMap = allSecondMerge.stream().collect(Collectors.groupingBy(MergeConfigPO::getFirstIndex));
        JSONObject jsonObject = new JSONObject();
        groupByFirstIndexMap.forEach((firstIndex, firstList)->{
            Map<Integer, List<MergeConfigPO>> secondMap = firstList.stream().collect(Collectors.groupingBy(MergeConfigPO::getSecondIndex));
            JSONObject secondJsonObj = new JSONObject();
            secondMap.forEach((secondIndex, secondList)->{
                secondList.forEach(po -> secondJsonObj.put(String.valueOf(secondIndex), converterMergeConfig(po)));
            });
            jsonObject.put(String.valueOf(firstIndex), secondJsonObj);
        });
        System.out.println("json="+JSON.toJSONString(jsonObject).replace("uitype","Uitype"));
    }

    private MergeConfig converterMergeConfig(MergeConfigPO po) {
        MergeConfig mergeConfig = new MergeConfig();
        mergeConfig.setId(po.getFirstIndex());
        mergeConfig.setIndex(po.getSecondIndex());
        mergeConfig.setName(po.getName());
        mergeConfig.setLevelconds(po.getLevelconds());
        mergeConfig.setRebornconds(po.getRebornconds());
        mergeConfig.setDayconds(po.getDayconds());
        mergeConfig.setUitype(po.getUitype());

        return mergeConfig;
    }

    private ItemMergeConfig convertItemMergeConfig(ItemMergePO po) {
        ItemMergeConfig itemMergeConfig = new ItemMergeConfig();
        itemMergeConfig.setIndex(po.getFirstIndex());
        itemMergeConfig.setSecond_index(po.getSecondIndex());
        itemMergeConfig.setEid(po.getEid());
        itemMergeConfig.setCompose(JSONObject.parseObject(po.getCompose(), Compose.class));
        itemMergeConfig.setTable(JSONArray.parseArray(po.getMergeTable(), MergeTable.class));
        itemMergeConfig.setLevel(po.getLevel());
        itemMergeConfig.setCircle(po.getCircle());
        itemMergeConfig.setOpenserverday(po.getOpenserverday());
        itemMergeConfig.setLimitTips(po.getLimitTips());
        itemMergeConfig.setText(po.getText());
        itemMergeConfig.setRedpoint(po.getRedpoint());
        itemMergeConfig.setButtontxt10(po.getButtontxt10());
        itemMergeConfig.setMergebutton10(po.getMergebutton10());
        return itemMergeConfig;
    }

}