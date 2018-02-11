package com.outman.mapper;

import com.outman.po.InviteEntity;
import com.outman.po.Org;
import com.outman.po.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: outman
 * Date: 2017/7/7
 * Time: 下午9:18
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface UserMapper {
    User findUserById(int id);

    User findUserByPhone(String userPhone);

    Integer findOrgIdByUserId(Integer userId);

    Org findOrgInfoByOrgId(Integer orgId);

    List<InviteEntity> isInvited(Integer userId);

    Integer updatePassword(User user);
}
