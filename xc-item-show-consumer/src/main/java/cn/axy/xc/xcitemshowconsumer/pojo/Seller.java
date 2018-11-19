package cn.axy.xc.xcitemshowconsumer.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Seller",description = "商家实体类")
public class Seller {
    @ApiModelProperty(value = "商家ID",dataType = "Integer")
    private Integer sId;
    @ApiModelProperty(value = "商家密码",dataType = "String")
    private String sPwd;
    @ApiModelProperty(value = "商家名称",dataType = "String")
    private String sName;
    @ApiModelProperty(value = "商家性别",dataType = "Integer")
    private Integer sSex;
    @ApiModelProperty(value = "商家地址",dataType = "String")
    private String sAddress;
    @ApiModelProperty(value = "商家图片",dataType = "String")
    private String sPhone;
    @ApiModelProperty(value = "商家描述",dataType = "String")
    private String sDescribe;
    @ApiModelProperty(value = "商家图片",dataType = "String")
    private String sPicture;
    @ApiModelProperty(value = "冗余",dataType = "String")
    private String sX;
    @ApiModelProperty(value = "冗余",dataType = "String")
    private String sX1;
    @ApiModelProperty(value = "冗余",dataType = "String")
    private String sX2;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsPwd() {
        return sPwd;
    }

    public void setsPwd(String sPwd) {
        this.sPwd = sPwd;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Integer getsSex() {
        return sSex;
    }

    public void setsSex(Integer sSex) {
        this.sSex = sSex;
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone;
    }

    public String getsDescribe() {
        return sDescribe;
    }

    public void setsDescribe(String sDescribe) {
        this.sDescribe = sDescribe;
    }

    public String getsPicture() {
        return sPicture;
    }

    public void setsPicture(String sPicture) {
        this.sPicture = sPicture;
    }

    public String getsX() {
        return sX;
    }

    public void setsX(String sX) {
        this.sX = sX;
    }

    public String getsX1() {
        return sX1;
    }

    public void setsX1(String sX1) {
        this.sX1 = sX1;
    }

    public String getsX2() {
        return sX2;
    }

    public void setsX2(String sX2) {
        this.sX2 = sX2;
    }
}