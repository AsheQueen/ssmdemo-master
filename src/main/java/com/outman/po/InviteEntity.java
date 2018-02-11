package com.outman.po;

import java.util.Date;

public class InviteEntity {

    private Integer inviteId;
    private Integer userId;
    private Integer orgId;
    private Integer invitedId;
    private Integer userType;
    private Integer custId;
    private Integer inviteCode;
    private Date createTime;

    public InviteEntity() {

    }

    public InviteEntity(Integer inviteId, Integer userId, Integer orgId, Integer invitedId, Integer userType, Integer custId, Integer inviteCode, Date createTime) {
        this.inviteId = inviteId;
        this.userId = userId;
        this.orgId = orgId;
        this.invitedId = invitedId;
        this.userType = userType;
        this.custId = custId;
        this.inviteCode = inviteCode;
        this.createTime = createTime;
    }

    public Integer getInviteId() {
        return inviteId;
    }

    public void setInviteId(Integer inviteId) {
        this.inviteId = inviteId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Integer getInvitedId() {
        return invitedId;
    }

    public void setInvitedId(Integer invitedId) {
        this.invitedId = invitedId;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public Integer getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(Integer inviteCode) {
        this.inviteCode = inviteCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
