package com.feri.web.controller;


import com.feri.pojo.Languageability;
import com.feri.service.LanguageabilityService;
import com.feri.vo.Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguageabilityController {
    @Autowired
    LanguageabilityService languageabilityService;

    @GetMapping("selectLanguageability.do")
    public Vo SelectLanguageability(int id) {

        if (null != languageabilityService.selectByPrimaryKey(id)) {
            return Vo.ok();
        }
        return Vo.error();
    }

    @GetMapping("delectLanguageability.do")
    public Vo DelectLanguageability(int id) {

        if (languageabilityService.deleteByPrimaryKey(id) > 0) {
            return Vo.ok();
        }
        return Vo.error();
    }

    @GetMapping("updateLanguageability.do")
    public Vo updateLanguageability( int id,Integer uid, String languages, Integer ability) {
        Languageability languageability = new Languageability();
        languageability.setId(id);
        languageability.setUid(uid);
        languageability.setLanguages(languages);
        languageability.setAbility(ability);
        if (languageabilityService.updateByPrimaryKeySelective(languageability) > 0) {
            return Vo.ok();
        }
        return Vo.error();

    }

    @GetMapping("insertSelectiveLanguageability.do")
    public  Vo insertSelectiveLanguageability( Integer uid, String languages, Integer ability) {
        Languageability languageability = new Languageability();
        languageability.setUid(uid);
        languageability.setLanguages(languages);
        languageability.setAbility(ability);
        if (languageabilityService.insertSelective(languageability) > 0) {
            return Vo.ok();
        }
        return Vo.error();
    }
}
