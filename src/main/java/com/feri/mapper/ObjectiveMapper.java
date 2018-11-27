package com.feri.mapper;

import com.feri.pojo.Objective;

public interface ObjectiveMapper {
    int deleteByPrimaryKey(Integer id);

    Objective selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Objective record);

    int insertSelective(Objective record);
}