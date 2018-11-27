package com.feri.mapper;

import com.feri.pojo.Companythrough;
import com.feri.pojo.User;
import org.apache.ibatis.annotations.*;

public interface CompanythroughMapper {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Companythrough companythrough);

    Companythrough selectByPrimaryKey(int id);

    int updateByPrimaryKeySelective(Companythrough companythrough);
}