package com.spring.mybatis.web;

import com.alibaba.fastjson.JSON;
import com.spring.mybatis.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {

    @Autowired
    UserInfoService uis;

    @RequestMapping(value = "/getUserByUserName/{userName}")
    public String getUser(@PathVariable("userName")String userName){
        return JSON.toJSONString(uis.getUser(userName));
    }
}

