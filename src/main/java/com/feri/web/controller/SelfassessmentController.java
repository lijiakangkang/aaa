package com.feri.web.controller;

import com.feri.pojo.Contact;
import com.feri.pojo.Selfassessment;
import com.feri.service.SelfassessmentService;
import com.feri.vo.Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SelfassessmentController {
    @Autowired
    SelfassessmentService selfassessmentService;

    @GetMapping("selectSelfassessment.do")
    public Vo SelectSelfassessment(int id) {

        if (null != selfassessmentService.selectByPrimaryKey(id)) {
            return Vo.ok();
        }
        return Vo.error();
    }

    @GetMapping("delectSelfassessment.do")
    public Vo DelectSelfassessment(int id) {

        if (selfassessmentService.deleteByPrimaryKey(id)>0) {
            return Vo.ok();
        }
        return Vo.error();
    }

    @GetMapping("updateSelfassessment.do")
    public Vo updateSelfassessment(String detail,int uid,int id) {

        Selfassessment selfassessment = new Selfassessment();
        selfassessment.setId(id);
        selfassessment.setUid(uid);
        selfassessment.setDetail(detail);
        if (selfassessmentService.updateByPrimaryKeySelective(selfassessment) > 0) {
            return Vo.ok();
        }
        return Vo.error();
    }
    @GetMapping("insertSelfassessment.do")
    public Vo insertSelfassessment(String detail,int uid) {

        Selfassessment selfassessment = new Selfassessment();
        selfassessment.setUid(uid);
        selfassessment.setDetail(detail);
        if (selfassessmentService.insertSelective(selfassessment) > 0) {
            return Vo.ok();
        }
        return Vo.error();
    }

}
