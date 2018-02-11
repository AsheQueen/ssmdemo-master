package com.outman.controller;

import com.alibaba.fastjson.JSON;
import com.outman.po.AiHard;
import com.outman.po.Img;
import com.outman.po.News;
import com.outman.service.AiHardService;
import com.outman.service.ImgService;
import com.outman.service.NewsService;
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
 * 新闻
 * @author xuwenlong
 * @create 2018-02-06 上午10:09
 **/
@Controller
@CrossOrigin
@RequestMapping("restAPI")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @Autowired
    private ImgService imgService;

    @RequestMapping("/getNewsList")
    @ResponseBody
    public Object getNewsList(){
        List<News> news = newsService.getNewsList();

        //转换输出格式
        Map<String, Object> results = new HashMap<String, Object>();
        boolean flag = false;

        List<Map> newsList = new ArrayList<Map>();

        if (news.size() > 0){
            flag = true;

            for (News newInfo : news){

                Map newsInfoMap = new HashMap();
                newsInfoMap.put("id",newInfo.getId());
                newsInfoMap.put("title",newInfo.getTitle());
                newsInfoMap.put("date" ,newInfo.getDate());

                newsList.add(newsInfoMap);
            }

            results.put("result",flag);
            results.put("newsList",newsList);

        }else{
            flag = true;
            results.put("result",flag);
            results.put("newsList",new ArrayList());
        }

        Object lastResult = JSON.toJSON(results);
        return lastResult;

    }

    /**
     * 根据id查询新闻详情
     * @param id
     * @return
     */
    @RequestMapping("/getNews")
    @ResponseBody
    public Object getNews(@RequestParam("id") Integer id){
        News news = newsService.getNews(id);
        Map<String, Object> results = new HashMap<String, Object>();
        if (news != null){
            results.put("result",true);
            results.put("id",news.getId());
            results.put("title",news.getTitle());
            results.put("detail",news.getNewsdetail());
            results.put("date",news.getDate());

        }
        Object lastResult = JSON.toJSON(results);
        return lastResult;
    }
}
