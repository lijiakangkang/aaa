package com.feri.service;

import com.feri.pojo.Educationexperience;

public interface EducationexperienceService {
    int insertSelective(Educationexperience record);

    int deleteByPrimaryKey(Integer id);

    Educationexperience selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Educationexperience record);
}
