package com.igogo.bo;

import com.igogo.bo.entity.TbLoginInfo;
import com.igogo.bo.entity.TbUser;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Lee on 2017/8/17.
 */

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        HttpSession session = httpServletRequest.getSession();
        TbUser loginInfo = (TbUser) session.getAttribute("loginInfo");
        if(loginInfo==null){
            //跳转登录页
            String requestURI = httpServletRequest.getRequestURI();
            httpServletResponse.sendRedirect(httpServletRequest.getContextPath()+"/login/toLogin?redirect="+requestURI);
            return false;
        }else{
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
