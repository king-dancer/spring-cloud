package com.spring.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.spring.ribbon.dto.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hello(String name){
        //记住：此处是用服务名调用接口  get方式调用
        return restTemplate.getForObject("http://eureka-client/hello/"+name,String.class);
    }

    public String show(UserInfo userInfo){
        //post方式调用   postForObject(1,2,3) 1:调用地址  2:请求参数 3:返回值类型.class
        return restTemplate.postForObject("http://eureka-client/show",userInfo,String.class);
    }

    //注意：此方法必须和发送熔断的方法参数相同
    public  String hiError(String name){
        return "sorry "+name+",网络故障，稍后重试！";
    }
}
