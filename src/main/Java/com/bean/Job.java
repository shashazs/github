package com.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author Devil
 * @create 2019-10-21-14:47
 */
public class Job {
    private Integer jid;//工作信息编号
    @DateTimeFormat(pattern="yyyy-mm-dd")
    private Date time;//工作日时间
    @DateTimeFormat(pattern="yyyy-mm-dd")
    private Date untime;//非工作日时间
    private String address;//可工作地址
    private Integer hours;//周工作时长
    private Double daysal;//日薪
    private String pattern;//工作形式
    private Integer jperson;//所属人

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

    public Double getDaysal() {
        return daysal;
    }

    public void setDaysal(Double daysal) {
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

    public Job() {
    }

    public Job(Integer jid, Date time, Date untime, String address, Integer hours, Double daysal, String pattern, Integer jperson) {
        this.jid = jid;
        this.time = time;
        this.untime = untime;
        this.address = address;
        this.hours = hours;
        this.daysal = daysal;
        this.pattern = pattern;
        this.jperson = jperson;
    }

    @Override
    public String toString() {
        return "Job{" +
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
}
