package com.feri.mapper;

import com.feri.pojo.Languageability;

public interface LanguageabilityMapper {
    int deleteByPrimaryKey(Integer id);

    Languageability selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Languageability record);
    int insertSelective(Languageability record);

}