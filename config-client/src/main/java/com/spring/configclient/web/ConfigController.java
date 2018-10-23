package com.spring.configclient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    @Value("${message}")
    private String foo;

    @RequestMapping("/showConfig")
    public String showConfig(){
        return foo;
    }
}
