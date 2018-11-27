package com.feri.web.controller;

import com.feri.common.MD5Utils;
import com.feri.pojo.User;
import com.feri.service.UserService;

import com.feri.vo.Vo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



import java.io.UnsupportedEncodingException;

@RestController
public class UserController {
    @Autowired
    private UserService newsService;

    @GetMapping("saveGeRen.do")
    public Vo saveUserController(String username, String password, String name, String phone, int sex, String birthdate, int schoolRecord, String objectiveone, String objectivetwo, int expectedsalary) {
        password = MD5Utils.md5(password);
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setName(name);
        user.setPhone(phone);
        user.setSex(sex);
        user.setBirthdate(birthdate);
        user.setSchoolrecord(schoolRecord);
        user.setObjectiveone(objectiveone);
        user.setObjectivetwo(objectivetwo);
        user.setExpectedsalary(expectedsalary);
        boolean b = newsService.saveUserService(user);

        if (b) {
            return Vo.ok();
        }
        return Vo.error();
    }

    /**
     * 个人登录
     *
     * @param username
     * @param password
     * @return
     */
    @PostMapping("loginUser.do")
    public String loginUserController(String username,String password){
        String phone = username;
      boolean equals = newsService.loginUserService(username,phone).getPassword().equals(MD5Utils.md5(password));

        if (equals){

            return "userindex.html";
        }
        return "userlogin.html";
    }

    @PostMapping("selectNameOrPhone.do")
    public Vo selectNameOrPhoneController(String username) {
        String phone = username;
        User user = newsService.loginUserService(username,phone);
        if (null == user) {

            return Vo.error();
        }
        return Vo.ok();
    }


    @GetMapping("updateUserinfo.do")
    public Vo updateUserinfo(int id, String name, String phone, int sex, String birthdate, int schoolRecord,
                             int marriage, String height, int heightstatus, String professional, String Politicallandscape, String national,
                             String Nativeplace, int weight, int Workexperience, int Expectedworkingaddress) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setPhone(phone);
        user.setSex(sex);
        user.setBirthdate(birthdate);
        user.setSchoolrecord(schoolRecord);
        user.setMarriage(marriage);
        user.setHeight(height);
        user.setHeightstatus(heightstatus);
        user.setProfessional(professional);
        user.setPoliticallandscape(Politicallandscape);
        user.setNational(national);
        user.setNativeplace(Nativeplace);
        user.setWeight(weight);
        user.setWorkexperience(Workexperience);
        user.setExpectedworkingaddress(Expectedworkingaddress);
        boolean b = newsService.updateByPrimaryKeySelective(user);
        if (b) {
            // if (newsService.updateByIdUserService(id, name, phone, sex, birthdate, schoolRecord, marriage, height, heightstatus, professional, Politicallandscape, national, Nativeplace, weight, Workexperience, Expectedworkingaddress)) {
            return Vo.ok();
        }
        return Vo.error();
    }


}
