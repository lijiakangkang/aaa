package com.feri.service;

import com.feri.pojo.Selfassessment;

public interface SelfassessmentService {
    int deleteByPrimaryKey(Integer id);

    Selfassessment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Selfassessment record);
    int insertSelective(Selfassessment record);
    
}
