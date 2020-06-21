package com.example.demo.entity;

public class User {

    private Integer ID;//主键id

    private String sAccountNO;//账户号

    private String sPassword;//密码

    private String sName;//用户名

    private Integer nStatusID;//用户状态；0：无效，1：有效

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

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", sAccountNO='" + sAccountNO + '\'' +
                ", sPassword='" + sPassword + '\'' +
                ", sName='" + sName + '\'' +
                ", nStatusID=" + nStatusID +
                '}';
    }
}
