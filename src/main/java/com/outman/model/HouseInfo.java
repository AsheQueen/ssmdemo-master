package com.outman.model;

import com.outman.po.Complicate;
import com.outman.po.Img;

import java.util.List;

/**
 * @author xuwenlong
 * @create 2018-01-22 下午2:24
 **/

public class HouseInfo {
    private Integer currentState;  //0 招商，1 签约，2 经营，3 退租
    private Integer nextState; //房源状态 0 招商，1 签约，2 经营，3 退租
    private Integer houseId; //'houseId0'
    private Integer houseState; //0=空置，1=免租期，2=经营中
    private String houseName;// '房屋简称',
    private String houseBuilding; //'上地',
    private Integer houseArea; //100,
    private List<Img> imgs;
    private Integer complicateId;//当前合同Id

    public HouseInfo() {
    }

    public HouseInfo(Integer currentState, Integer nextState, Integer houseId, Integer houseState, String houseName, String houseBuilding, Integer houseArea, List<Img> imgs, Integer complicateId) {
        this.currentState = currentState;
        this.nextState = nextState;
        this.houseId = houseId;
        this.houseState = houseState;
        this.houseName = houseName;
        this.houseBuilding = houseBuilding;
        this.houseArea = houseArea;
        this.imgs = imgs;
        this.complicateId = complicateId;
    }

    public Integer getCurrentState() {
        return currentState;
    }

    public void setCurrentState(Integer currentState) {
        this.currentState = currentState;
    }

    public Integer getNextState() {
        return nextState;
    }

    public void setNextState(Integer nextState) {
        this.nextState = nextState;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public Integer getHouseState() {
        return houseState;
    }

    public void setHouseState(Integer houseState) {
        this.houseState = houseState;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getHouseBuilding() {
        return houseBuilding;
    }

    public void setHouseBuilding(String houseBuilding) {
        this.houseBuilding = houseBuilding;
    }

    public Integer getHouseArea() {
        return houseArea;
    }

    public void setHouseArea(Integer houseArea) {
        this.houseArea = houseArea;
    }

    public List<Img> getImgs() {
        return imgs;
    }

    public void setImgs(List<Img> imgs) {
        this.imgs = imgs;
    }

    public Integer getComplicateId() {
        return complicateId;
    }

    public void setComplicateId(Integer complicateId) {
        this.complicateId = complicateId;
    }
}
