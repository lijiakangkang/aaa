package com.feri.service;

import com.feri.pojo.User;

public interface UserService {
    boolean updateByPrimaryKeySelective(User user);
    User loginUserService (String username,String phone);
    boolean saveUserService(User user);


}
