package com.outman.model;

public class LoginInfo {

   // {"userId":"26","userName":"杨柳testA","userType":"3","orgId":"14","orgName":"海岳盛世","result":true

    private Integer userId;
    private String userName;
    private Integer userType;
    private Integer orgId;
    private String orgName;
    private Boolean result;
    private String usbId;

    public LoginInfo() {
    }

    public LoginInfo(Integer userId, String userName, Integer userType, Integer orgId, String orgName, Boolean result, String usbId) {
        this.userId = userId;
        this.userName = userName;
        this.userType = userType;
        this.orgId = orgId;
        this.orgName = orgName;
        this.result = result;
        this.usbId = usbId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public String getUsbId() {
        return usbId;
    }

    public void setUsbId(String usbId) {
        this.usbId = usbId;
    }

    @Override
    public String toString() {
        return "LoginInfo{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userType=" + userType +
                ", orgId=" + orgId +
                ", orgName='" + orgName + '\'' +
                ", result=" + result +
                ", usbId='" + usbId + '\'' +
                '}';
    }
}
