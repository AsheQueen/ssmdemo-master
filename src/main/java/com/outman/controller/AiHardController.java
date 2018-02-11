package com.outman.controller;

import com.alibaba.fastjson.JSON;
import com.outman.po.AiHard;
import com.outman.po.Img;
import com.outman.service.AiHardService;
import com.outman.service.ImgService;
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
 * 智能硬件
 *
 * @author xuwenlong
 * @create 2018-02-02 下午5:39
 **/
@Controller
@CrossOrigin
@RequestMapping("restAPI")
public class AiHardController {

    @Autowired
    private AiHardService aiHardService;

    @Autowired
    private ImgService imgService;

    @RequestMapping("/getAiHardList")
    @ResponseBody
    public Object getAiHardList(){
        List<AiHard> aiHards = aiHardService.getAiHardList();

        //转换输出格式
        Map<String, Object> results = new HashMap<String, Object>();
        boolean flag = false;

        List<Map> aiHardsList = new ArrayList<Map>();

        if (aiHards.size() > 0){
            flag = true;

            for (AiHard aiHard : aiHards){


                Map aiHardInfo = new HashMap();
                aiHardInfo.put("id",aiHard.getId());
                aiHardInfo.put("title",aiHard.getTitle());
                aiHardInfo.put("phone" ,aiHard.getPhone());

                List<Img> imgList = imgService.selectByRelTypeId(aiHard.getId(),new Integer(21));
                List<Map> imgTempList = new ArrayList<Map>();

                if (imgList.size() > 0){
                    Map imgMap = new HashMap();
                    for (Img img : imgList){
                        imgMap.put("imgId",img.getImgId());
                        imgMap.put("imgUrl",img.getImgUrl());
                        imgMap.put("createUser",img.getCreateUser());
                        imgTempList.add(imgMap);
                    }
                    aiHardInfo.put("images",imgTempList);
                }
                aiHardsList.add(aiHardInfo);
            }

            results.put("result",flag);
            results.put("aiHard",aiHardsList);

        }else{
            flag = true;
            results.put("result",flag);
            results.put("aiHard",new ArrayList());
        }

        Object lastResult = JSON.toJSON(results);
        return lastResult;

    }

    /**
     * 根据id查询智能硬件详情列表
     * @param id
     * @return
     */
    @RequestMapping("/getAiHard")
    @ResponseBody
    public Object getAiHard(@RequestParam("id") Integer id){
        AiHard aiHard = aiHardService.getAiHard(id);
        Map<String, Object> results = new HashMap<String, Object>();
        if (aiHard != null){
          results.put("result",true);
          results.put("id",aiHard.getId());
          results.put("title",aiHard.getTitle());
          results.put("detail",aiHard.getDetail());
          results.put("phone",aiHard.getPhone());

          List Imgs = new ArrayList();
          List<Img> imgList = imgService.selectByRelTypeId(aiHard.getId(),new Integer(21));
          if (imgList.size() > 0){
              Map imgMap = new HashMap();
              for (Img img : imgList){
                  imgMap.put("imgId",img.getImgId());
                  imgMap.put("imgUrl",img.getImgUrl());
                  imgMap.put("createUser",img.getCreateUser());
                  Imgs.add(imgMap);
              }
              results.put("images",Imgs);
          }
        }
        Object lastResult = JSON.toJSON(results);
        return lastResult;
    }
}
