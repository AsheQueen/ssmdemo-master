package com.outman.po;

import java.sql.Timestamp;

public class Shop {

    private Integer orgId;
    private Integer shopId;
    private String shopName;
    private Integer shopArea;
    private Integer shopFinance;
    private String shopConnect;
    private String shopMobile;
    private String shopBuilding;
    private String shopRegion;
    private String shopAddress;
    private String shopFloor;
    private String shopIndustry;
    private String shopFacilities;
    private Integer createUser;
    private Timestamp createTime;

    public Shop() {

    }

    public Shop(Integer orgId, Integer shopId, String shopName, Integer shopArea, Integer shopFinance, String shopConnect, String shopMobile, String shopBuilding, String shopRegion, String shopAddress, String shopFloor, String shopIndustry, String shopFacilities, Integer createUser, Timestamp createTime) {
        this.orgId = orgId;
        this.shopId = shopId;
        this.shopName = shopName;
        this.shopArea = shopArea;
        this.shopFinance = shopFinance;
        this.shopConnect = shopConnect;
        this.shopMobile = shopMobile;
        this.shopBuilding = shopBuilding;
        this.shopRegion = shopRegion;
        this.shopAddress = shopAddress;
        this.shopFloor = shopFloor;
        this.shopIndustry = shopIndustry;
        this.shopFacilities = shopFacilities;
        this.createUser = createUser;
        this.createTime = createTime;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Integer getShopArea() {
        return shopArea;
    }

    public void setShopArea(Integer shopArea) {
        this.shopArea = shopArea;
    }

    public Integer getShopFinance() {
        return shopFinance;
    }

    public void setShopFinance(Integer shopFinance) {
        this.shopFinance = shopFinance;
    }

    public String getShopConnect() {
        return shopConnect;
    }

    public void setShopConnect(String shopConnect) {
        this.shopConnect = shopConnect;
    }

    public String getShopMobile() {
        return shopMobile;
    }

    public void setShopMobile(String shopMobile) {
        this.shopMobile = shopMobile;
    }

    public String getShopBuilding() {
        return shopBuilding;
    }

    public void setShopBuilding(String shopBuilding) {
        this.shopBuilding = shopBuilding;
    }

    public String getShopRegion() {
        return shopRegion;
    }

    public void setShopRegion(String shopRegion) {
        this.shopRegion = shopRegion;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public String getShopFloor() {
        return shopFloor;
    }

    public void setShopFloor(String shopFloor) {
        this.shopFloor = shopFloor;
    }

    public String getShopIndustry() {
        return shopIndustry;
    }

    public void setShopIndustry(String shopIndustry) {
        this.shopIndustry = shopIndustry;
    }

    public String getShopFacilities() {
        return shopFacilities;
    }

    public void setShopFacilities(String shopFacilities) {
        this.shopFacilities = shopFacilities;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : Timestamp.valueOf(createTime);
    }


    @Override
    public String toString() {
        return "Shop{" +
                "orgId=" + orgId +
                ", shopId=" + shopId +
                ", shopName='" + shopName + '\'' +
                ", shopArea=" + shopArea +
                ", shopFinance=" + shopFinance +
                ", shopConnect='" + shopConnect + '\'' +
                ", shopMobile='" + shopMobile + '\'' +
                ", shopBuilding='" + shopBuilding + '\'' +
                ", shopRegion='" + shopRegion + '\'' +
                ", shopAddress='" + shopAddress + '\'' +
                ", shopFloor='" + shopFloor + '\'' +
                ", shopIndustry='" + shopIndustry + '\'' +
                ", shopFacilities='" + shopFacilities + '\'' +
                ", createUser=" + createUser +
                ", createTime=" + createTime +
                '}';
    }
}
