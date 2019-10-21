package com.bean;/*
@author hj
@create 2019-10-21-14:06
*/

public class Skills {
    private Integer sid;
    private String evaluate;
    private Integer sPerson;


    public Skills() {
    }

    public Skills(Integer sid, String evaluate, Integer sPerson) {
        this.sid = sid;
        this.evaluate = evaluate;
        this.sPerson = sPerson;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate;
    }

    public Integer getsPerson() {
        return sPerson;
    }

    public void setsPerson(Integer sPerson) {
        this.sPerson = sPerson;
    }

    @Override
    public String toString() {
        return "Skills{" +
                "sid=" + sid +
                ", evaluate='" + evaluate + '\'' +
                ", sPerson=" + sPerson +
                '}';
    }
}
