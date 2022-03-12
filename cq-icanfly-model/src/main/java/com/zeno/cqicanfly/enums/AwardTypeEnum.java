package com.zeno.cqicanfly.enums;

import lombok.Getter;

@Getter
public enum AwardTypeEnum {
    QATEQUIPMENT(0,""),    //物品或者装备 	ID:物品ID COUNT:物品数量 QUALITY:物品品质 STRONG:强化等级 BIND:绑定状态 PARAM:物品指针  --- 物品提示
    QATMONEY(1,""),    //金币 					COUNT:金币 -- UI提示
    QATBINDMONEY(2,"绑金"),    //绑金					COUNT:绑金 -- UI提示
    QATBINDYB(3,""),    //绑元 					COUNT:银两 -- 元宝点券数值提示
    QATYUANBAO(4,"元宝"),    //元宝 					COUNT:元宝 -- 元宝点券数值提示
    QATEXP(5,""),    //经验 					COUNT:经验值 PARAM:如果是任务，这个就填写任务的ID，其他的话填关键的有意义的参数，如果没有就填写0
    QATCIRCLESOUL(6,""),    //转生修为			 	COUNT:转生修为 -- 元宝点券数值提示
    QATFLYSHOES(7,""),    //飞鞋点数			 	COUNT:飞鞋点数 -- 元宝点券数值提示
    QATBROAT(8,""),    //喇叭点数			 	COUNT:喇叭点数 -- 元宝点券数值提示
    QAINTEGRAL(9,""),    //积分 					COUNT:积分     -- 元宝点券数值提示
    QAGUILDDONATE(10,""),    //行会贡献 				COUNT：行会贡献 -- 元宝点券数值提示
    QATPRESTIGENUM(11,""),   //声望					COUNT: 声望数值
    QATACTIVITY(12,""),    //活跃度				COUNT:
    QATMULTIEXPUNUSED(13,""),  //剩余未使用多倍经验		 COUNT:
    QATBASICEXPNUM(14,""),  //当前基础经验数值
    QATSTATIC(15,""),  //计数器类型
    QATTITLE(16,""),  //称号
    QATWARPOINT(17,""),  //战令积分
    QATGHOST(18,""),  //神魔积分

    QATJYQUOTA(19,""),    //交易额度 		COUNT：交易额度 -- 元宝点券数值提示
    QATZLMONEY(20,""),    //战令币
    QATREVIVEDURATION(22,""),    //复活特权
    QATLOOTPET(23,""),    //宠物
    QATCUSTOMTITLE(24,""),    //自定义称号
    QATSECRETBOXSCORE(25,""),    //秘境宝箱数量(积分),
    QATWORDSBOXSCORE(26,""),    //字诀宝箱数量(积分,""),
    QATMATERIALSBOXSCORE(27,""),    //材料宝箱数量(积分,""),

    QATSKILL(110,""),    //技能 COUNT:技能ID PARAM:技能等级
    QATACHIEVEEVENT(111,""),    //完成一个成就

    QATGUILDFR(123,""),    //繁荣度 COUNT:奖励繁荣度值
    QATXPVAL(114,""),    // XP值	 COUNT:XP值
    QATADDEXP(115,""),    //按经验配置表加经验 ID:奖励库ID COUNT:普通加成率 QUALITY:加成率 加成率使用以10000为基数的整形 即N/10000
    QATANGER(116,""),    //怒气
    QATBOSS(117,""),    //BOSS
    QATUPGRADE(118,""),    //玩家升级
    QATPETUPGRADE(119,""),    //宝宝升级
    QATGUILDCOIN(120,""),    //行会资金
    QATPERSONBOSSJIFEN(121,""),   //个人BOSS积分
    QAT22(122,""),   //
    QAT23(123,""),   //
    QAT24(124,""),   //
    QATMERITORIOUSCOUNT(125,""),    //开宝箱次数
    QATBOSSJIFEN(126,""),    //BOSS积分
    QATDRAGONSOULVALUE(128,""),    //龙魂碎片
    QATINTELLECTBALLVALUE(129,""),   //智珠碎片
    QATMERITORIOUSVALUE(130,""),    //功勋点
    QATCOMBATSCORE(31,""),    //职业宗师竞技积分
    QATNIGHTFIGHTING(132,""),    //北奇夜战积分
    QATGUILDCONTRIBUTION(133,""),    //行会贡献值 COUNT:行会贡献值
    QATCUSTOMIZE(127,""),    //自定义奖
    ;


    private int code;
    private String desc;

    AwardTypeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static String valuesOf(int code) {
        AwardTypeEnum[] values = AwardTypeEnum.values();
        for (AwardTypeEnum awardTypeEnum : values) {
            if (awardTypeEnum.code == code) {
                return awardTypeEnum.getDesc();
            }
        }
        return null;
    }
}
