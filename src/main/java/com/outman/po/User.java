package com.outman.po;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: outman
 * Date: 2017/7/7
 * Time: 下午9:17
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class User implements Serializable{

    private Integer id;//用户id

    private String username;//用户名称

    private String headpic;//头像

    private Integer userType;//用户类型

    private String userPhone;//用户手机

    private String userPassword;//用户密码

    private String weixin;//微信号

    private Integer userConceal;//关键数据

    private String userUsbId;//usb序列号

    public User() {
    }

    public User(Integer id, String username, String headpic, Integer userType, String userPhone, String userPassword, String weixin, Integer userConceal, String userUsbId) {
        this.id = id;
        this.username = username;
        this.headpic = headpic;
        this.userType = userType;
        this.userPhone = userPhone;
        this.userPassword = userPassword;
        this.weixin = weixin;
        this.userConceal = userConceal;
        this.userUsbId = userUsbId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getHeadpic() {
        return headpic;
    }

    public void setHeadpic(String headpic) {
        this.headpic = headpic;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public Integer getUserConceal() {
        return userConceal;
    }

    public void setUserConceal(Integer userConceal) {
        this.userConceal = userConceal;
    }

    public String getUserUsbId() {
        return userUsbId;
    }

    public void setUserUsbId(String userUsbId) {
        this.userUsbId = userUsbId;
    }
}
