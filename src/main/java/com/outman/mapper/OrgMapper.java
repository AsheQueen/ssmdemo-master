package com.outman.mapper;

import com.outman.po.Org;

public interface OrgMapper {
    int deleteByPrimaryKey(Long orgId);

    int insert(Org record);

    int insertSelective(Org record);

    Org selectByPrimaryKey(Long orgId);

    int updateByPrimaryKeySelective(Org record);

    int updateByPrimaryKey(Org record);
}