package com.spring.eurekaclient.web;

import com.spring.eurekaclient.dto.UserInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class TestController {
    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable(value = "name") String name){
        return "hello,"+name+" port:"+port;
    }

    @RequestMapping("/show")
    public String showUser(@RequestBody UserInfo userInfo){//记得加@RequestBody
        return "my name is "+userInfo.getName()+",i am "+userInfo.getAge() + " years old,and my certId is "
                +userInfo.getCertId()+" by the way port is "+port;
    }
}
