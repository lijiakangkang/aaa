package com.feri.service;

import com.feri.pojo.Projectexperience;

public interface ProjectexperienceService {
    int deleteByPrimaryKey(Integer id);

    Projectexperience selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Projectexperience record);
    int insertSelective(Projectexperience record);
}
