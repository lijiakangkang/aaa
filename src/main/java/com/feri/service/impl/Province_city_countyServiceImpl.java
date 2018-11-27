package com.feri.service.impl;

import com.feri.mapper.Province_city_countyMapper;
import com.feri.pojo.Adress;
import com.feri.pojo.Province_city_county;
import com.feri.service.Province_city_countyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Province_city_countyServiceImpl implements Province_city_countyService {

    @Autowired
    Province_city_countyMapper province_city_countyMapper;

    @Override
    public List<Adress> Province_city_countyService() {
        return province_city_countyMapper.selectByPrimaryKey();
    }



    @Override
    public List<Adress> Province_city(String code) {
        return province_city_countyMapper.selectByPrimarycity(code);
    }
}
