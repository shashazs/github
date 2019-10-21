package com.xdkj.bean;

/**
 * @author ShangGuan
 * @create 2019-10-21 10:48
 */

//个人作品
public class works {
    private Integer wid;//作品编号
    private String wname;//作品名称
    private String trade;//所属行业
    private String keyword;//关键词
    private String href;//作品链接
    private String duty;//作品职责
    private String wimage;//作品截图
    private Integer wperson;//所属人

    @java.lang.Override
    public java.lang.String toString() {
        return "works{" +
                "wid=" + wid +
                ", wname='" + wname + '\'' +
                ", trade='" + trade + '\'' +
                ", keyword='" + keyword + '\'' +
                ", href='" + href + '\'' +
                ", duty='" + duty + '\'' +
                ", wimage='" + wimage + '\'' +
                ", wperson=" + wperson +
                '}';
    }

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public String getTrade() {
        return trade;
    }

    public void setTrade(String trade) {
        this.trade = trade;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getWimage() {
        return wimage;
    }

    public void setWimage(String wimage) {
        this.wimage = wimage;
    }

    public Integer getWperson() {
        return wperson;
    }

    public void setWperson(Integer wperson) {
        this.wperson = wperson;
    }

    public works(Integer wid, String wname, String trade, String keyword, String href, String duty, String wimage, Integer wperson) {
        this.wid = wid;
        this.wname = wname;
        this.trade = trade;
        this.keyword = keyword;
        this.href = href;
        this.duty = duty;
        this.wimage = wimage;
        this.wperson = wperson;
    }

    public works() {
    }
}
