package com.igogo.bo.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Lee on 2017/8/17.
 */
@Controller
@RequestMapping(value = {"home","/"})
public class HomeController {

    @RequestMapping(value = {"index","/"})
    public String index(){
        return "index";
    }

    @RequestMapping("{tohtml}")
    public String toHtml(@PathVariable("tohtml")String toHtml){
        return toHtml;
    }
}
