package cn.axy.xc.xcitemshowprovider.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Appliances",description = "家电的SKU表")
public class Appliances {
    @ApiModelProperty(value = "家电SKUID",dataType = "Long")
    private Long id;
    @ApiModelProperty(value = "家电SKU型号",dataType = "String")
    private String aSize;
    @ApiModelProperty(value = "家电SKU颜色",dataType = "String")
    private String aColor;
    @ApiModelProperty(value = "家电SKU价格",dataType = "Double")
    private Double aPrice;
    @ApiModelProperty(value = "家电SKU数量",dataType = "Double")
    private Double aCount;
    @ApiModelProperty(value = "商品ID",dataType = "Integer")
    private Integer mId;
    @ApiModelProperty(value = "商品价格ID",dataType = "Double")
    private Double mPrice;
    @ApiModelProperty(value = "商品图片",dataType = "Integer")
    private String mPicture;
    @ApiModelProperty(value = "商品详情",dataType = "Double")
    private String mPoints;

    public String getmPicture() {
        return mPicture;
    }

    public void setmPicture(String mPicture) {
        this.mPicture = mPicture;
    }

    public String getmPoints() {
        return mPoints;
    }

    public void setmPoints(String mPoints) {
        this.mPoints = mPoints;
    }

    public Double getmPrice() {
        return mPrice;
    }

    public void setmPrice(Double mPrice) {
        this.mPrice = mPrice;
    }

    public Double getmCount() {
        return mCount;
    }

    public void setmCount(Double mCount) {
        this.mCount = mCount;
    }
    @ApiModelProperty(value = "商品总库存ID",dataType = "Double")
    private Double mCount;

    private String aX2;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getaSize() {
        return aSize;
    }

    public void setaSize(String aSize) {
        this.aSize = aSize;
    }

    public String getaColor() {
        return aColor;
    }

    public void setaColor(String aColor) {
        this.aColor = aColor;
    }

    public Double getaPrice() {
        return aPrice;
    }

    public void setaPrice(Double aPrice) {
        this.aPrice = aPrice;
    }

    public Double getaCount() {
        return aCount;
    }

    public void setaCount(Double aCount) {
        this.aCount = aCount;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getaX2() {
        return aX2;
    }

    public void setaX2(String aX2) {
        this.aX2 = aX2;
    }

}