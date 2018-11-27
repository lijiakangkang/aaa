package com.feri.service.impl;

import com.feri.mapper.ContactMapper;
import com.feri.pojo.Contact;
import com.feri.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    ContactMapper contactMapper;
    @Override
    public Contact selectByPrimaryKey(Integer id) {
        return contactMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateByPrimaryKeySelective(Contact record) {
        return contactMapper.updateByPrimaryKeySelective(record) > 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return contactMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Contact record) {
        return contactMapper.insertSelective(record);
    }
}
