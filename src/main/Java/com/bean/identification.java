package com.xdkj.bean;

/**
 * @author ShangGuan
 * @create 2019-10-21 10:49
 */

//认证类
public class identification {
    private Integer iid;//认证编号
    private String card;//身份证号
    private String iimage;//身份证正反面
    private Integer status;//认证状态
    private Integer iperson;//所属人

    @java.lang.Override
    public java.lang.String toString() {
        return "identification{" +
                "iid=" + iid +
                ", card='" + card + '\'' +
                ", iimage='" + iimage + '\'' +
                ", status=" + status +
                ", iperson=" + iperson +
                '}';
    }

    public identification() {
    }

    public identification(Integer iid, String card, String iimage, Integer status, Integer iperson) {
        this.iid = iid;
        this.card = card;
        this.iimage = iimage;
        this.status = status;
        this.iperson = iperson;
    }

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }
}
