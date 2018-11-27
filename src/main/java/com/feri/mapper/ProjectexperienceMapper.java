package com.feri.mapper;

import com.feri.pojo.Projectexperience;

public interface ProjectexperienceMapper {
    int deleteByPrimaryKey(Integer id);

    Projectexperience selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Projectexperience record);
    int insertSelective(Projectexperience record);


}