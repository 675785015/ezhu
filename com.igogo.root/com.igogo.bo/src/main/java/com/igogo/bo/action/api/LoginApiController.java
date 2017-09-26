package com.igogo.bo.action.api;

import com.igogo.bo.action.BaseAction;
import com.igogo.bo.entity.TbLoginInfo;
import com.igogo.bo.entity.TbUser;
import com.igogo.bo.requestParam.LoginParam;
import com.igogo.bo.service.LoginInfoServiceInf;
import com.igogo.bo.service.UserServiceInf;
import com.igogo.util.MD5Util;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;


/**
 * Created by Lee on 2017/8/18.
 */
@Controller
@RequestMapping("api/login")
public class LoginApiController extends BaseAction {

    private static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(LoginApiController.class);

    @Autowired
    private UserServiceInf userService;
//    @Autowired
//    private LoginInfoServiceInf loginInfoService;

    @RequestMapping("doLogin")
    public String doLogin(LoginParam loginParam){

        //查询用户名密码登录

        TbLoginInfo loginInfo = new TbLoginInfo();
        loginInfo.setLoginName(loginParam.getLoginName());
        String md5Code = MD5Util.GetMD5Code(loginParam.getPassword());
        loginInfo.setPassword(md5Code);
//        TbLoginInfo loginInfo1 = loginInfoService.selectLoginInfo(loginInfo);
//        if(loginInfo1!=null){
//            request.getSession().setAttribute("loginInfo",loginParam);
//            return "/";
//        }else{
//            return "login/toLogin";
//        }

            return "/";

//        ValidationResult result = ValidatorUtil.validateEntity(loginParam);
//        Assert.assertTrue(result.isHasErrors());
//        assertEquals(1, validate.size());

    }

    @RequestMapping("addUser")
    @ResponseBody
    public Integer addUser(){
        TbUser user = new TbUser();
        user.setuAge(100);
        user.setuBirth(new Date());
        user.setuCreateTime(new Date());
        user.setuSex(1);
        int insert = userService.insert(user);
        LOGGER.info("刚刚开始");
        return insert;
    }
}
