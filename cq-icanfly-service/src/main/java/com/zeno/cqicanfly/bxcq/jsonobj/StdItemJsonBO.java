package com.zeno.cqicanfly.bxcq.jsonobj;

import java.io.Serializable;

/**
 * @Author zeno
 * @Date 2022/3/15
 */
@lombok.NoArgsConstructor
@lombok.Data
public class StdItemJsonBO implements Serializable {

    @com.alibaba.fastjson.annotation.JSONField(name = "dup")
    private Integer dup;
    @com.alibaba.fastjson.annotation.JSONField(name = "suggVocation")
    private Integer suggVocation;
    @com.alibaba.fastjson.annotation.JSONField(name = "denySell")
    private Integer denySell;
    @com.alibaba.fastjson.annotation.JSONField(name = "icon")
    private Integer icon;
    @com.alibaba.fastjson.annotation.JSONField(name = "time")
    private Integer time;
    @com.alibaba.fastjson.annotation.JSONField(name = "shape")
    private Integer shape;
    @com.alibaba.fastjson.annotation.JSONField(name = "cdTime")
    private Integer cdTime;
    @com.alibaba.fastjson.annotation.JSONField(name = "dealPrice")
    private Integer dealPrice;
    @com.alibaba.fastjson.annotation.JSONField(name = "dropBroadcast")
    private Integer dropBroadcast;
    @com.alibaba.fastjson.annotation.JSONField(name = "id")
    private Integer id;
    @com.alibaba.fastjson.annotation.JSONField(name = "type")
    private Integer type;
    @com.alibaba.fastjson.annotation.JSONField(name = "dealType")
    private Integer dealType;
    @com.alibaba.fastjson.annotation.JSONField(name = "packageType")
    private Integer packageType;
    @com.alibaba.fastjson.annotation.JSONField(name = "recoverid")
    private Integer recoverid;
    @com.alibaba.fastjson.annotation.JSONField(name = "denyDeal")
    private Integer denyDeal;
    @com.alibaba.fastjson.annotation.JSONField(name = "suitId")
    private Integer suitId;
    @com.alibaba.fastjson.annotation.JSONField(name = "colGroup")
    private Integer colGroup;
    @com.alibaba.fastjson.annotation.JSONField(name = "desc")
    private String desc;
    @com.alibaba.fastjson.annotation.JSONField(name = "name")
    private String name;
    @com.alibaba.fastjson.annotation.JSONField(name = "trade")
    private Integer trade;
    @com.alibaba.fastjson.annotation.JSONField(name = "itemlevel")
    private Integer itemlevel;
    @com.alibaba.fastjson.annotation.JSONField(name = "itemlvl")
    private Integer itemlvl;
    @com.alibaba.fastjson.annotation.JSONField(name = "forcetips")
    private Integer forcetips;
}
