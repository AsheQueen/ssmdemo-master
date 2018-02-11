package com.outman.po;

public class Img {
    private Integer imgId;

    private Integer orgId;

    private String imgUrl;

    private Short relType;

    private Integer relId;

    private Integer createUser;

    public Img() {
    }

    public Img(Integer imgId, Integer orgId, String imgUrl, Short relType, Integer relId, Integer createUser) {
        this.imgId = imgId;
        this.orgId = orgId;
        this.imgUrl = imgUrl;
        this.relType = relType;
        this.relId = relId;
        this.createUser = createUser;
    }

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Short getRelType() {
        return relType;
    }

    public void setRelType(Short relType) {
        this.relType = relType;
    }

    public Integer getRelId() {
        return relId;
    }

    public void setRelId(Integer relId) {
        this.relId = relId;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }
}