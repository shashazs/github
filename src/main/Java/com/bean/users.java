package com.xdkj.bean;

/**
 * @author ShangGuan
 * @create 2019-10-21 10:21
 */

//用户
public class users {

    private Integer uid;//用户编号
    private String uname;//名称
    private String email;//邮箱
    private String password;//密码
    private String role;//用户类型

    public users(Integer uid, String uname, String email, String password, String role) {
        this.uid = uid;
        this.uname = uname;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public users() {
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "users{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}
