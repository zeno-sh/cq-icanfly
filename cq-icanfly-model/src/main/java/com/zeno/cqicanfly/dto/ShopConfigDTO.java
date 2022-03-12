package com.zeno.cqicanfly.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShopConfigDTO implements Serializable {

    private Integer shopType;

    private Integer tabShop;

    private Integer shopid;

    private ShopSellerItemDTO shop;

    private ShopPayItemDTO price;

    private Integer levellimit;

    private Integer reincarnationlimit;

    private Integer daylimit;

    private List<BuyTypeDTO> buytype;

    private String flag;

    private Integer statictype;

    private Integer npc;

    private Integer batchbuy;

    private Integer maxbatchbuy;
}
