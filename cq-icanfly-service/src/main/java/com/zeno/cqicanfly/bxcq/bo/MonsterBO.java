package com.zeno.cqicanfly.bxcq.bo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author zeno
 * @Date 2022/3/14
 */
@Data
public class MonsterBO implements Serializable {
    /**
     * 怪物名称
     */
    private String monsterName;
    /**
     * 怪物Id
     */
    private Integer monsterId;
    /**
     * 掉落组Id
     */
    private Integer dropGroupId;
    /**
     * 怪物类型
     *
     * @see com.zeno.cqicanfly.bxcq.enums.MonsterTypeEnum
     */
    private Integer monsterType;
    /**
     * 类型字符串、给前端用
     */
    private String monsterTypeStr;
}
