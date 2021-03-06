package com.day.controller;

import com.day.bean.ErrorMsg;
import com.day.bean.LoginBean;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@EnableAutoConfiguration
@Controller
public class LoginController {

    @RequestMapping(value = "/", method = {RequestMethod.POST, RequestMethod.GET})
    public String index() {
        return "redirect:/index.html";
    }

    @RequestMapping(value = "/registe", method = {RequestMethod.POST})
    @ResponseBody
    public ErrorMsg registe(HttpServletRequest request, HttpServletResponse response, LoginBean searchListBean) throws InterruptedException {
        ErrorMsg errorMsg = new ErrorMsg();
        errorMsg.setErrcode("0");
        errorMsg.setErrmsg("成功");
        if (searchListBean == null || searchListBean.getUsername() == null
                || searchListBean.getPwd().equals("")
                || searchListBean.getVcode() ==  null) {
            errorMsg.setErrcode("1");
            errorMsg.setErrmsg("参数不能为空");
            return errorMsg;
        }

        //TODO
        errorMsg.setRequrl("/");
        return errorMsg;
    }
    @RequestMapping(value = "/login", method = {RequestMethod.POST})
    @ResponseBody
    public ErrorMsg login(HttpServletRequest request, HttpServletResponse response, LoginBean searchListBean) throws InterruptedException {
        ErrorMsg errorMsg = new ErrorMsg();
        errorMsg.setErrcode("0");
        errorMsg.setErrmsg("成功");
        if (searchListBean == null || searchListBean.getUsername() == null
                || searchListBean.getPwd().equals("")
                || searchListBean.getVcode() ==  null) {
            errorMsg.setErrcode("1");
            errorMsg.setErrmsg("参数不能为空");
            return errorMsg;
        }
        //TODO
        errorMsg.setRequrl("/");
        return errorMsg;
    }

}
