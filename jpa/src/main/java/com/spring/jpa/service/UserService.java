package com.spring.jpa.service;

import com.spring.jpa.dto.UserInfo;
import com.spring.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository ur;
    public UserInfo getUser(String userName){
        UserInfo userInfo = ur.findByUserName(userName);
        return userInfo;
    }

    public String getPhone(String nickName){
        return ur.getUser(nickName);
    }

    public String getEmail(String nickName){
        return ur.getUserEmail(nickName);
    }
}