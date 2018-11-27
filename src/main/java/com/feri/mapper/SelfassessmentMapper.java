package com.feri.mapper;

import com.feri.pojo.Selfassessment;

public interface SelfassessmentMapper {
    int deleteByPrimaryKey(Integer id);

    Selfassessment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Selfassessment record);

    int insertSelective(Selfassessment record);

}