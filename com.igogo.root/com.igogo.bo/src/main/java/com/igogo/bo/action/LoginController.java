package com.igogo.bo.action;

import com.igogo.bo.entity.TbLoginInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Lee on 2017/8/17.
 */
@Controller
@RequestMapping("login")
public class LoginController {

    @RequestMapping("toLogin")
    public String toLogin(){
        return "login/login";
    }


}
