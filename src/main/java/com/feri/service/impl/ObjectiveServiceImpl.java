package com.feri.service.impl;


import com.feri.mapper.ObjectiveMapper;
import com.feri.pojo.Objective;
import com.feri.service.ObjectiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ObjectiveServiceImpl implements ObjectiveService {
    @Autowired
    ObjectiveMapper objectiveMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return objectiveMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Objective selectByPrimaryKey(Integer id) {
        return objectiveMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Objective record) {
        return objectiveMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int insertSelective(Objective record) {
        return objectiveMapper.insertSelective(record);
    }
}
