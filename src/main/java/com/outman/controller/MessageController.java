package com.outman.controller;

import com.alibaba.fastjson.JSON;
import com.outman.po.Message;
import com.outman.po.Org;
import com.outman.po.OrgUserKey;
import com.outman.service.MessageService;
import com.outman.service.OrgService;
import com.outman.service.RelOrgUserService;
import com.outman.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 提醒消息
 *
 * @author xuwenlong
 * @create 2018-02-06 下午1:10
 **/
@Controller
@CrossOrigin
@RequestMapping("restAPI")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @Autowired
    private OrgService orgService;

    @Autowired
    private UserService userService;

    @Autowired
    private RelOrgUserService relOrgUserService;

    @RequestMapping("/getMessageList")
    @ResponseBody
    public Object getMessageList(@RequestParam("orgId") Integer orgId,
                                 @RequestParam("userId") Integer userId){

        //转换输出格式
        Map<String, Object> results = new HashMap<String, Object>();
        boolean flag = false;
        //根据orgId判断企业是否存在
        Org orgResult = orgService.getOrg(orgId);
        List MessageTempList = new ArrayList();

        if ( orgResult != null){
            //根据orgId和UserId判断是否为当前企业下的人
            OrgUserKey relOrgUser = relOrgUserService.getRelOrgUser(orgId,userId);

            if (relOrgUser != null){
                //根据orgId和userId查询messageList
                List<Message> messageList = messageService.getMessageList(orgId,userId);

                for (Message message : messageList){
                    Map messageInfo = new HashMap();

                    messageInfo.put("relId",message.getRelId());
                    messageInfo.put("shopId",message.getShopId());
                    messageInfo.put("listId",message.getListId());
                    messageInfo.put("type",0);
                    messageInfo.put("messageId",message.getMessageId());
                    messageInfo.put("messageMemo",message.getMessageMemo());
                    messageInfo.put("isRead",message.getIsRead());
                    messageInfo.put("createTime",message.getCreateTime());

                    MessageTempList.add(messageInfo);
                }
            }
        }
        results.put("noticesArr",MessageTempList);
        results.put("result",true);
        Object lastResult = JSON.toJSON(results);
        return lastResult;
    }

    @RequestMapping("/setMessageRead")
    @ResponseBody
    public Object setMessageRead(@RequestParam("orgId") Integer orgId,
                                 @RequestParam("messageId") Integer messageId){

        //转换输出格式
        Map<String, Object> results = new HashMap<String, Object>();
        boolean flag = false;

        //根据orgId判断企业是否存在
        Org orgResult = orgService.getOrg(orgId);
        if (orgResult!=null){
            Message message = messageService.getMessage(messageId);
            message.setIsRead(new Integer(1).shortValue());
            Integer num = messageService.setMessageReaded(message);
            if (num > 0){
                flag = true;
            }
        }

        results.put("result", flag);
        Object lastResult = JSON.toJSON(results);
        return lastResult;
    }
}
