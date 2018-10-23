package com.spring.feign.service;

import com.spring.feign.dto.UserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eureka-client",fallback = SchedualServiceHiHystric.class)
public interface FeignService {
    @RequestMapping(value = "/hello/{name}",method = RequestMethod.GET)
    public String hello(@PathVariable("name") String name);

    @RequestMapping(value = "/show",method = RequestMethod.POST)
    public String show(@RequestBody UserInfo userInfo);
}
