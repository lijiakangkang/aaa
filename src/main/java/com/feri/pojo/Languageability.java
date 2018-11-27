package com.feri.pojo;

public class Languageability {
    private Integer id;

    private Integer uid;

    private String languages;

    private Integer ability;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages == null ? null : languages.trim();
    }

    public Integer getAbility() {
        return ability;
    }

    public void setAbility(Integer ability) {
        this.ability = ability;
    }
}