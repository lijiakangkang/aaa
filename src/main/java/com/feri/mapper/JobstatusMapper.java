package com.feri.mapper;

import com.feri.pojo.Jobstatus;

public interface JobstatusMapper {
    int deleteByPrimaryKey(Integer id);

    Jobstatus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Jobstatus record);

    int insertSelective(Jobstatus record);
}