package com.outman.controller;

import com.outman.model.HouseInfo;
import com.outman.po.Complicate;
import com.outman.po.Img;
import com.outman.po.Shop;
import com.outman.service.ComplicateService;
import com.outman.service.ImgService;
import com.outman.service.ShopService;
import com.outman.utils.NullUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.alibaba.fastjson.JSON;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.*;

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
public class ShopController {

    @Autowired
    private ShopService shopService;

    @Autowired
    private ComplicateService complicateService;

    @Autowired
    private ImgService imgService;

    private Shop keyShop;

    //根据参数查询商铺信息
    @RequestMapping("/shopQuery")
    @ResponseBody
    public Object shopQuery(@RequestParam(value = "shop", required = false) Shop shop,
                            @RequestParam(value = "keyWord", required = false) String keyWord) {

       // System.out.println(shopParams.toString());

        List<HouseInfo> houseInfoList = new ArrayList<HouseInfo>();
        List<Shop> shops = null;
       // keyShop = new Shop();
        if (keyShop.getShopRegion() == null && keyShop.getShopBuilding() == null && keyWord == null){
            shops = shopService.getShopByParams(shop);
        }else {
            shops = shopService.getShopByParams(keyShop);
            keyShop = null;
        }

        Boolean flag = false;
        //当前时间
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();

        if (shops.size() > 0 ){
           flag = true;
        }
      //  List<Object> results = new ArrayList<Object>();

        Map<String, Object> results = new HashMap<String, Object>();

        for (Shop shopObject : shops){

            List<Img> showImgList = new ArrayList<Img>();

            Integer shopId = shopObject.getShopId();
            //根据shopId查看图片
            List<Img> imgList = imgService.selectByRelId(shopId);
            List<Complicate> complicates = complicateService.selectByShopId(shopId);

            HouseInfo houseInfo = new HouseInfo();
            houseInfo.setHouseId(shopObject.getShopId());
            houseInfo.setHouseArea(shopObject.getShopArea());
            houseInfo.setHouseName(shopObject.getShopName());
            houseInfo.setHouseBuilding(shopObject.getShopBuilding());
            houseInfo.setCurrentState(0);
            houseInfo.setNextState(1);

            for (Complicate complicate : complicates){
                List<Img> imgComplicateList = imgService.selectByComplicateId(complicate.getComplicateId());
                //根据合同id查询img
                if (imgList.size() > 0){
                    showImgList.addAll(imgList);
                }else if (imgComplicateList.size() > 0){
                    showImgList.addAll(imgComplicateList);
                }

                //根据合同时间判断房屋状态
                Date endDate = complicate.getEndDate();
                Date startDate = complicate.getStartDate();
                Date endRentFreeDate = complicate.getEndRentFreeDate();
                Date startRentFreeDate = complicate.getStartRentFreeDate();

                //过去三个月时间
                if (!NullUtil.isEmpty(endDate)){

                    calendar.setTime(endDate);
                }
                
                calendar.add(Calendar.MONTH, -3);
                Date m = calendar.getTime();
//                String mon = format.format(m);
//                System.out.println("过去三个月："+mon);

                //        currentState: 0, //0 招商，1 签约，2 经营，3 退租
                //        nextState: 1, //房源状态 0 招商，1 签约，2 经营，3 退租
                //        houseId: 'houseId0',
                //        houseState: 0, //0=空置，1=免租期，2=经营中

                if (!NullUtil.isEmpty(endDate) && !NullUtil.isEmpty(startDate) && endDate.getTime() > now.getTime() && now.getTime() > startDate.getTime()){
                   //有免租期
                    if (!NullUtil.isEmpty(endRentFreeDate) && !NullUtil.isEmpty(startRentFreeDate)){
                      if (startRentFreeDate.getTime() >= startDate.getTime() && endRentFreeDate.getTime() < endDate.getTime()){
                          if (startRentFreeDate.getTime() < now.getTime() && endRentFreeDate.getTime() > now.getTime()){
                              houseInfo.setHouseState(1); //免租期
                              houseInfo.setCurrentState(1);
                              houseInfo.setNextState(2);
                          }else if (endDate.getTime() > now.getTime() && endRentFreeDate.getTime() < now.getTime()){
                              houseInfo.setHouseState(2); //经营中
                              if (m.getTime() > now.getTime()){
                                  houseInfo.setCurrentState(2);
                                  houseInfo.setNextState(3);
                              }else if(m.getTime() < now.getTime()){
                                  houseInfo.setCurrentState(3);
                                  houseInfo.setNextState(0);
                              }
                          }
                      }
                   }
                   //没有免租期
                   else{
                       houseInfo.setHouseState(2); //经营中
                       if (m.getTime() > now.getTime()){
                           houseInfo.setCurrentState(2);
                           houseInfo.setNextState(3);
                       }else if(m.getTime() < now.getTime()){
                           houseInfo.setCurrentState(3);
                           houseInfo.setNextState(0);
                       }
                   }
                }else{
                        houseInfo.setHouseState(0); //空置
                        houseInfo.setCurrentState(0); //招商
                        houseInfo.setNextState(1);
                }

                houseInfo.setImgs(showImgList);

                if (endDate != null && endDate.getTime() > now.getTime()){
                    houseInfo.setComplicateId(complicate.getComplicateId());
                }else {
                    houseInfo.setComplicateId(-1);
                }
            }

            houseInfoList.add(houseInfo);

        }

        results.put("all",houseInfoList.size());
        results.put("results",houseInfoList);
        results.put("result",true);

       // Collection<Object> values = results.values();

        Object json = JSON.toJSON(results);
        return json;
    }

    //根据关键字查询
    @RequestMapping("/shopQueryByKeyWords")
    public ModelAndView SeacherByKeyWords(@RequestParam(value = "keyword",required = false) String keyword,
                                    @RequestParam(value = "orgId") Integer orgId) {

        String[] keyWords = keyword.split(",",3);
        keyShop = new Shop();
        keyShop.setShopRegion(keyWords[0] = keyWords[0] == null ? null : keyWords[0]);
        keyShop.setShopBuilding(keyWords[1] == null ? null : keyWords[1]);
        keyShop.setOrgId(orgId);
        String keyWord = keyWords[2] == null ? null : keyWords[2];
        keyShop.setShopName(keyWord);
        keyShop.setShopAddress(keyWord);
        keyShop.setShopFloor(keyWord);
        keyShop.setShopIndustry(keyWord);
        keyShop.setShopFacilities(keyWord);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/restAPI/shopQuery.action");
        modelAndView.addObject("keyWord",keyWord);

        return modelAndView;

    }

    //测试
    @RequestMapping("/arrayParam")
    public @ResponseBody
    int test1(@RequestParam(value = "datas[]") long[] datas) {
        return datas.length;
    }

    //测试字符串数组
    @RequestMapping(value = "/strArrayParam")
    public @ResponseBody
    String test1(@RequestParam(value = "datas[]") String datas[],
                 @RequestParam(value = "orgId") Integer orgId) {

        System.out.println(datas.toString());
        System.out.println(orgId);
        return datas.toString();
    }

}
