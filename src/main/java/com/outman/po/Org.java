package com.outman.po;

public class Org {
    private Long orgId;

    private String orgName;

    private Short orgIndustry;

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public Short getOrgIndustry() {
        return orgIndustry;
    }

    public void setOrgIndustry(Short orgIndustry) {
        this.orgIndustry = orgIndustry;
    }
}