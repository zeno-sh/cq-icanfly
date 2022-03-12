package com.zeno.cqicanfly.repository;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zeno.cqicanfly.mybatis.entity.StdItemsPO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import utils.JsonFileLoadUtils;

import java.util.ArrayList;
import java.util.List;
@SpringBootTest
class StdItemRepositoryServiceTest {

    @Autowired
    private StdItemRepositoryService stdItemRepositoryService;

    @Test
    public void itemTest() throws Exception {
//        String json = "{\"1\":{\"dup\":0,\"suggVocation\":0,\"staitcAttrs\":[],\"denySell\":1,\"forcetips\":0,\"time\":0,\"dealPrice\":1500,\"colGroup\":0,\"cdTime\":0,\"icon\":10000,\"recoverView\":[{\"id\":0,\"type\":2,\"rate\":100,\"count\":100}],\"recoverid\":150051,\"type\":1,\"dealType\":0,\"itemlevel\":1,\"id\":1,\"packageType\":1,\"suitId\":0,\"desc\":\"木头制成的剑，是新手的好伙伴\",\"conds\":[],\"denyDeal\":1,\"name\":\"木剑\",\"trade\":1,\"dropBroadcast\":0,\"itemlvl\":0,\"shape\":46,\"existScenes\":[-1]},\"2\":{\"dup\":0,\"suggVocation\":0,\"staitcAttrs\":[{\"value\":20,\"type\":11}],\"time\":0,\"forcetips\":0,\"cdTime\":0,\"icon\":10001,\"dealPrice\":10,\"colGroup\":0,\"type\":1,\"dealType\":0,\"recoverView\":[{\"id\":0,\"type\":2,\"rate\":100,\"count\":100}],\"id\":2,\"recoverid\":150051,\"suitId\":0,\"desc\":\"有精美的菱形暗格花纹，青铜制成的剑\",\"packageType\":1,\"conds\":[],\"name\":\"[白]青铜剑\",\"trade\":1,\"dropBroadcast\":0,\"itemlvl\":3,\"shape\":1,\"existScenes\":[-1]}}".replace("select", "selectGift").replace("desc", "itemDesc");

        String itemPath = "/Users/zhulinfeng/Documents/GitSpace/cq-icanfly/start/src/test/java/com/zeno/cqicanfly/repository/StdItems.json";
        String json = JsonFileLoadUtils.loadJsonFile(itemPath);
        List<StdItemsPO> stdItemsPOList = new ArrayList<>();
        JSONObject jsonObject = JSONObject.parseObject(json);
        jsonObject.forEach((s, o) -> {
            StdItemsPO stdItemsPO = JSONObject.parseObject(JSON.toJSONString(o), StdItemsPO.class);
            stdItemsPOList.add(stdItemsPO);
        });
        stdItemRepositoryService.insert(stdItemsPOList);

    }

}