package com.spring.jpa.repository;

import com.spring.jpa.dto.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<UserInfo,Long> {
    UserInfo findByUserName(String userName);

    /**
     * 使用@Param 绑定 参数  使用 nativeQuery=true 表明原生sql
     * @param nickName
     * @return
     */
    @Query(value = "select phone from userinfo where nickname=:nickname ",nativeQuery = true)
    String getUser(@Param("nickname") String nickName);

    /**
     *  使用占位符 方式绑定参数
     * @param nickName
     * @return
     */
    @Query(value = "select email from userinfo where nickname=?1",nativeQuery = true)
    String getUserEmail(String nickName);
}
