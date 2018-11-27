package com.feri.service;

import com.feri.pojo.Objective;

public interface ObjectiveService {
    int deleteByPrimaryKey(Integer id);

    Objective selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Objective record);
    int insertSelective(Objective record);
}
