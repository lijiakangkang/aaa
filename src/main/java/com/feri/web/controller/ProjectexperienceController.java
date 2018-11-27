package com.feri.web.controller;

import com.feri.pojo.Contact;
import com.feri.pojo.Projectexperience;
import com.feri.service.ProjectexperienceService;
import com.feri.vo.Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectexperienceController {
    @Autowired
    ProjectexperienceService projectexperienceService;

    @GetMapping("selectProjectexperience.do")
    public Vo SelectProjectexperienceService(int id) {

        if (null != projectexperienceService.selectByPrimaryKey(id)) {
            return Vo.ok();
        }
        return Vo.error();
    }

    @GetMapping("delectProjectexperienceService.do")
    public Vo DelectProjectexperienceService(int id) {

        if (projectexperienceService.deleteByPrimaryKey(id) > 0) {
            return Vo.ok();
        }
        return Vo.error();
    }

    @GetMapping("updateProjectexperienceService.do")
    public Vo updateProjectexperienceService(int id,Integer uid, String incompany, String starttime,

                                             String stoptime, String projectname, String details) {

        Projectexperience projectexperience = new Projectexperience();
        projectexperience.setUid(uid);
        projectexperience.setId(id);
        projectexperience.setIncompany(incompany);
        projectexperience.setStarttime(starttime);
        projectexperience.setStoptime(stoptime);
        projectexperience.setProjectname(projectname);
        projectexperience.setDetails(details);
        if (projectexperienceService.updateByPrimaryKeySelective(projectexperience) > 0) {
            return Vo.ok();
        }
        return Vo.error();

    }

    @GetMapping("insertProjectexperienceService.do")
    public Vo insertProjectexperienceService(Integer uid, String incompany, String starttime,

                                             String stoptime, String projectname, String details) {

        Projectexperience projectexperience = new Projectexperience();
        projectexperience.setUid(uid);
        projectexperience.setIncompany(incompany);
        projectexperience.setStarttime(starttime);
        projectexperience.setStoptime(stoptime);
        projectexperience.setProjectname(projectname);
        projectexperience.setDetails(details);
        if (projectexperienceService.insertSelective(projectexperience) > 0) {
            return Vo.ok();
        }
        return Vo.error();

    }
}
