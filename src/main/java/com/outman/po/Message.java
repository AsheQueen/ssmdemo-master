package com.outman.po;

import java.util.Date;

public class Message {
    private Long messageId;

    private Long orgId;

    private String messageMemo;

    private Long relId;

    private Short relType;

    private Long userId;

    private Short isRead;

    private Long createUserId;

    private Date createTime;

    private Integer shopId;

    private Integer listId;

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getMessageMemo() {
        return messageMemo;
    }

    public void setMessageMemo(String messageMemo) {
        this.messageMemo = messageMemo == null ? null : messageMemo.trim();
    }

    public Long getRelId() {
        return relId;
    }

    public void setRelId(Long relId) {
        this.relId = relId;
    }

    public Short getRelType() {
        return relType;
    }

    public void setRelType(Short relType) {
        this.relType = relType;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Short getIsRead() {
        return isRead;
    }

    public void setIsRead(Short isRead) {
        this.isRead = isRead;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId == null ? null : shopId;
    }

    public Integer getListId() {
        return listId;
    }

    public void setListId(Integer listId) {
        this.listId = listId;
    }
}