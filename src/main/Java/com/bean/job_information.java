package com.xdkj.bean;

import com.sun.xml.internal.ws.spi.db.DatabindingException;

import java.util.Date;

/**
 * @author ShangGuan
 * @create 2019-10-21 10:49
 */

//工作信息类
public class job_information {
    private Integer jid;//工作信息编号
    private Date time;//工作时间
    private Date untime;//非工作时间
    private String address;//可工作地址
    private Integer hours;//周工作时长
    private double daysal;//日薪
    private String pattern;//工作形势
    private Integer jperson;//所属人

    public job_information() {
    }

    public job_information(Integer jid, Date time, Date untime, String address, Integer hours, double daysal, String pattern, Integer jperson) {
        this.jid = jid;
        this.time = time;
        this.untime = untime;
        this.address = address;
        this.hours = hours;
        this.daysal = daysal;
        this.pattern = pattern;
        this.jperson = jperson;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "job_information{" +
                "jid=" + jid +
                ", time=" + time +
                ", untime=" + untime +
                ", address='" + address + '\'' +
                ", hours=" + hours +
                ", daysal=" + daysal +
                ", pattern='" + pattern + '\'' +
                ", jperson=" + jperson +
                '}';
    }

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getUntime() {
        return untime;
    }

    public void setUntime(Date untime) {
        this.untime = untime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double getDaysal() {
        return daysal;
    }

    public void setDaysal(double daysal) {
        this.daysal = daysal;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public Integer getJperson() {
        return jperson;
    }

    public void setJperson(Integer jperson) {
        this.jperson = jperson;
    }
}
