package com.feri.service.impl;

import com.feri.mapper.EducationexperienceMapper;
import com.feri.pojo.Educationexperience;
import com.feri.service.EducationexperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationexperienceServiceImpl implements EducationexperienceService {
    @Autowired
    EducationexperienceMapper educationexperienceMapper;

    @Override
    public int insertSelective(Educationexperience record) {
        return educationexperienceMapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return educationexperienceMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Educationexperience selectByPrimaryKey(Integer id) {
        return educationexperienceMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Educationexperience record) {
        return educationexperienceMapper.updateByPrimaryKeySelective(record);
    }
}
