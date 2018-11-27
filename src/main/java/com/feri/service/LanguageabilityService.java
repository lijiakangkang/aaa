package com.feri.service;

import com.feri.pojo.Languageability;

public interface LanguageabilityService {
    int deleteByPrimaryKey(Integer id);

    Languageability selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Languageability record);
    int insertSelective(Languageability record);

}
