package com.feri.pojo;

public class Contact {
    private Integer id;

    private String alternatephone;

    private String email;

    private String qq;

    private String weixin;

    private String nowaddress;

    private Integer uid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAlternatephone() {
        return alternatephone;
    }

    public void setAlternatephone(String alternatephone) {
        this.alternatephone = alternatephone == null ? null : alternatephone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin == null ? null : weixin.trim();
    }

    public String getNowaddress() {
        return nowaddress;
    }

    public void setNowaddress(String nowaddress) {
        this.nowaddress = nowaddress == null ? null : nowaddress.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}