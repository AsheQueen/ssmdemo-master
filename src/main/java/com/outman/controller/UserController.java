package com.outman.controller;

import com.alibaba.fastjson.JSON;
import com.outman.model.LoginInfo;
import com.outman.po.Org;
import com.outman.po.User;
import com.outman.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

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
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/userQuery")
    public ModelAndView userQuery() throws Exception {

        //查询id为1的用户
        User user = userService.findUserById(8);

        ModelAndView modelAndView = new ModelAndView();

        if (user != null) {
            modelAndView.addObject("username", user.getUsername());
        }

        modelAndView.setViewName("test");

        return modelAndView;

    }

    //登陆验证
    @RequestMapping(value = "/userLogin")

    public @ResponseBody
    LoginInfo userLogin(@RequestParam(value = "userPhone") String userPhone,
                        @RequestParam(value = "userPassword") String userPassword,
                        @RequestParam(value = "code") String code
    ) throws Exception {

        System.out.println(userPhone + "-------" + userPassword +"-------"+ code);
        User user = userService.findUserByPhone(userPhone);
        LoginInfo loginInfo = new LoginInfo();
        boolean result = false;

        //去用户信息
        if (userPassword.equals(user.getUserPassword()) && code.equals(user.getUserUsbId())){
            loginInfo.setUserId(user.getId());
            loginInfo.setUserName(user.getUsername());
            loginInfo.setUserType(user.getUserType());

            //取企业信息
            Integer orgId = userService.findOrgIdByUserId(user.getId());
            loginInfo.setOrgId(orgId);
            Org org = userService.findOrgInfoByOrgId(orgId);
            loginInfo.setOrgName(org.getOrgName());

            //是否是受邀人员
            result = true;
            loginInfo.setUsbId(user.getUserUsbId());
        }

//        List<InviteEntity> inviteEntities = userService.isInvited(user.getId());
//        if (inviteEntities.size() >0){
//            result = true;
//        }
        loginInfo.setResult(result);

        return loginInfo;
    }

    //修改密码
    @RequestMapping("/changePassword")
    @ResponseBody
    public Object changePassword(@RequestParam("userId") String userId,
                                 @RequestParam("newPwd")String password) throws Exception {
        //转换输出格式
        Map<String, Object> results = new HashMap<String, Object>();
        boolean flag = false;

        User user = userService.findUserById(Integer.valueOf(userId));
        if (user != null){
            user.setUserPassword(password);
            Integer num = userService.updatePassword(user);
            if (num > 0){
                flag = true;
            }
        }
        results.put("result", flag);
        Object lastResult = JSON.toJSON(results);
        return lastResult;
    }

    //获取密码
    @RequestMapping("/getPassword")
    @ResponseBody
    public Object getPassword(@RequestParam("userId") String userId) throws Exception {
        //转换输出格式
        Map<String, Object> results = new HashMap<String, Object>();
        String returnPassword = null;
        boolean flag = false;

        User user = userService.findUserById(Integer.valueOf(userId));
        if (user != null){
           returnPassword = user.getUserPassword();
                flag = true;

        }
        results.put("result", flag);
        results.put("password",returnPassword);
        Object lastResult = JSON.toJSON(results);
        return lastResult;
    }

}
