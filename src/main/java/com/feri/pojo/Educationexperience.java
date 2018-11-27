package com.feri.pojo;

public class Educationexperience {
    private Integer id;

    private String starttime;

    private String stoptime;

    private String schoolname;

    private String professionalname;

    private Integer degree;

    private Integer uid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getStoptime() {
        return stoptime;
    }

    public void setStoptime(String stoptime) {
        this.stoptime = stoptime;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public String getProfessionalname() {
        return professionalname;
    }

    public void setProfessionalname(String professionalname) {
        this.professionalname = professionalname;
    }

    public Integer getDegree() {
        return degree;
    }

    public void setDegree(Integer degree) {
        this.degree = degree;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Educationexperience() {
    }

    public Educationexperience(Integer id, String starttime, String stoptime, String schoolname, String professionalname, Integer degree, Integer uid) {
        this.id = id;
        this.starttime = starttime;
        this.stoptime = stoptime;
        this.schoolname = schoolname;
        this.professionalname = professionalname;
        this.degree = degree;
        this.uid = uid;
    }
}