package com.zeno.cqicanfly.repository;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.assertj.core.util.Lists;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class BaseTest {

     public <T> List convertJsonObj(Class<T> clazz, String jsonStr) {
         List list = Lists.newArrayList();
        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        jsonObject.forEach((s, o) -> {
            T t = JSONObject.parseObject(JSON.toJSONString(o), clazz);
            list.add(t);
        });
        return list;
    }
}
