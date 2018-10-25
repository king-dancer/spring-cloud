package com.spring.mybatis.dao;

import com.spring.mybatis.dto.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserInfoMapper {
    /**
     *  mapper 和  jpa 不同， 不能用 :userName 和 ?1 占位符 来绑定参数
     *   mapper 可以使用  #{userName} 和  '${userName}' (注意单引号)
     * @param userName
     * @return
     */
    @Select("select * from userinfo where username='${userName}'")
    UserInfo findUserByUserName(@Param("userName") String userName);
}
