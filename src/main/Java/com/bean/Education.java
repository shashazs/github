package com.bean;

import org.springframework.format.annotation.DateTimeFormat;

import javax.xml.crypto.Data;

/**
 * @author 石莎莎
 * @create 2019-10-21 14:09
 */
//教育经历
public class Education {
    private Integer eid;//编号

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Data start;//开始时间
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Data end;//结束时间

    private String sname;//学校名
    private String profession;//专业
    private String level;//学历

    private Integer eperson;//所属人

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Data getStart() {
        return start;
    }

    public void setStart(Data start) {
        this.start = start;
    }

    public Data getEnd() {
        return end;
    }

    public void setEnd(Data end) {
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

    public Education() {
    }

    public Education(Integer eid, Data start, Data end, String sname, String profession, String level, Integer eperson) {
        this.eid = eid;
        this.start = start;
        this.end = end;
        this.sname = sname;
        this.profession = profession;
        this.level = level;
        this.eperson = eperson;
    }

    @Override
    public String toString() {
        return "Education{" +
                "eid=" + eid +
                ", start=" + start +
                ", end=" + end +
                ", sname='" + sname + '\'' +
                ", profession='" + profession + '\'' +
                ", level='" + level + '\'' +
                ", eperson=" + eperson +
                '}';
    }
}