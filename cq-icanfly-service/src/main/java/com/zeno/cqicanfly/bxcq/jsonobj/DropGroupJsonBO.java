package com.zeno.cqicanfly.bxcq.jsonobj;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @Author zeno
 * @Date 2022/3/15
 */
@NoArgsConstructor
@Data
public class DropGroupJsonBO implements Serializable {

    @JSONField(name = "id")
    private Integer id;
    @JSONField(name = "type")
    private Integer type;
    @JSONField(name = "group")
    private List<GroupJsonBO> group;

    @NoArgsConstructor
    @Data
    public static class GroupJsonBO {
        @JSONField(name = "rate")
        private Integer rate;
        @JSONField(name = "id")
        private Integer id;
    }
}
