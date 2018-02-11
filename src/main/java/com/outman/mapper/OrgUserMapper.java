package com.outman.mapper;

import com.outman.po.OrgUserKey;
import org.apache.ibatis.annotations.Param;

public interface OrgUserMapper {
    int deleteByPrimaryKey(OrgUserKey key);

    int insert(OrgUserKey record);

    int insertSelective(OrgUserKey record);

    OrgUserKey getRelOrgUser(@Param("orgId") Long orgId, @Param("userId") Long userId);
}