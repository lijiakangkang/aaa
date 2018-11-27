package com.feri.service.impl;

import com.feri.mapper.SelfassessmentMapper;
import com.feri.pojo.Selfassessment;
import com.feri.service.SelfassessmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class selfassessmentServiceImpl implements SelfassessmentService {

    @Autowired
    SelfassessmentMapper selfassessmentMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return selfassessmentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Selfassessment selectByPrimaryKey(Integer id) {
        return selfassessmentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Selfassessment record) {
        return selfassessmentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int insertSelective(Selfassessment record) {
        return selfassessmentMapper.insertSelective(record);
    }
}
