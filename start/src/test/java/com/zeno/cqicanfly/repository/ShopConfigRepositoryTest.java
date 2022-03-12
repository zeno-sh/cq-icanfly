package com.zeno.cqicanfly.repository;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import com.zeno.cqicanfly.dto.BuyTypeDTO;
import com.zeno.cqicanfly.dto.ShopConfigDTO;
import com.zeno.cqicanfly.dto.ShopPayItemDTO;
import com.zeno.cqicanfly.dto.ShopSellerItemDTO;
import com.zeno.cqicanfly.enums.AwardTypeEnum;
import com.zeno.cqicanfly.mybatis.entity.ItemMergePO;
import com.zeno.cqicanfly.mybatis.entity.ScenesConfigPO;
import com.zeno.cqicanfly.mybatis.entity.ShopConfigPO;
import com.zeno.cqicanfly.utils.BeanCopyUtils;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import utils.JsonFileLoadUtils;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class ShopConfigRepositoryTest extends BaseTest {

    @Autowired
    private ShopConfigRepository shopConfigRepository;
    @Autowired
    private StdItemRepositoryService stdItemRepositoryService;

    @Test
    void insert() throws Exception {
        String scenesJsonPath = "/Users/zhulinfeng/Documents/GitSpace/cq-icanfly/start/src/main/resources/jsonfile/ShopConfig.json";
        String jsonStr = JsonFileLoadUtils.loadJsonFile(scenesJsonPath);

        List<ShopConfigPO> list = Lists.newArrayList();
        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        jsonObject.forEach((s, o) -> {
            JSONObject secondObj = JSONObject.parseObject(JSON.toJSONString(o));
            secondObj.forEach((secondIndex, secondValue) -> {
                JSONObject itemObj = JSONObject.parseObject(JSON.toJSONString(secondValue));
                itemObj.forEach((itemIndex, itemValue) -> {
                    ShopConfigPO shopConfigPO = JSONObject.parseObject(JSON.toJSONString(itemValue), ShopConfigPO.class);

                    list.add(shopConfigPO);
                });

            });
        });

        System.out.println(JSON.toJSONString(list));
        shopConfigRepository.insert(list);
    }

    @Test
    public void createHunhuo() {
        String itemName = "魂火[炼狱]";
        Integer itemId = stdItemRepositoryService.queryItemIdByName(itemName);

        ShopPayItemDTO shopPayItemDTO = new ShopPayItemDTO();
        shopPayItemDTO.setType(AwardTypeEnum.QATYUANBAO.getCode());
        shopPayItemDTO.setId(AwardTypeEnum.QATYUANBAO.getCode());
        shopPayItemDTO.setCount(300000);

        ShopSellerItemDTO shopSellerItemDTO = new ShopSellerItemDTO();
        shopSellerItemDTO.setType(AwardTypeEnum.QATEQUIPMENT.getCode());
        shopSellerItemDTO.setId(itemId);
        shopSellerItemDTO.setCount(1);

        ShopConfigPO po = new ShopConfigPO();
        po.setShopType(1);
        po.setTabShop(4);
        po.setShopid(106);
        po.setShop(JSON.toJSONString(shopSellerItemDTO));
        po.setPrice(JSON.toJSONString(shopPayItemDTO));
        po.setLevellimit(0);
        po.setReincarnationlimit(0);
        po.setDaylimit(0);
        po.setMaxbatchbuy(10);


        shopConfigRepository.insert(Lists.newArrayList(po));

    }

    @Test
    public void createYaoshi() {
        String itemName = "曜石[炼狱]";
        Integer itemId = stdItemRepositoryService.queryItemIdByName(itemName);

        ShopPayItemDTO shopPayItemDTO = new ShopPayItemDTO();
        shopPayItemDTO.setType(AwardTypeEnum.QATYUANBAO.getCode());
        shopPayItemDTO.setId(AwardTypeEnum.QATYUANBAO.getCode());
        shopPayItemDTO.setCount(300000);

        ShopSellerItemDTO shopSellerItemDTO = new ShopSellerItemDTO();
        shopSellerItemDTO.setType(AwardTypeEnum.QATEQUIPMENT.getCode());
        shopSellerItemDTO.setId(itemId);
        shopSellerItemDTO.setCount(1);

        ShopConfigPO po = new ShopConfigPO();
        po.setShopType(1);
        po.setTabShop(4);
        po.setShopid(107);
        po.setShop(JSON.toJSONString(shopSellerItemDTO));
        po.setPrice(JSON.toJSONString(shopPayItemDTO));
        po.setLevellimit(0);
        po.setReincarnationlimit(0);
        po.setDaylimit(0);
        po.setMaxbatchbuy(10);


        shopConfigRepository.insert(Lists.newArrayList(po));

    }

    @Test
    public void readJson() throws Exception {
        List<ShopConfigPO> shopConfigPOS = shopConfigRepository.queryAll();

        Map<Integer, List<ShopConfigPO>> shopTypeGroupMap = shopConfigPOS.stream().collect(Collectors.groupingBy(ShopConfigPO::getShopType));
        JSONObject shopTypeObj = new JSONObject();
        shopTypeGroupMap.forEach((shopType, list)->{
            Map<Integer, List<ShopConfigPO>> tabShopMap = list.stream().collect(Collectors.groupingBy(ShopConfigPO::getTabShop));
            JSONObject tabObj = new JSONObject();
            tabShopMap.forEach((tabShop, tabList)->{
                JSONObject itemObj = new JSONObject();
                tabList.forEach(po -> {
                    itemObj.put(String.valueOf(po.getShopid()), converterDTO(po));
                });
                tabObj.put(String.valueOf(tabShop), itemObj);
            });
            shopTypeObj.put(String.valueOf(shopType), tabObj);
        });


        String jsonFile = "/Users/zhulinfeng/Documents/config.json";
        String jsonStr = JsonFileLoadUtils.loadJsonFile(jsonFile);
        String shopConfigStr = JSON.toJSONString(shopTypeObj).replace("tabShop", "Tabshop").replace("shopType","shoptype").replace("maxbatchbuy","Maxbatchbuy");
        System.out.println(shopConfigStr);

        DocumentContext context = JsonPath.parse(jsonStr);
        context.set("$.ShopConfig", JSONObject.parseObject(shopConfigStr));

        String newJsonStr = context.jsonString();
        JsonFileLoadUtils.object2JsonFile(jsonFile, newJsonStr);
    }

    private ShopConfigDTO converterDTO(ShopConfigPO po) {
        ShopConfigDTO shopConfigDTO = BeanCopyUtils.copyFromObj(po, ShopConfigDTO.class);
        shopConfigDTO.setShop(JSONObject.parseObject(po.getShop(), ShopSellerItemDTO.class));
        shopConfigDTO.setPrice(JSONObject.parseObject(po.getPrice(), ShopPayItemDTO.class));
        if (StringUtils.isNotBlank(po.getBuytype())) {
            shopConfigDTO.setBuytype(JSONArray.parseArray(po.getBuytype(), BuyTypeDTO.class));
        }

        return shopConfigDTO;
    }

    @Test
    void queryByShopId() {
    }
}