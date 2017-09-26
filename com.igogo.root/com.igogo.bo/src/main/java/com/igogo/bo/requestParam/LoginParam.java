package com.igogo.bo.requestParam;

import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by Lee on 2017/8/18.
 */
public class LoginParam {

    @NotBlank(message = "登录名为空")
    private String loginName;
    @NotBlank(message = "密码为空")
    private String password;
//    @NotBlank(message = "验证码为空")
    private String qrCode;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }
}
