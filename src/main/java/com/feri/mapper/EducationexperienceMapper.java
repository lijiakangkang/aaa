package com.feri.mapper;

import com.feri.pojo.Educationexperience;

public interface EducationexperienceMapper {
    int insertSelective(Educationexperience record);

    int deleteByPrimaryKey(Integer id);

    Educationexperience selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Educationexperience record);
}