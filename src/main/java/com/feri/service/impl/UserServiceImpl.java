package com.feri.service.impl;


import com.feri.mapper.UserMapper;
import com.feri.pojo.User;
import com.feri.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public boolean updateByPrimaryKeySelective(User user) {
        return userMapper.updateByPrimaryKeySelective(user) > 0;
    }

    @Override
    public User loginUserService(String username,String phone) {
        return userMapper.selectByUsername(username,phone);
    }

    @Override
    public boolean saveUserService(User user) {
        return userMapper.insertSelective(user) > 0;
    }


}
