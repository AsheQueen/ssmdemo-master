package com.outman.controller;

import com.alibaba.fastjson.JSON;
import com.outman.po.Img;
import com.outman.po.Lawer;
import com.outman.service.ImgService;
import com.outman.service.LawerService;
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
 * @author xuwenlong
 * @create 2018-02-02 下午3:48
 **/
@Controller
@CrossOrigin
@RequestMapping("restAPI")
public class LawerController {

    @Autowired
    private LawerService lawerService;

    @Autowired
    private ImgService imgService;

    @RequestMapping("/getLawerInfo")
    @ResponseBody
    public Object getLawerInfo(){

        List<Lawer> lawers = lawerService.getLawer();

        //转换输出格式
        Map<String, Object> results = new HashMap<String, Object>();
        boolean flag = false;

        List<Map> lawerList = new ArrayList<Map>();

        if (lawers.size() > 0){
            flag = true;

            for (Lawer lawer : lawers){

                Map lawerInfo = new HashMap();
                lawerInfo.put("id",lawer.getId());
                lawerInfo.put("name",lawer.getLawerName());
                lawerInfo.put("phone",lawer.getPhone());
                lawerInfo.put("goodAt", lawer.getGoodat());

                List Imgs = new ArrayList();
                List<Img> imgList = imgService.selectByRelTypeId(lawer.getId(),new Integer(22));
                if (imgList.size() > 0){
                    Map imgMap = new HashMap();
                    for (Img img : imgList){
                        imgMap.put("imgId",img.getImgId());
                        imgMap.put("imgUrl",img.getImgUrl());
                        imgMap.put("createUser",img.getCreateUser());
                        Imgs.add(imgMap);
                    }
                    lawerInfo.put("images",Imgs);
                }

                lawerList.add(lawerInfo);
            }

            results.put("result",flag);
            results.put("lawerInfo",lawerList);

        }else{
            flag = true;
            results.put("result",flag);
            results.put("lawerInfo",new ArrayList());
        }

        Object lastResult = JSON.toJSON(results);
        return lastResult;

    }

    /**
     * 根据id查询律师详情
     * @param id
     * @return
     */
    @RequestMapping("/getLawer")
    @ResponseBody
    public Object getLawer(@RequestParam("id") Integer id){
        Lawer lawer = lawerService.getLawer(id);
        Map<String, Object> results = new HashMap<String, Object>();
        if (lawer != null){
            results.put("id",lawer.getId());
            results.put("name",lawer.getLawerName());
            results.put("company",lawer.getLawerName());
          //  results.put("contact",lawer.getCompany());
            results.put("phone",lawer.getPhone());
            results.put("address",lawer.getAddress());
            results.put("webSite",lawer.getWebsite());
            results.put("goodAt", lawer.getGoodat());
            results.put("profile",lawer.getProfile());

            List Imgs = new ArrayList();
            List<Img> imgList = imgService.selectByRelTypeId(lawer.getId(),new Integer(22));
            if (imgList.size() > 0){
                Map imgMap = new HashMap();
                for (Img img : imgList){
                    imgMap.put("imgId",img.getImgId());
                    imgMap.put("imgUrl",img.getImgUrl());
                    imgMap.put("createUser",img.getCreateUser());
                    Imgs.add(imgMap);
                }
                results.put("result",true);
                results.put("images",Imgs);
            }else{
                results.put("result",true);
            }
        }
        Object lastResult = JSON.toJSON(results);
        return lastResult;
    }

}
