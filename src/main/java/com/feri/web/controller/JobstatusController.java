package com.feri.web.controller;

import com.feri.pojo.Jobstatus;
import com.feri.service.JobstatusService;
import com.feri.vo.Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobstatusController {
    @Autowired
    JobstatusService jobstatusService;

    @GetMapping("selectJobstatus.do")
    public Vo SelectJobstatus(int id) {

        if (null != jobstatusService.selectByPrimaryKey(id)) {
            return Vo.ok();
        }
        return Vo.error();
    }

    @GetMapping("delectJobstatus.do")
    public Vo DelectJobstatus(int id) {

        if (jobstatusService.deleteByPrimaryKey(id) > 0) {
            return Vo.ok();
        }
        return Vo.error();
    }

    @GetMapping("updateJobstatus.do")
    public Vo updateJobstatus(int id,Integer uid, Integer currentstate) {
        Jobstatus jobstatus = new Jobstatus();
                jobstatus.setId(id);
                    jobstatus.setUid(uid);
                    jobstatus.setCurrentstate(currentstate);
        if (jobstatusService.updateByPrimaryKeySelective(jobstatus) > 0) {
            return Vo.ok();
        }
        return Vo.error();

    }

    @GetMapping("insertSelectiveJobStatus.do")
    public Vo insertSelectiveJobStatus(Integer uid, Integer currentstate){
        Jobstatus jobstatus = new Jobstatus();
        jobstatus.setUid(uid);
        jobstatus.setCurrentstate(currentstate);
        if (jobstatusService.insertSelective(jobstatus) > 0){
            return Vo.ok();
        }
        return Vo.error();
    }
}
