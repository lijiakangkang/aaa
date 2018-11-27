package com.feri.web.controller;

import com.feri.pojo.Contact;
import com.feri.service.ContactService;
import com.feri.vo.Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lenovo
 */
@RestController
public class ContactServiceContraller {
    @Autowired
    ContactService contactService;

    @GetMapping("selectContact.do")
    public Vo SelectContact(int id) {

        if (null != contactService.selectByPrimaryKey(id)) {
            return Vo.ok();
        }
        return Vo.error();
    }

    @GetMapping("delectContact.do")
    public Vo DelectContact(int id) {

        if (contactService.deleteByPrimaryKey(id)>0) {
            return Vo.ok();
        }
        return Vo.error();
    }

    @GetMapping("updateContact.do")
    public Vo updateContact( int id ,String alternatephone, String email, String qq,
                            String weixin, String nowaddress, int uid) {

        Contact contact = new Contact();
        contact.setId(id);
        contact.setUid(uid);
        contact.setAlternatephone(alternatephone);
        contact.setEmail(email);
        contact.setQq(qq);
        contact.setWeixin(weixin);
        contact.setNowaddress(nowaddress);
        if (contactService.updateByPrimaryKeySelective(contact)) {
            return Vo.ok();
        }
        return Vo.error();

    }
    @GetMapping("insertSelective.do")
    public Vo insertSelective(String alternatephone, String email, String qq,
                              String weixin, String nowaddress, int uid) {
        Contact contact = new Contact();
        contact.setUid(uid);
        contact.setAlternatephone(alternatephone);
        contact.setEmail(email);
        contact.setQq(qq);
        contact.setWeixin(weixin);
        contact.setNowaddress(nowaddress);
        if (contactService.insertSelective(contact)>0){
            return Vo.ok();
        }
        return  Vo.error();
    }
}
