装备回收调整

修改表`config/drop/droptable.config`

- 绑金起始：150*5
- 元宝起始：1

| 级别装备 | 掉落组Id | 掉落表Id                | 原掉落物品                                                   | 修改后掉落物品                                                              | 备注                   |
| :------- | -------- | ----------------------- | ------------------------------------------------------------ |----------------------------------------------------------------------| ---------------------- |
| 祖玛装备 | 150053   | {{rate=100,id=2000003}} | {{rate=100,type=2,id=2,count=150}}                           | {{rate=100,type=2,id=2,count=750},{rate=100,type=4,id=0,count=1}},   | 绑金x5倍 |
| 炎之祖玛 | 150054   | {{rate=100,id=2000004}} | {{rate=100,type=2,id=2,count=200}}                           | {{rate=100,type=2,id=2,count=1000},{rate=100,type=4,id=0,count=1}},  | 同上                   |
| 赤月装备 | 150055   | {{rate=100,id=2000005}} | {{rate=100,type=2,id=2,count=300}}                           | {{rate=100,type=2,id=2,count=1500},{rate=100,type=4,id=0,count=1}},  |                        |
| 炎之赤月 | 150056   | {{rate=100,id=2000006}} | {{rate=100,type=2,id=2,count=400}}                           | {{rate=100,type=2,id=2,count=2000},{rate=100,type=4,id=0,count=1}},  |                        |
| 魔龙装备 | 150057   | {{rate=100,id=2000007}} | {{rate=100,type=2,id=2,count=500}}                           | {{rate=100,type=2,id=2,count=2500},{rate=100,type=4,id=0,count=1}},  |                        |
| 炎之魔龙 | 150058   | {{rate=100,id=2000008}} | {{rate=100,type=2,id=2,count=800}}                           | {{rate=100,type=2,id=2,count=4000},{rate=100,type=4,id=0,count=5}},  |                        |
| 强化魔龙 | 150059   | {{rate=100,id=2000009}} | {{rate=100,type=2,id=2,count=900}}                           | {{rate=100,type=2,id=2,count=4500},{rate=100,type=4,id=0,count=5}},  |                        |
| 炎之强魔 | 150060   | {{rate=100,id=2000010}} | {{rate=100,type=2,id=2,count=1000}}                          | {{rate=100,type=2,id=2,count=5000},{rate=100,type=4,id=0,count=10}}, |                        |
| 战神装备 | 150061   | {{rate=100,id=2000011}} | {{rate=100,type=2,id=2,count=1200}}                          | {{rate=100,type=2,id=2,count=6000},{rate=100,type=4,id=0,count=10}}, |                        |
| 炎之战神 | 150062   | {{rate=100,id=2020010}} | {{rate=100,type=0,id=838,count=1}}<br />这个的意思是回收成了战神凭证 | {{rate=100,type=0,id=838,count=2},{rate=100,type=4,id=0,count=15}},  | 战神凭证+1             |
| 1阶魔器  | 150062   | {{rate=100,id=2020010}} | {{rate=100,type=0,id=838,count=1}}                           | {{rate=100,type=0,id=838,count=2},{rate=100,type=4,id=0,count=15}},  | 战神凭证+1             |
| 星王首饰 | 150063   | {{rate=100,id=2020012}} | {{rate=100,type=0,id=840,count=1}}                           | {{rate=100,type=0,id=840,count=2},{rate=100,type=4,id=0,count=30}},  | 星王凭证+1             |
| 2阶魔器  | 150063   | {{rate=100,id=2020012}} | {{rate=100,type=0,id=840,count=1}}                           | {{rate=100,type=0,id=840,count=2},{rate=100,type=4,id=0,count=30}},  | 星王凭证+1             |
| 炎之星王 | 150064   | {{rate=100,id=2020013}} | {{rate=100,type=0,id=841,count=1}}                           | {{rate=100,type=0,id=841,count=2},{rate=100,type=4,id=0,count=30}},  | 炎之星王凭证+1         |
| 3阶魔器  | 150064   | {{rate=100,id=2020013}} | {{rate=100,type=0,id=841,count=1}}                           | {{rate=100,type=0,id=841,count=2},{rate=100,type=4,id=0,count=30}},  | 星王凭证+1             |

