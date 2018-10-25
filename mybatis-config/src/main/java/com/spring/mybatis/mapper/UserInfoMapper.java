package com.spring.mybatis.mapper;

import com.spring.mybatis.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoMapper {
    public UserInfo getUserByNickName(String nickName);
}
