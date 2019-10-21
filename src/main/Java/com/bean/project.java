package com.xdkj.bean;

/**
 * @author ShangGuan
 * @create 2019-10-21 10:54
 */

//项目需求
public class project {

    private Integer pid;//项目编号
    private String pname;//名称
    private double budget;//预算
    private String pintroduce;//简介
    private String file;//文档
    private Integer publisher;//发布者

    @java.lang.Override
    public java.lang.String toString() {
        return "project{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", budget=" + budget +
                ", pintroduce='" + pintroduce + '\'' +
                ", file='" + file + '\'' +
                ", publisher=" + publisher +
                '}';
    }

    public project(Integer pid, String pname, double budget, String pintroduce, String file, Integer publisher) {
        this.pid = pid;
        this.pname = pname;
        this.budget = budget;
        this.pintroduce = pintroduce;
        this.file = file;
        this.publisher = publisher;
    }

    public project() {
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getPintroduce() {
        return pintroduce;
    }

    public void setPintroduce(String pintroduce) {
        this.pintroduce = pintroduce;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public Integer getPublisher() {
        return publisher;
    }

    public void setPublisher(Integer publisher) {
        this.publisher = publisher;
    }
}
