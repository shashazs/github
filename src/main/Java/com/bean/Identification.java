package com.bean;

/**
 * @author 石莎莎
 * @create 2019-10-21 14:19
 */
//认证表
public class Identification {
    private Integer iid;//编号
    private String card;//身份证号
    private String iimage;//身份证正反面
    private Integer status;//在此平台的认证状态
    private Integer iperson;//所属人

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getIimage() {
        return iimage;
    }

    public void setIimage(String iimage) {
        this.iimage = iimage;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIperson() {
        return iperson;
    }

    public void setIperson(Integer iperson) {
        this.iperson = iperson;
    }

    public Identification() {
    }

    public Identification(Integer iid, String card, String iimage, Integer status, Integer iperson) {
        this.iid = iid;
        this.card = card;
        this.iimage = iimage;
        this.status = status;
        this.iperson = iperson;
    }

    @Override
    public String toString() {
        return "Identification{" +
                "iid=" + iid +
                ", card='" + card + '\'' +
                ", iimage='" + iimage + '\'' +
                ", status=" + status +
                ", iperson=" + iperson +
                '}';
    }
}
