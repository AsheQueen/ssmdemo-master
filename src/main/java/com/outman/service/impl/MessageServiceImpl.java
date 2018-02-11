package com.outman.service.impl;

import com.outman.po.Message;
import com.outman.service.MessageDao;
import com.outman.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xuwenlong
 * @create 2018-02-06 下午1:15
 **/

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageDao messageDao;

    public List<Message> getAllMessageList() {
        return messageDao.getAllMessageList();
    }

    public List<Message> getMessageList(Integer orgId, Integer userId) {
        return messageDao.getMessageList(orgId,userId);
    }

    public Integer sendMessage(Message message) {
        return messageDao.sendMessage(message);
    }

    public Message getMessage(Integer messageId) {
        return messageDao.getMessage(messageId);
    }

    public Integer setMessageReaded(Message message) {
        return messageDao.setMessageReaded(message);
    }
}
