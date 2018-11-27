package com.feri.service;

import com.feri.pojo.Enterprise;

public interface EnterpriseService {
//    boolean saveEnterpriseService(String username, String password, String companyname,int contact,String contactphone);
//
//    Enterprise loginEnterpriseService (String username);
//
    int deleteByPrimaryKey(Integer id);


    int insertSelective(Enterprise record);

    Enterprise selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Enterprise record);




}