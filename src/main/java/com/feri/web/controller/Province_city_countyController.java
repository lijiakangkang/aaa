package com.feri.web.controller;

import com.feri.pojo.Adress;
import com.feri.service.Province_city_countyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Province_city_countyController {

    @Autowired
    Province_city_countyService province_city_countyService;

    @GetMapping("city.do")
    public List<Adress> ProvinceController(){
        List<Adress> province_city_counties = province_city_countyService.Province_city_countyService();

        return province_city_counties;
    }

    @GetMapping("county.do")
    public List<Adress> CountyController(String code){
        //411400000000
        code = code.substring(0,4);
        code= code+"________";
        List<Adress> province_city_counties = province_city_countyService.Province_city(code);
        return province_city_counties;
    }
}
