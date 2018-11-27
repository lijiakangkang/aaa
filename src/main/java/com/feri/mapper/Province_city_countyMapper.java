package com.feri.mapper;

import com.feri.pojo.Adress;
import com.feri.pojo.Province_city_county;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface Province_city_countyMapper {
    @Select("select * from province_city_county where code like \"41__00000000\"")
    List<Adress> selectByPrimaryKey();
    @Select("select * from province_city_county where code like #{name}")
    List<Adress> selectByPrimarycity(String name);
}