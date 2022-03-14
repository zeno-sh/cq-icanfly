package com.zeno.cqicanfly.bxcq.enums;

/**
 * @Author zeno
 * @Date 2022/3/14
 */
public enum MonsterTypeEnum implements BaseEnum{

    NORMAL(1, "普通怪"),
    JINGYING(2, "精英怪"),
    SHENZHUANG(3, "神装BOSS"),
    BOSS(4, "boss"),
    UNKNOWN(5, "普通怪"),
    LIANGONG(6, "练功师怪"),
    HUMAN(7, "人形怪"),
    WORLD_BOSS(8, "世界BOSS"),
    PERSON_BOSS(9, "个人BOSS"),
    KUAFU_BOSS(10, "跨服BOSS"),
    ;

    private Integer code;
    private String desc;

    MonsterTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static boolean contains(int code) {
        MonsterTypeEnum[] values = MonsterTypeEnum.values();
        for (MonsterTypeEnum monsterTypeEnum : values) {
            if (code == monsterTypeEnum.getCode()) {
                return true;
            }
        }
        return false;
    }
}
