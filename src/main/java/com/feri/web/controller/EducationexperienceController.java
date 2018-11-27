package com.feri.web.controller;

import com.feri.pojo.Educationexperience;
import com.feri.service.EducationexperienceService;
import com.feri.vo.Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EducationexperienceController {
    @Autowired
    private EducationexperienceService educationexperienceService;

    @GetMapping("selectEducationexperience.do")
    public Vo SelectEducationexperience(int id) {

        if (null != educationexperienceService.selectByPrimaryKey(id)) {
            return Vo.ok();
        }
        return Vo.error();
    }

    @GetMapping("delectEducationexperience.do")
    public Vo DelectEducationexperience(int id) {

        if (educationexperienceService.deleteByPrimaryKey(id) > 0) {
            return Vo.ok();
        }
        return Vo.error();
    }

    @GetMapping("updateEducationexperience.do")
    public Vo updateEducationexperience(int id ,String starttime,String stoptime, String schoolname,

                                        String professionalname, int degree, int uid) {

        Educationexperience educationexperience = new Educationexperience();
        educationexperience.setId(id);
        educationexperience.setUid(uid);
        educationexperience.setStarttime(starttime);
        educationexperience.setStoptime(stoptime);
        educationexperience.setSchoolname(schoolname);
        educationexperience.setProfessionalname(professionalname);
        educationexperience.setDegree(degree);
        if (educationexperienceService.updateByPrimaryKeySelective(educationexperience) > 0) {
            return Vo.ok();
        }
        return Vo.error();
    }

    @GetMapping("insertEducationexperience.do")
    public Vo insertEducationexperience(String starttime,String stoptime, String schoolname,

                                        String professionalname, int degree, Integer uid) {

        Educationexperience educationexperience = new Educationexperience();

        educationexperience.setUid(uid);
        educationexperience.setStarttime(starttime);
        educationexperience.setStoptime(stoptime);
        educationexperience.setSchoolname(schoolname);
        educationexperience.setProfessionalname(professionalname);
        educationexperience.setDegree(degree);
        if (educationexperienceService.insertSelective(educationexperience) > 0) {
            return Vo.ok();
        }
        return Vo.error();
    }


}
