package com.spring.feign.service;

import com.spring.feign.dto.UserInfo;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements FeignService{
    @Override
    public String hello(String name) {
        return "sorry "+name +" 网络故障，稍后重试！";
    }

    @Override
    public String show(UserInfo userInfo) {
        return "sorry "+userInfo.getName()+",网络故障，稍后重试！";
    }
}
