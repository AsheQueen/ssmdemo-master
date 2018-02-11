package com.outman.dao.impl;

import com.outman.mapper.MessageMapper;
import com.outman.po.Message;
import com.outman.service.MessageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xuwenlong
 * @create 2018-02-07 上午11:09
 **/

@Service
public class MessageDaoImpl implements MessageDao {

    @Autowired
    private MessageMapper messageMapper;

   public List<Message> getAllMessageList(){
       return messageMapper.getAllMessageList();
   }

   public List<Message> getMessageList(Integer orgId, Integer userId){
        return messageMapper.getMessageList(orgId, userId);
   }

   public Integer sendMessage(Message message){
        return messageMapper.insert(message);
   }

   public Message getMessage(Integer messageId){
       return messageMapper.selectByPrimaryKey(messageId.longValue());
   }

   public Integer setMessageReaded(Message message){
        return messageMapper.updateByPrimaryKey(message);
    }
}
