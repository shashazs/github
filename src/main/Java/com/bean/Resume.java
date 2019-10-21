package com.bean;/*
@author hj
@create 2019-10-21-14:01
*/

public class Resume {
    private Integer rid;
    private String workStatus;
    private String workDirection;
    private String specificWork;
    private Integer skills;
    private Integer works;
    private String introduce;
    private String rPerson;

    public Resume() {
    }

    public Resume(Integer rid, String workStatus, String workDirection, String specificWork, Integer skills, Integer works, String introduce, String rPerson) {
        this.rid = rid;
        this.workStatus = workStatus;
        this.workDirection = workDirection;
        this.specificWork = specificWork;
        this.skills = skills;
        this.works = works;
        this.introduce = introduce;
        this.rPerson = rPerson;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus;
    }

    public String getWorkDirection() {
        return workDirection;
    }

    public void setWorkDirection(String workDirection) {
        this.workDirection = workDirection;
    }

    public String getSpecificWork() {
        return specificWork;
    }

    public void setSpecificWork(String specificWork) {
        this.specificWork = specificWork;
    }

    public Integer getSkills() {
        return skills;
    }

    public void setSkills(Integer skills) {
        this.skills = skills;
    }

    public Integer getWorks() {
        return works;
    }

    public void setWorks(Integer works) {
        this.works = works;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getrPerson() {
        return rPerson;
    }

    public void setrPerson(String rPerson) {
        this.rPerson = rPerson;
    }

    @Override
    public String toString() {
        return "ResumeDao{" +
                "rid=" + rid +
                ", workStatus='" + workStatus + '\'' +
                ", workDirection='" + workDirection + '\'' +
                ", specificWork='" + specificWork + '\'' +
                ", skills=" + skills +
                ", works=" + works +
                ", introduce='" + introduce + '\'' +
                ", rPerson='" + rPerson + '\'' +
                '}';
    }
}
