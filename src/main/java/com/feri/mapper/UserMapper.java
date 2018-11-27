package com.feri.mapper;

import com.feri.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;

public interface UserMapper {

    @Update("update t_user set username=#{updateUsername} where username = #{username}")
    @ResultType(Long.class)
    Long updateUsernameByUsernameUserMapper(String username, String updateUsername);
    int insertSelective(User user);

   // @Select("select * from t_user where username=#{username} or phone={phone}")
    User selectByUsername(@Param("username") String username,@Param("phone") String phone);

    int updateByPrimaryKeySelective(User user);

}