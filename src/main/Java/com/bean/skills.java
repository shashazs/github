package com.xdkj.bean;

/**
 * @author ShangGuan
 * @create 2019-10-21 10:49
 */

//个人技能
public class skills {

    private Integer sid;//技能编号
    private String sevaluate;//经验自评
    private Integer sperson;//所属人

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSevaluate() {
        return sevaluate;
    }

    public void setSevaluate(String sevaluate) {
        this.sevaluate = sevaluate;
    }

    public Integer getSperson() {
        return sperson;
    }

    public void setSperson(Integer sperson) {
        this.sperson = sperson;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "skills{" +
                "sid=" + sid +
                ", sevaluate='" + sevaluate + '\'' +
                ", sperson=" + sperson +
                '}';
    }

    public skills() {
    }

    public skills(Integer sid, String sevaluate, Integer sperson) {
        this.sid = sid;
        this.sevaluate = sevaluate;
        this.sperson = sperson;
    }
}
