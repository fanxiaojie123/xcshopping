package cn.axy.xc.xcitemshowprovider.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Ornaments",description = "首饰SKU实体类")
public class Ornaments {
    @ApiModelProperty(value = "首饰SKUID",dataType = "Long")
    private Long id;
    @ApiModelProperty(value = "商品ID",dataType = "Integer")
    private Integer mId;
    @ApiModelProperty(value = "首饰SKU大小",dataType = "String")
    private String oSize;
    @ApiModelProperty(value = "首饰SKU颜色",dataType = "String")
    private String oColor;
    @ApiModelProperty(value = "首饰SKU库存",dataType = "Double")
    private Double oCount;
    @ApiModelProperty(value = "首饰SKU单价",dataType = "Double")
    private Double oPrice;
    @ApiModelProperty(value = "首饰SKU冗余",dataType = "String")
    private String oX;
    @ApiModelProperty(value = "首饰SKU冗余",dataType = "String")
    private String oX1;
    @ApiModelProperty(value = "首饰SKU冗余",dataType = "String")
    private String oX2;
    @ApiModelProperty(value = "商品价格",dataType = "Double")
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

    private Double mCount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getoSize() {
        return oSize;
    }

    public void setoSize(String oSize) {
        this.oSize = oSize;
    }

    public String getoColor() {
        return oColor;
    }

    public void setoColor(String oColor) {
        this.oColor = oColor;
    }

    public Double getoCount() {
        return oCount;
    }

    public void setoCount(Double oCount) {
        this.oCount = oCount;
    }

    public Double getoPrice() {
        return oPrice;
    }

    public void setoPrice(Double oPrice) {
        this.oPrice = oPrice;
    }

    public String getoX() {
        return oX;
    }

    public void setoX(String oX) {
        this.oX = oX;
    }

    public String getoX1() {
        return oX1;
    }

    public void setoX1(String oX1) {
        this.oX1 = oX1;
    }

    public String getoX2() {
        return oX2;
    }

    public void setoX2(String oX2) {
        this.oX2 = oX2;
    }
}