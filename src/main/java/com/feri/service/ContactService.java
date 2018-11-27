package com.feri.service;

import com.feri.mapper.ContactMapper;
import com.feri.pojo.Contact;

import org.springframework.stereotype.Service;


public interface ContactService {

    Contact selectByPrimaryKey(Integer id);

    boolean updateByPrimaryKeySelective(Contact record);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Contact record);
}
