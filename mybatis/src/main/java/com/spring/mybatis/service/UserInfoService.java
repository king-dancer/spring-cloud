package com.spring.mybatis.service;

import com.spring.mybatis.dao.UserInfoMapper;
import com.spring.mybatis.dto.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {
    @Autowired
    UserInfoMapper uim;

    public UserInfo getUser(String userName){
        return uim.findUserByUserName(userName);
    }
}
