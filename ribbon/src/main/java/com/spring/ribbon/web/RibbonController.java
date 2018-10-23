package com.spring.ribbon.web;

import com.spring.ribbon.dto.UserInfo;
import com.spring.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {
    @Autowired
    private RibbonService rs;

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable(value = "name") String name){
        return "Ribbon "+rs.hello(name);
    }

    @RequestMapping("/show/{name}/{age}/{certId}")
    public String show(@PathVariable(value = "name") String name,@PathVariable(value = "age") String age,
                       @PathVariable(value = "certId") String certId){
        UserInfo userInfo = new UserInfo();
        userInfo.setName(name);
        userInfo.setAge(age);
        userInfo.setCertId(certId);
        return "Ribbon "+rs.show(userInfo);
    }
}
