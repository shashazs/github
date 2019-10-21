package com.xdkj.bean;

/**
 * @author ShangGuan
 * @create 2019-10-21 10:49
 */

// 个人履历
public class resume {

    private Integer rid;//履历编号
    private String workstatus;//工作状态
    private String workdirection;//职业方向
    private String specificwork;//具体工作
    private skills skill;//技能
    private works works;//个人作品
    private String rintroduce;//个人介绍
    private Integer rperson;//所属人

    @java.lang.Override
    public java.lang.String toString() {
        return "resume{" +
                "rid=" + rid +
                ", workstatus='" + workstatus + '\'' +
                ", workdirection='" + workdirection + '\'' +
                ", specificwork='" + specificwork + '\'' +
                ", skill=" + skill +
                ", works=" + works +
                ", rintroduce='" + rintroduce + '\'' +
                ", rperson=" + rperson +
                '}';
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getWorkstatus() {
        return workstatus;
    }

    public void setWorkstatus(String workstatus) {
        this.workstatus = workstatus;
    }

    public String getWorkdirection() {
        return workdirection;
    }

    public void setWorkdirection(String workdirection) {
        this.workdirection = workdirection;
    }

    public String getSpecificwork() {
        return specificwork;
    }

    public void setSpecificwork(String specificwork) {
        this.specificwork = specificwork;
    }

    public skills getSkill() {
        return skill;
    }

    public void setSkill(skills skill) {
        this.skill = skill;
    }

    public works getWorks() {
        return works;
    }

    public void setWorks(works works) {
        this.works = works;
    }

    public String getRintroduce() {
        return rintroduce;
    }

    public void setRintroduce(String rintroduce) {
        this.rintroduce = rintroduce;
    }

    public Integer getRperson() {
        return rperson;
    }

    public void setRperson(Integer rperson) {
        this.rperson = rperson;
    }

    public resume(Integer rid, String workstatus, String workdirection, String specificwork, skills skill, works works, String rintroduce, Integer rperson) {
        this.rid = rid;
        this.workstatus = workstatus;
        this.workdirection = workdirection;
        this.specificwork = specificwork;
        this.skill = skill;
        this.works = works;
        this.rintroduce = rintroduce;
        this.rperson = rperson;
    }

    public resume() {
    }
}
