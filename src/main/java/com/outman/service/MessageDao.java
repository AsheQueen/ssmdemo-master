package com.outman.service;

import com.outman.po.Message;

import java.util.List;

/**
 * @author xuwenlong
 * @create 2018-02-06 下午1:16
 **/

public interface MessageDao {
    List<Message> getAllMessageList();

    List<Message> getMessageList(Integer orgId, Integer userId);

    Integer sendMessage(Message message);

    Message getMessage(Integer messageId);

    Integer setMessageReaded(Message message);
}
