package com.feri.web.controller;

import com.feri.pojo.Companythrough;
import com.feri.service.CompanythroughService;
import com.feri.vo.Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanythroughController {

    @Autowired
    private CompanythroughService companythroughService;

//    @GetMapping("companyThroughsaveCompanythroughController.do")
//    public Vo saveCompanythroughController(int uid, String sarttime, String stoptime, String companyname, String department, int worktype, int position, int salary,
//                                           int companysize, String details, Vo vo) {
//
//        int i = companythroughService.insertCompanythroughService(uid, sarttime, stoptime, companyname, department, worktype, position, salary, companysize, details);
//        if (i > 0) {
//            return vo.ok();
//        }
//        return vo.error();
//    }

    @GetMapping("companyThroughupdateCompanythroughController.do")
    public Vo updateCompanythroughController(int id, String sarttime, String stoptime, String companyname, String department, int worktype, int position, int salary,
                                             int companysize, String details, Vo vo) {
        Companythrough companythrough = new Companythrough();
        companythrough.setId(id);
        companythrough.setSarttime(sarttime);
        companythrough.setStoptime(stoptime);
        companythrough.setCompanyname(companyname);
        companythrough.setDepartment(department);
        companythrough.setWorktype(worktype);
        companythrough.setPosition(position);
        companythrough.setSalary(salary);
        companythrough.setCompanysize(companysize);
        companythrough.setDetails(details);
        // int i = companythroughService.updateByPrimaryKeySelectiveCompanythroughService(id,sarttime,stoptime,companyname,department,worktype,position,salary,companysize,details);
        if (companythroughService.updateByPrimaryKeySelective(companythrough)) {
            return vo.ok();
        }
        return vo.error();
    }

    @GetMapping("insertCompanythroughController.do")
    public Vo insertCompanythroughController( String sarttime, String stoptime, String companyname, String department, int worktype, int position, int salary,
                                             int companysize, String details, Vo vo) {
        Companythrough companythrough = new Companythrough();

        companythrough.setSarttime(sarttime);
        companythrough.setStoptime(stoptime);
        companythrough.setCompanyname(companyname);
        companythrough.setDepartment(department);
        companythrough.setWorktype(worktype);
        companythrough.setPosition(position);
        companythrough.setSalary(salary);
        companythrough.setCompanysize(companysize);
        companythrough.setDetails(details);
        // int i = companythroughService.updateByPrimaryKeySelectiveCompanythroughService(id,sarttime,stoptime,companyname,department,worktype,position,salary,companysize,details);
        if (companythroughService.insertSelective(companythrough) > 0) {
            return vo.ok();
        }
        return vo.error();
    }

    @GetMapping("selectCompanythroughController.do")
    public Vo selectCompanythroughController(int id, Vo vo) {

        Companythrough companythrough = companythroughService.selectByPrimaryKeyCompanythroughService(id);
        if (null != companythrough) {
            vo.setArr(companythrough);
            return vo;
        }
        return vo;
    }

    @GetMapping("delectCompanythroughController.do")
    public Vo delectCompanythroughController(int id) {

        int i = companythroughService.deleteByPrimaryKeyCompanythroughService(id);
        if (i > 0) {

            return Vo.ok();
        }
        return Vo.error();
    }
}
