package com.spring.feign.web;

import com.spring.feign.dto.UserInfo;
import com.spring.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private FeignService fs;

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name){
        return "Feign "+fs.hello(name);
    }

    @RequestMapping("/show/{name}/{age}/{certId}")
    public String show(@PathVariable("name") String name,@PathVariable("age") String age,@PathVariable("certId") String certId){
        UserInfo userInfo=new UserInfo(name,age,certId);
        System.out.print(userInfo.getCertId());
        return "Feign "+fs.show(userInfo);
    }
}
