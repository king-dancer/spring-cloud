package com.spring.mybatis.service;

import com.spring.mybatis.mapper.UserInfoMapper;
import com.spring.mybatis.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {
    @Autowired
    private UserInfoMapper uim;

    public UserInfo getUserByNickName(String nickName){
        return uim.getUserByNickName(nickName);
    }
}
