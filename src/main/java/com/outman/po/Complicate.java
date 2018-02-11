package com.outman.po;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

public class Complicate {
    private Integer complicateId;

    private Integer orgId;

    private String complicateName;

    private Timestamp signDate;

    private Integer custId1;

    private Integer custId2;

    private Integer shopId;

    private String firstPart;

    private String secondPart;

    private String address;

    private String area;

    private String industry;

    private String brand;

    private String commitment;

    private String bankName;

    private String bankUserName;

    private String bankAccount;

    private BigDecimal complicateDeposit;

    private String complicateAmount;

    private Timestamp startDate;

    private Timestamp endDate;

    private Timestamp startRentFreeDate;

    private Timestamp endRentFreeDate;

    private Short complicateCycle;

    private Timestamp complicateTime1;

    private Timestamp complicateTime2;

    private Integer ownerUser;

    private Integer financeUser;

    private Integer deliveryUser;

    private Short complicateState;

    private String complicateMemo;

    private String picLog;

    private Integer createUser;

    private Timestamp createTime;

    public Complicate() {
    }

    public Complicate(Integer orgId, String complicateName, Timestamp signDate, Integer custId1, Integer custId2, Integer shopId, String firstPart, String secondPart, String address, String area, String industry, String brand, String commitment, String bankName, String bankUserName, String bankAccount, BigDecimal complicateDeposit, String complicateAmount, Timestamp startDate, Timestamp endDate, Timestamp startRentFreeDate, Timestamp endRentFreeDate, Short complicateCycle, Timestamp complicateTime1, Timestamp complicateTime2, Integer ownerUser, Integer financeUser, Integer deliveryUser, Short complicateState, String complicateMemo, String picLog, Integer createUser, Timestamp createTime) {
        this.orgId = orgId;
        this.complicateName = complicateName;
        this.signDate = signDate;
        this.custId1 = custId1;
        this.custId2 = custId2;
        this.shopId = shopId;
        this.firstPart = firstPart;
        this.secondPart = secondPart;
        this.address = address;
        this.area = area;
        this.industry = industry;
        this.brand = brand;
        this.commitment = commitment;
        this.bankName = bankName;
        this.bankUserName = bankUserName;
        this.bankAccount = bankAccount;
        this.complicateDeposit = complicateDeposit;
        this.complicateAmount = complicateAmount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startRentFreeDate = startRentFreeDate;
        this.endRentFreeDate = endRentFreeDate;
        this.complicateCycle = complicateCycle;
        this.complicateTime1 = complicateTime1;
        this.complicateTime2 = complicateTime2;
        this.ownerUser = ownerUser;
        this.financeUser = financeUser;
        this.deliveryUser = deliveryUser;
        this.complicateState = complicateState;
        this.complicateMemo = complicateMemo;
        this.picLog = picLog;
        this.createUser = createUser;
        this.createTime = createTime;
    }

    public Complicate(Integer complicateId, Integer orgId, String complicateName, Timestamp signDate, Integer custId1, Integer custId2, Integer shopId, String firstPart, String secondPart, String address, String area, String industry, String brand, String commitment, String bankName, String bankUserName, String bankAccount, BigDecimal complicateDeposit, String complicateAmount, Timestamp startDate, Timestamp endDate, Timestamp startRentFreeDate, Timestamp endRentFreeDate, Short complicateCycle, Timestamp complicateTime1, Timestamp complicateTime2, Integer ownerUser, Integer financeUser, Integer deliveryUser, Short complicateState, String complicateMemo, String picLog, Integer createUser, Timestamp createTime) {
        this.complicateId = complicateId;
        this.orgId = orgId;
        this.complicateName = complicateName;
        this.signDate = signDate;
        this.custId1 = custId1;
        this.custId2 = custId2;
        this.shopId = shopId;
        this.firstPart = firstPart;
        this.secondPart = secondPart;
        this.address = address;
        this.area = area;
        this.industry = industry;
        this.brand = brand;
        this.commitment = commitment;
        this.bankName = bankName;
        this.bankUserName = bankUserName;
        this.bankAccount = bankAccount;
        this.complicateDeposit = complicateDeposit;
        this.complicateAmount = complicateAmount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startRentFreeDate = startRentFreeDate;
        this.endRentFreeDate = endRentFreeDate;
        this.complicateCycle = complicateCycle;
        this.complicateTime1 = complicateTime1;
        this.complicateTime2 = complicateTime2;
        this.ownerUser = ownerUser;
        this.financeUser = financeUser;
        this.deliveryUser = deliveryUser;
        this.complicateState = complicateState;
        this.complicateMemo = complicateMemo;
        this.picLog = picLog;
        this.createUser = createUser;
        this.createTime = createTime;
    }

    public Integer getComplicateId() {
        return complicateId;
    }

    public void setComplicateId(Integer complicateId) {
        this.complicateId = complicateId;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getComplicateName() {
        return complicateName;
    }

    public void setComplicateName(String complicateName) {
        this.complicateName = complicateName;
    }

    public Timestamp getSignDate() {
        return signDate;
    }

    public void setSignDate(Timestamp signDate) {
        this.signDate = signDate;
    }

    public Integer getCustId1() {
        return custId1;
    }

    public void setCustId1(Integer custId1) {
        this.custId1 = custId1;
    }

    public Integer getCustId2() {
        return custId2;
    }

    public void setCustId2(Integer custId2) {
        this.custId2 = custId2;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getFirstPart() {
        return firstPart;
    }

    public void setFirstPart(String firstPart) {
        this.firstPart = firstPart;
    }

    public String getSecondPart() {
        return secondPart;
    }

    public void setSecondPart(String secondPart) {
        this.secondPart = secondPart;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCommitment() {
        return commitment;
    }

    public void setCommitment(String commitment) {
        this.commitment = commitment;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankUserName() {
        return bankUserName;
    }

    public void setBankUserName(String bankUserName) {
        this.bankUserName = bankUserName;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public BigDecimal getComplicateDeposit() {
        return complicateDeposit;
    }

    public void setComplicateDeposit(BigDecimal complicateDeposit) {
        this.complicateDeposit = complicateDeposit;
    }

    public String getComplicateAmount() {
        return complicateAmount;
    }

    public void setComplicateAmount(String complicateAmount) {
        this.complicateAmount = complicateAmount;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public Timestamp getStartRentFreeDate() {
        return startRentFreeDate;
    }

    public void setStartRentFreeDate(Timestamp startRentFreeDate) {
        this.startRentFreeDate = startRentFreeDate;
    }

    public Timestamp getEndRentFreeDate() {
        return endRentFreeDate;
    }

    public void setEndRentFreeDate(Timestamp endRentFreeDate) {
        this.endRentFreeDate = endRentFreeDate;
    }

    public Short getComplicateCycle() {
        return complicateCycle;
    }

    public void setComplicateCycle(Short complicateCycle) {
        this.complicateCycle = complicateCycle;
    }

    public Timestamp getComplicateTime1() {
        return complicateTime1;
    }

    public void setComplicateTime1(Timestamp complicateTime1) {
        this.complicateTime1 = complicateTime1;
    }

    public Timestamp getComplicateTime2() {
        return complicateTime2;
    }

    public void setComplicateTime2(Timestamp complicateTime2) {
        this.complicateTime2 = complicateTime2;
    }

    public Integer getOwnerUser() {
        return ownerUser;
    }

    public void setOwnerUser(Integer ownerUser) {
        this.ownerUser = ownerUser;
    }

    public Integer getFinanceUser() {
        return financeUser;
    }

    public void setFinanceUser(Integer financeUser) {
        this.financeUser = financeUser;
    }

    public Integer getDeliveryUser() {
        return deliveryUser;
    }

    public void setDeliveryUser(Integer deliveryUser) {
        this.deliveryUser = deliveryUser;
    }

    public Short getComplicateState() {
        return complicateState;
    }

    public void setComplicateState(Short complicateState) {
        this.complicateState = complicateState;
    }

    public String getComplicateMemo() {
        return complicateMemo;
    }

    public void setComplicateMemo(String complicateMemo) {
        this.complicateMemo = complicateMemo;
    }

    public String getPicLog() {
        return picLog;
    }

    public void setPicLog(String picLog) {
        this.picLog = picLog;
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

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}