package com.outman.controller;

import com.outman.po.Complicate;
import com.outman.po.Shop;
import com.outman.service.ComplicateService;
import com.outman.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: outman
 * Date: 2017/7/7
 * Time: 下午9:21
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Controller
@CrossOrigin
@RequestMapping(value = "restAPI")
public class ComplicateController {

    @Autowired
    private ComplicateService complicateService;

    //查询合同信息
    @RequestMapping("/complicateQuery")
    @ResponseBody
    public List<Complicate> complicateQuery(Long shopId) throws Exception {

       // System.out.println(shopParams.toString());

        List<Complicate> complicate = complicateService.selectByShopId(shopId.intValue());
        System.out.println(complicate.toString());

        return complicate;
    }

    //保存合同
    @RequestMapping("/saveShops")
    @ResponseBody
    public Integer saveShops(Shop shopParams){
        return null;
    }

}
