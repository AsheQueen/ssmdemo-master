package com.outman.po;

import java.util.Date;

public class Notice {
    private Integer id;

    private Integer shopId;

    private Integer listId;

    private String name;

    private Boolean isChecked;

    private Date time;

    private String todolistid;

    private Integer orgId;

    private Integer userId;

    public Notice() {
    }

    public Notice(Integer id, Integer shopId, Integer listId, String name, Boolean isChecked, Date time, String todolistid, Integer orgId, Integer userId) {
        this.id = id;
        this.shopId = shopId;
        this.listId = listId;
        this.name = name;
        this.isChecked = isChecked;
        this.time = time;
        this.todolistid = todolistid;
        this.orgId = orgId;
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getListId() {
        return listId;
    }

    public void setListId(Integer listId) {
        this.listId = listId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Boolean getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(Boolean isChecked) {
        this.isChecked = isChecked;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getTodolistid() {
        return todolistid;
    }

    public void setTodolistid(String todolistid) {
        this.todolistid = todolistid == null ? null : todolistid.trim();
    }

    public Boolean getChecked() {
        return isChecked;
    }

    public void setChecked(Boolean checked) {
        isChecked = checked;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}