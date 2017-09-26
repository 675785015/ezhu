package com.igogo.bo.action.api.user;

import com.igogo.bo.ResponseEntity.IgogoResult;
import com.igogo.bo.ResponseEntity.ValidationResult;
import com.igogo.bo.entity.TbUser;
import com.igogo.bo.requestParam.LoginParam;
import com.igogo.bo.service.UserServiceInf;
import com.igogo.util.ValidatorUtil;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import javax.validation.ValidatorFactory;

/**
 * Created by Lee on 2017/8/16.
 */
@Controller
@RequestMapping("api/user")
public class UserApiController {

    @Autowired
    private UserServiceInf userService;

    @RequestMapping("getOne")
    @ResponseBody
    public IgogoResult getOne(Long userId){

        TbUser user = userService.selectByPrimaryKey(userId);

        return new IgogoResult(user);
    }


}
