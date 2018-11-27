package com.feri.service.impl;

import com.feri.mapper.CompanythroughMapper;
import com.feri.pojo.Companythrough;
import com.feri.service.CompanythroughService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanythroughServiceImpl implements CompanythroughService {

    @Autowired
    CompanythroughMapper companythroughMapper;

    @Override
    public int deleteByPrimaryKeyCompanythroughService(int id) {
        return companythroughMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Companythrough selectByPrimaryKeyCompanythroughService(int id) {
        return companythroughMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateByPrimaryKeySelective(Companythrough companythrough) {
        return companythroughMapper.updateByPrimaryKeySelective(companythrough) > 0;
    }

    @Override
    public int insertSelective(Companythrough companythrough) {
        return companythroughMapper.insertSelective(companythrough);
    }
}
