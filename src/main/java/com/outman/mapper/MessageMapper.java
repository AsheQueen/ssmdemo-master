package com.outman.mapper;

import com.outman.po.Message;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MessageMapper {
    int deleteByPrimaryKey(Long messageId);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(Long messageId);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);

    List<Message> getAllMessageList();

    List<Message> getMessageList(@Param("orgId") Integer orgId, @Param("userId") Integer userId);
}