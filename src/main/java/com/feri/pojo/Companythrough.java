package com.feri.pojo;

public class Companythrough {
    private Integer id;

    private Integer uid;

    private String sarttime;

    private String stoptime;

    private String companyname;

    private String department;

    private Integer worktype;

    private Integer position;

    private Integer salary;

    private Integer companysize;

    private String details;

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

    public String getSarttime() {
        return sarttime;
    }

    public void setSarttime(String sarttime) {
        this.sarttime = sarttime == null ? null : sarttime.trim();
    }

    public String getStoptime() {
        return stoptime;
    }

    public void setStoptime(String stoptime) {
        this.stoptime = stoptime == null ? null : stoptime.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public Integer getWorktype() {
        return worktype;
    }

    public void setWorktype(Integer worktype) {
        this.worktype = worktype;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getCompanysize() {
        return companysize;
    }

    public void setCompanysize(Integer companysize) {
        this.companysize = companysize;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }
}