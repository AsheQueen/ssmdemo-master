package com.outman.controller;

import com.alibaba.fastjson.JSON;
import com.outman.po.Notice;
import com.outman.po.Org;
import com.outman.po.OrgUserKey;
import com.outman.service.NoticeService;
import com.outman.service.OrgService;
import com.outman.service.RelOrgUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 提醒业务
 *
 * @author xuwenlong
 * @create 2018-02-01 上午11:57
 **/

@Controller
@CrossOrigin
@RequestMapping("restAPI")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @Autowired
    private OrgService orgService;

    @Autowired
    private RelOrgUserService relOrgUserService;

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");


    /**
     * 获取提醒列表
     *
     * @param shopId
     * @param listId
     * @return
     */
    @RequestMapping("/noticesQuery")
    @ResponseBody
    public Object noticesQuery(@RequestParam("shopId") Integer shopId,
                               @RequestParam("listId") Integer listId,
                               @RequestParam("orgId") Integer orgId,
                               @RequestParam("userId") Integer userId) {
        List<Notice> notices = new ArrayList<Notice>();

        //根据orgId判断企业是否存在
        Org orgResult = orgService.getOrg(orgId);
        if (orgResult != null) {
            //根据orgId和UserId判断是否为当前企业下的人
            OrgUserKey relOrgUser = relOrgUserService.getRelOrgUser(orgId, userId);

            if (relOrgUser != null) {
                notices = noticeService.queryNoticesByParams(shopId, listId, orgId, userId);
            }
        }

        //转换输出格式
        Map<String, Object> results = new HashMap<String, Object>();
        boolean flag = false;

        List<Map> doneListArr = new ArrayList<Map>();
        List<Map> listArr = new ArrayList<Map>();

        if (notices.size() > 0) {
            flag = true;

            for (Notice notice : notices) {

                boolean isChecked = notice.getIsChecked();
                Map<String, Object> resultNotice = new HashMap<String, Object>();
                resultNotice.put("isChecked", notice.getIsChecked());
                resultNotice.put("id", notice.getTodolistid());
                resultNotice.put("name", notice.getName());
                resultNotice.put("date", simpleDateFormat.format(notice.getTime()));
                if (isChecked) {
                    doneListArr.add(resultNotice);

                } else {
                    listArr.add(resultNotice);

                }
            }

            results.put("result", flag);
            results.put("listArr", listArr);
            results.put("doneListArr", doneListArr);

        } else {
            flag = true;
            results.put("result", flag);
            results.put("listArr", new ArrayList());
            results.put("doneListArr", new ArrayList());
        }

        Object lastResult = JSON.toJSON(results);
        return lastResult;
    }

    /**
     * 添加提醒列表
     *
     * @param
     */
    @RequestMapping("/addNotice")
    @ResponseBody
    public Map<String, Boolean> addNotice(@RequestParam("shopId") Integer shopId,
                                          @RequestParam("listId") Integer listId,
                                          @RequestParam("name") String name,
                                          @RequestParam("isChecked") boolean isChecked,
                                          @RequestParam("date") String date,
                                          @RequestParam("todolistId") String todolistId,
                                          @RequestParam("orgId") Integer orgId,
                                          @RequestParam("userId") Integer userId) {
        Notice notice = new Notice();
        notice.setShopId(shopId);
        notice.setListId(listId);
        notice.setName(name);
        notice.setIsChecked(isChecked);
        Boolean flag = false;

        try {
            notice.setTime(simpleDateFormat.parse(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        notice.setTodolistid(todolistId);
        notice.setOrgId(orgId);
        notice.setUserId(userId);

        Integer result = noticeService.save(notice);
        if (result == 1) {
            flag = true;
        }

        Map<String, Boolean> relResult = new HashMap<String, Boolean>();
        relResult.put("result", flag);
        return relResult;
    }

    /**
     * 删除提醒信息
     *
     * @param todolistId
     * @return
     */
    @RequestMapping("/deleteNotice")
    @ResponseBody
    public Map<String, Boolean> deleteNotice(@RequestParam("todolistId") String todolistId) {
        Integer result = noticeService.deleteByToDoListId(todolistId);
        Boolean flag = false;
        if (result == 1) {
            flag = true;
        }
        Map<String, Boolean> relResult = new HashMap<String, Boolean>();
        relResult.put("result", flag);
        return relResult;
    }

    /**
     * 更新信息
     *
     * @param todolistId
     * @param name
     * @param date
     * @return
     */
    @RequestMapping("/updateNotice")
    @ResponseBody
    public Map<String, Boolean> updateNotice(@RequestParam("todolistId") String todolistId,
                                             @RequestParam("name") String name,
                                             @RequestParam("date") String date) {
        boolean flag = false;
        Notice notice = noticeService.selectNoticeByToDoListId(todolistId);
        notice.setName(name);
        try {
            notice.setTime(simpleDateFormat.parse(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Integer result = noticeService.updateNotice(notice);
        if (result == 1) {
            flag = true;
        }
        Map<String, Boolean> relResult = new HashMap<String, Boolean>();
        relResult.put("result", flag);
        return relResult;
    }

    /**
     * 修改提醒状态
     *
     * @param todolistId
     * @return
     */
    @RequestMapping("/updateNoticeState")
    @ResponseBody
    public Map<String, Boolean> updateNoticeState(@RequestParam("todolistId") String todolistId) {
        boolean flag = false;
        Notice notice = noticeService.selectNoticeByToDoListId(todolistId);
        notice.setIsChecked(!notice.getIsChecked());
        Integer result = noticeService.updateNotice(notice);
        if (result == 1) {
            flag = true;
        }
        Map<String, Boolean> relResult = new HashMap<String, Boolean>();
        relResult.put("result", flag);
        return relResult;
    }
}
