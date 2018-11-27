package com.feri.service;

import com.feri.pojo.Companythrough;

public interface CompanythroughService {

    int deleteByPrimaryKeyCompanythroughService(int id);

    Companythrough selectByPrimaryKeyCompanythroughService(int id);

    boolean updateByPrimaryKeySelective(Companythrough companythrough);

    int insertSelective(Companythrough companythrough);
}
