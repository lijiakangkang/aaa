package com.feri.web.controller;

import com.feri.common.MD5Utils;
import com.feri.pojo.Enterprise;
import com.feri.service.EnterpriseService;
import com.feri.vo.Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnterpriseController {

    @Autowired
    private  EnterpriseService enterpriseService;

    @GetMapping("selectEnterprise.do")
    public Vo SelectEnterprise(int id) {

        if (null != enterpriseService.selectByPrimaryKey(id)) {
            return Vo.ok();
        }
        return Vo.error();
    }

    @GetMapping("delectEnterprise.do")
    public Vo DelectEnterprise(int id) {

        if (enterpriseService.deleteByPrimaryKey(id) > 0) {
            return Vo.ok();
        }
        return Vo.error();
    }

    /**

     */
   @GetMapping("updateEnterprise.do")
    public Vo updateEnterprise(int id,String username, String contactphone,
                               String contact,String companyname ,String password) {
       Enterprise enterprise = new Enterprise();
       enterprise.setId(id);
       enterprise.setUsername(username);
       enterprise.setPassword(password);
       enterprise.setContactphone(contactphone);
       enterprise.setContact(contact);
       enterprise.setCompanyname(companyname);
        if (enterpriseService.updateByPrimaryKeySelective(enterprise) > 0) {
            return Vo.ok();
        }
        return Vo.error();

    }

    @GetMapping("insertEnterprise.do")
    public Vo insertEnterprise(String username, String contactphone,
                               String contact,String companyname ,String password) {
        Enterprise enterprise = new Enterprise();

        enterprise.setUsername(username);
        enterprise.setPassword(password);
        enterprise.setContactphone(contactphone);
        enterprise.setContact(contact);
        enterprise.setCompanyname(companyname);
        if (enterpriseService.insertSelective(enterprise) > 0) {
            return Vo.ok();
        }
        return Vo.error();

    }
}

