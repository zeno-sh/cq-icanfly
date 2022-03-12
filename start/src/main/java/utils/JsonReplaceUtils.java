package utils;

import com.alibaba.fastjson.JSON;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class JsonReplaceUtils {

    public void replaceJsonNode(String jsonStr, String nodeName) {
        DocumentContext context = JsonPath.parse(jsonStr);
        context = context.delete("$.store.book[*][?(@.title == 'fiction' || @.title == 'The Lord of the Rings')]");
        String result = JSON.toJSONString(JSON.parseObject(context.jsonString()), true);
        System.out.println(result);

        context.put("$.store", "name", "xiaojie.chen");
        result = JSON.toJSONString(JSON.parseObject(context.jsonString()), true);
        System.out.println(result);
    }
}
