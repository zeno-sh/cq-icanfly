package com.zeno.cqicanfly.mybatis.entity;

public class ShopConfigPO {
    private Integer id;

    private Integer shopType;

    private Integer tabShop;

    private Integer shopid;

    private String shop;

    private String price;

    private Integer levellimit;

    private Integer reincarnationlimit;

    private Integer daylimit;

    private String buytype;

    private String flag;

    private Integer statictype;

    private Integer npc;

    private Integer batchbuy;

    private Integer maxbatchbuy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getShopType() {
        return shopType;
    }

    public void setShopType(Integer shopType) {
        this.shopType = shopType;
    }

    public Integer getTabShop() {
        return tabShop;
    }

    public void setTabShop(Integer tabShop) {
        this.tabShop = tabShop;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop == null ? null : shop.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public Integer getLevellimit() {
        return levellimit;
    }

    public void setLevellimit(Integer levellimit) {
        this.levellimit = levellimit;
    }

    public Integer getReincarnationlimit() {
        return reincarnationlimit;
    }

    public void setReincarnationlimit(Integer reincarnationlimit) {
        this.reincarnationlimit = reincarnationlimit;
    }

    public Integer getDaylimit() {
        return daylimit;
    }

    public void setDaylimit(Integer daylimit) {
        this.daylimit = daylimit;
    }

    public String getBuytype() {
        return buytype;
    }

    public void setBuytype(String buytype) {
        this.buytype = buytype == null ? null : buytype.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public Integer getStatictype() {
        return statictype;
    }

    public void setStatictype(Integer statictype) {
        this.statictype = statictype;
    }

    public Integer getNpc() {
        return npc;
    }

    public void setNpc(Integer npc) {
        this.npc = npc;
    }

    public Integer getBatchbuy() {
        return batchbuy;
    }

    public void setBatchbuy(Integer batchbuy) {
        this.batchbuy = batchbuy;
    }

    public Integer getMaxbatchbuy() {
        return maxbatchbuy;
    }

    public void setMaxbatchbuy(Integer maxbatchbuy) {
        this.maxbatchbuy = maxbatchbuy;
    }
}