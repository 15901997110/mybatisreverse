package com.haier.hryauto.po;

import java.util.Date;

public class I {
    private Integer id;

    private Integer serviceid;

    private String iuri;

    private String remark;

    private Short irequestmethod;

    private Short ihttptype;

    private Short iparamtype;

    private Short iresponsetype;

    private String idev;

    private Short istatus;

    private Date updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getServiceid() {
        return serviceid;
    }

    public void setServiceid(Integer serviceid) {
        this.serviceid = serviceid;
    }

    public String getIuri() {
        return iuri;
    }

    public void setIuri(String iuri) {
        this.iuri = iuri == null ? null : iuri.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Short getIrequestmethod() {
        return irequestmethod;
    }

    public void setIrequestmethod(Short irequestmethod) {
        this.irequestmethod = irequestmethod;
    }

    public Short getIhttptype() {
        return ihttptype;
    }

    public void setIhttptype(Short ihttptype) {
        this.ihttptype = ihttptype;
    }

    public Short getIparamtype() {
        return iparamtype;
    }

    public void setIparamtype(Short iparamtype) {
        this.iparamtype = iparamtype;
    }

    public Short getIresponsetype() {
        return iresponsetype;
    }

    public void setIresponsetype(Short iresponsetype) {
        this.iresponsetype = iresponsetype;
    }

    public String getIdev() {
        return idev;
    }

    public void setIdev(String idev) {
        this.idev = idev == null ? null : idev.trim();
    }

    public Short getIstatus() {
        return istatus;
    }

    public void setIstatus(Short istatus) {
        this.istatus = istatus;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}