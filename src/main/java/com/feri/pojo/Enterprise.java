package com.feri.pojo;

public class Enterprise {

    private Integer id;

    private String username;

    private String password;

    private String companyname;

    private String contact;

    private String contactphone;

    private Integer belongtoindustry;

    private Integer companytype;

    private String setupdate;

    private Integer companypeoplenumber;

    private String registermany;

    private String fax;

    private String qqemail;

    private Integer emailremind;

    private String companyip;

    private String companyaddress;

    private String companyprofile;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getContactphone() {
        return contactphone;
    }

    public void setContactphone(String contactphone) {
        this.contactphone = contactphone == null ? null : contactphone.trim();
    }

    public Integer getBelongtoindustry() {
        return belongtoindustry;
    }

    public void setBelongtoindustry(Integer belongtoindustry) {
        this.belongtoindustry = belongtoindustry;
    }

    public Integer getCompanytype() {
        return companytype;
    }

    public void setCompanytype(Integer companytype) {
        this.companytype = companytype;
    }

    public String getSetupdate() {
        return setupdate;
    }

    public void setSetupdate(String setupdate) {
        this.setupdate = setupdate == null ? null : setupdate.trim();
    }

    public Integer getCompanypeoplenumber() {
        return companypeoplenumber;
    }

    public void setCompanypeoplenumber(Integer companypeoplenumber) {
        this.companypeoplenumber = companypeoplenumber;
    }

    public String getRegistermany() {
        return registermany;
    }

    public void setRegistermany(String registermany) {
        this.registermany = registermany == null ? null : registermany.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getQqemail() {
        return qqemail;
    }

    public void setQqemail(String qqemail) {
        this.qqemail = qqemail == null ? null : qqemail.trim();
    }

    public Integer getEmailremind() {
        return emailremind;
    }

    public void setEmailremind(Integer emailremind) {
        this.emailremind = emailremind;
    }

    public String getCompanyip() {
        return companyip;
    }

    public void setCompanyip(String companyip) {
        this.companyip = companyip == null ? null : companyip.trim();
    }

    public String getCompanyaddress() {
        return companyaddress;
    }

    public void setCompanyaddress(String companyaddress) {
        this.companyaddress = companyaddress == null ? null : companyaddress.trim();
    }

    public String getCompanyprofile() {
        return companyprofile;
    }

    public void setCompanyprofile(String companyprofile) {
        this.companyprofile = companyprofile == null ? null : companyprofile.trim();
    }
}
