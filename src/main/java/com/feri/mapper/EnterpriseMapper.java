package com.feri.mapper;

import com.feri.pojo.Enterprise;
import org.apache.ibatis.annotations.*;

public interface EnterpriseMapper {
    int deleteByPrimaryKey(Integer id);



    int insertSelective(Enterprise record);

    Enterprise selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Enterprise record);






}
