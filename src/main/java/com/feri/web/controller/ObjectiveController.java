package com.feri.web.controller;

import com.feri.pojo.Languageability;
import com.feri.pojo.Objective;
import com.feri.service.ObjectiveService;
import com.feri.vo.Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ObjectiveController {
    @Autowired
    ObjectiveService objectiveService;

    @GetMapping("selectObjectiveService.do")
    public Vo SelectObjectiveService(int id) {

        if (null != objectiveService.selectByPrimaryKey(id)) {
            return Vo.ok();
        }
        return Vo.error();
    }

    @GetMapping("delectObjective.do")
    public Vo DelectObjective(int id) {

        if (objectiveService.deleteByPrimaryKey(id) > 0) {
            return Vo.ok();
        }
        return Vo.error();
    }

    @GetMapping("updateObjectiveService.do")
    public Vo updateObjectiveService(int id ,Integer uid, Integer worktype, Integer position,

                                     Integer expectedsalary, Integer nature) {
        Objective objective = new Objective();
        objective.setUid(uid);
        objective.setId(id);
        objective.setWorktype(worktype);
        objective.setPosition(position);
        objective.setExpectedsalary(expectedsalary);
        objective.setNature(nature);
        if (objectiveService.updateByPrimaryKeySelective(objective) > 0) {
            return Vo.ok();
        }
        return Vo.error();
    }

    @GetMapping("insertSelectiveObjective.do")
    public  Vo insertSelectiveObjective(Integer uid, Integer worktype, Integer position,
                                        Integer expectedsalary, Integer nature){

        Objective objective = new Objective();
        objective.setUid(uid);
        objective.setWorktype(worktype);
        objective.setPosition(position);
        objective.setExpectedsalary(expectedsalary);
        objective.setNature(nature);
        if (objectiveService.insertSelective(objective)>0){
            return  Vo.ok();
        }
        return Vo.error();
    }

}
