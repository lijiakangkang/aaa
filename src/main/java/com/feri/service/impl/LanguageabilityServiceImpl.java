package com.feri.service.impl;

import com.feri.mapper.LanguageabilityMapper;
import com.feri.pojo.Languageability;
import com.feri.service.LanguageabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LanguageabilityServiceImpl implements LanguageabilityService {

   @Autowired
    LanguageabilityMapper languageabilityMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return languageabilityMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Languageability selectByPrimaryKey(Integer id) {
        return languageabilityMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Languageability record) {
        return languageabilityMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int insertSelective(Languageability record) {
        return languageabilityMapper.insertSelective(record);
    }
}
