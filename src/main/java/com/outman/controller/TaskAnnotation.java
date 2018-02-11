package com.outman.controller;

import com.outman.po.Message;
import com.outman.po.Notice;
import com.outman.service.MessageService;
import com.outman.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 定时器
 *
 * @author xuwenlong
 * @create 2018-02-06 下午4:48
 **/
@Component
public class TaskAnnotation {

    @Autowired
    private NoticeService noticeService;

    @Autowired
    private MessageService messageService;

        @Scheduled(cron="0 0 1 * * ? ") //每天1点执行
        public void test() throws ParseException {
          //  System.out.println("<<<---------执行任务检测--------->>>");

            List<Notice> noticeList = noticeService.getAllNotice();

            for (Notice notice : noticeList){

                if (daysBetween(notice.getTime(), new Date()) < 1 || !notice.getIsChecked()){

                    Message message = new Message();

                    message.setOrgId(notice.getOrgId().longValue());
                    message.setUserId(notice.getUserId().longValue());
                    String messageMemo = notice.getName();
                    if (messageMemo.length() > 10){
                        messageMemo = messageMemo.substring(10);
                    }
                    message.setMessageMemo("您有任务要处理: [" + messageMemo +"]");
                    message.setRelId(notice.getId().longValue());
                    message.setRelType(new Integer(23).shortValue());
                    message.setCreateTime(new Date());
                    message.setCreateUserId(notice.getUserId().longValue());
                    message.setShopId(notice.getShopId());
                    message.setListId(notice.getListId());

                    messageService.sendMessage(message);
                }
            }
        }

    public static int daysBetween(Date smdate,Date bdate) throws ParseException
    {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        smdate=sdf.parse(sdf.format(smdate));
        bdate=sdf.parse(sdf.format(bdate));
        Calendar cal = Calendar.getInstance();
        cal.setTime(smdate);
        long time1 = cal.getTimeInMillis();
        cal.setTime(bdate);
        long time2 = cal.getTimeInMillis();
        long between_days=(time2-time1)/(1000*3600*24);

        return Integer.parseInt(String.valueOf(between_days));
    }
}


