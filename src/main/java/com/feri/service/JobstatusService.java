package com.feri.service;

import com.feri.pojo.Jobstatus;

public interface JobstatusService {
    int deleteByPrimaryKey(Integer id);

    Jobstatus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Jobstatus record);

    int insertSelective(Jobstatus record);
}
