package com.feri.service.impl;

import com.feri.mapper.EnterpriseMapper;
import com.feri.pojo.Enterprise;
import com.feri.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lenovo
 */
@Service
public  class EnterpriseServicelmpl implements EnterpriseService {

    @Autowired
    EnterpriseMapper enterpriseMapper;


    @Override
    public int deleteByPrimaryKey(Integer id) {
        return enterpriseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Enterprise record) {
        return enterpriseMapper.insertSelective(record);
    }

    @Override
    public Enterprise selectByPrimaryKey(Integer id) {
        return enterpriseMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Enterprise record) {
        return enterpriseMapper.updateByPrimaryKeySelective(record);
    }
}
