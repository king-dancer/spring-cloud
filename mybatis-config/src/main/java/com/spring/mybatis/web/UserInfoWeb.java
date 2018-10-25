package com.spring.mybatis.web;

import com.alibaba.fastjson.JSON;
import com.spring.mybatis.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserInfoWeb {
    @Autowired
    private UserInfoService uis;
    @ResponseBody
    @RequestMapping("/getUserByNickName/{nickName}")
    public String getUserByNickName(@PathVariable("nickName") String nickName){
        return JSON.toJSONString(uis.getUserByNickName(nickName));
    }

    /**
     *  value={"","/index"} 路径为空或/index
     * @return
     */
    @RequestMapping(value = {"","/index"})
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/test")
    public String test(HttpServletRequest request, Model model){
        //以下方式将参数带回页面
        request.setAttribute("name","张靓颖");
        model.addAttribute("age","35");
        return "test";
    }
}
