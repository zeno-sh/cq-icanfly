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
public class DropTableJsonBO implements Serializable {
    @JSONField(name = "type")
    private Integer dropTableType;
    @JSONField(name = "id")
    private Integer dropTableId;
    @JSONField(name = "table")
    private List<TableJsonBO> dropItems;
    @JSONField(name = "isDropbest")
    private Integer isDropbest;
    @JSONField(name = "limitopenserverDay")
    private Integer limitopenserverDay;
    @JSONField(name = "timeLimit")
    private TimeLimitJsonBO timeLimit;
    @JSONField(name = "weeklimit")
    private WeeklimitJsonBO weeklimit;

    @NoArgsConstructor
    @Data
    public static class TimeLimitJsonBO {
    }

    @NoArgsConstructor
    @Data
    public static class WeeklimitJsonBO {
    }

    @NoArgsConstructor
    @Data
    public static class TableJsonBO {
        @JSONField(name = "id")
        private Integer itemId;
        @JSONField(name = "type")
        private Integer itemType;
        @JSONField(name = "count")
        private Integer count;
        @JSONField(name = "rate")
        private Integer rate;
    }
}
