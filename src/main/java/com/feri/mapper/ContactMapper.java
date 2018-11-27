package com.feri.mapper;

import com.feri.pojo.Contact;

public interface ContactMapper {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(Contact record);

    Contact selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Contact record);


}