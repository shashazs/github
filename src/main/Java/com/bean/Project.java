package com.xd.bean;

/**
 * @author Devil
 * @create 2019-10-21-14:53
 */
public class Project {
    private Integer pid;//项目编号
    private String pname;//项目名称
    private Double budget;//项目预算
    private String pintroduce;//项目介绍
    private String file;//项目文档
    private Integer publisher;//项目发布者

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

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
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

    public Project() {
    }

    public Project(Integer pid, String pname, Double budget, String pintroduce, String file, Integer publisher) {
        this.pid = pid;
        this.pname = pname;
        this.budget = budget;
        this.pintroduce = pintroduce;
        this.file = file;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "project{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", budget=" + budget +
                ", pintroduce='" + pintroduce + '\'' +
                ", file='" + file + '\'' +
                ", publisher=" + publisher +
                '}';
    }
}
