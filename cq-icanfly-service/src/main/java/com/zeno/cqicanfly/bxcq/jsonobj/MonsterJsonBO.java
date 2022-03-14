package com.zeno.cqicanfly.bxcq.jsonobj;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author zeno
 * @Date 2022/3/15
 */
@NoArgsConstructor
@Data
public class MonsterJsonBO implements Serializable {

    @JSONField(name = "dropid")
    private Integer dropid;
    @JSONField(name = "exp")
    private Integer exp;
    @JSONField(name = "entityid")
    private Integer entityid;
    @JSONField(name = "attackMusicRate")
    private Integer attackMusicRate;
    @JSONField(name = "level")
    private Integer level;
    @JSONField(name = "entityType")
    private Integer entityType;
    @JSONField(name = "monsterType")
    private Integer monsterType;
    @JSONField(name = "flagid")
    private Integer flagid;
    @JSONField(name = "propid")
    private Integer propid;
    @JSONField(name = "attackInterval")
    private Integer attackInterval;
    @JSONField(name = "circle")
    private Integer circle;
    @JSONField(name = "name")
    private String name;
    @JSONField(name = "damageMusicRate")
    private Integer damageMusicRate;
    @JSONField(name = "dieMusicRate")
    private Integer dieMusicRate;
    @JSONField(name = "aiConfigId")
    private Integer aiConfigId;
    @JSONField(name = "modelid")
    private Integer modelid;
    @JSONField(name = "targetMusicTate")
    private Integer targetMusicTate;

}
