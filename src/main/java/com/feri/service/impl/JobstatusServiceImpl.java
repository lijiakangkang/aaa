package com.feri.service.impl;

import com.feri.mapper.JobstatusMapper;
import com.feri.pojo.Jobstatus;
import com.feri.service.JobstatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobstatusServiceImpl implements JobstatusService {
    @Autowired
    JobstatusMapper jobstatusMapper;


    @Override
    public int deleteByPrimaryKey(Integer id) {
        return jobstatusMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Jobstatus selectByPrimaryKey(Integer id) {
        return jobstatusMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Jobstatus record) {
        return jobstatusMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int insertSelective(Jobstatus record) {
        return jobstatusMapper.insertSelective(record);
    }
}
