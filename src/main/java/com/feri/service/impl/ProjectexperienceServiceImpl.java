package com.feri.service.impl;

import com.feri.mapper.ProjectexperienceMapper;
import com.feri.pojo.Projectexperience;
import com.feri.service.ProjectexperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectexperienceServiceImpl implements ProjectexperienceService {

   @Autowired
    ProjectexperienceMapper projectexperienceMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return projectexperienceMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Projectexperience selectByPrimaryKey(Integer id) {
        return projectexperienceMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Projectexperience record) {
        return projectexperienceMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int insertSelective(Projectexperience record) {
        return projectexperienceMapper.insertSelective(record);
    }
}
