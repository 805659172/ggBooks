package com.example.demo.entity;

public class User {
    private Integer ID;
    private String sAccountNO;
    private String sPassword;
    private String sName;
    private Integer nStatusID;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getsPassword() {
        return sPassword;
    }

    public void setsPassword(String sPassword) {
        this.sPassword = sPassword;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Integer getnStatusID() {
        return nStatusID;
    }

    public void setnStatusID(Integer nStatusID) {
        this.nStatusID = nStatusID;
    }

    public String getsAccountNO() {
        return sAccountNO;
    }

    public void setsAccountNO(String sAccountNO) {
        this.sAccountNO = sAccountNO;
    }
}
