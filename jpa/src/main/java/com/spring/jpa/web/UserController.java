package com.spring.jpa.web;

import com.alibaba.fastjson.JSON;
import com.spring.jpa.dto.UserInfo;
import com.spring.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService us;
    @RequestMapping(value = "/getUser/{userName}")
    public String getUserByUserName(@PathVariable("userName") String userName){
        return JSON.toJSONString(us.getUser(userName));
    }

    @RequestMapping(value = "getPhone/{nickName}")
    public String getPhone(@PathVariable("nickName") String nickName){
        return us.getPhone(nickName);
    }

    @RequestMapping(value = "getUserEmail/{nickName}")
    public String getUserEmail(@PathVariable("nickName") String nickName){
        return us.getEmail(nickName);
    }
}
