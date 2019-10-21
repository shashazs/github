package com.xdkj.bean;

import java.util.Date;

/**
 * @author ShangGuan
 * @create 2019-10-21 10:48
 */
//教育经历类
public class education {
    private Integer eid;//教育经历编号
    private Date start;//开始时间
    private Date end;//结束时间
    private String sname;//学校名称
    private String profession;//专业
    private String level;//学历
    private Integer eperson;//所属人

    public education(Integer eid, Date start, Date end, String sname, String profession, String level, Integer eperson) {
        this.eid = eid;
        this.start = start;
        this.end = end;
        this.sname = sname;
        this.profession = profession;
        this.level = level;
        this.eperson = eperson;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "education{" +
                "eid=" + eid +
                ", start=" + start +
                ", end=" + end +
                ", sname='" + sname + '\'' +
                ", profession='" + profession + '\'' +
                ", level='" + level + '\'' +
                ", eperson=" + eperson +
                '}';
    }

    public education() {
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getEperson() {
        return eperson;
    }

    public void setEperson(Integer eperson) {
        this.eperson = eperson;
    }
}
