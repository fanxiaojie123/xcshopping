package cn.axy.xc.xcitemshowprovider.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Cosmetics",description = "化妆品的SKU表")
public class Cosmetics {
    @ApiModelProperty(value = "化妆品SKUID",dataType = "Long")
    private Long id;
    @ApiModelProperty(value = "化妆品SKU容量",dataType = "String")
    private String coSize;
    @ApiModelProperty(value = "化妆品SKU颜色",dataType = "String")
    private String coColor;
    @ApiModelProperty(value = "化妆品SKU库存",dataType = "Double")
    private Double coCount;
    @ApiModelProperty(value = "化妆品SKU单价",dataType = "Double")
    private Double coPrice;
    @ApiModelProperty(value = "商品SKUID",dataType = "Integer")
    private Integer mId;
    @ApiModelProperty(value = "冗余",dataType = "String")
    private String coX;
    @ApiModelProperty(value = "冗余",dataType = "String")
    private String coX1;
    @ApiModelProperty(value = "冗余",dataType = "String")
    private String coX2;
    @ApiModelProperty(value = "商品SKU价格",dataType = "Double")
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
    @ApiModelProperty(value = "商品SKU总库存",dataType = "Double")
    private Double mCount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCoSize() {
        return coSize;
    }

    public void setCoSize(String coSize) {
        this.coSize = coSize;
    }

    public String getCoColor() {
        return coColor;
    }

    public void setCoColor(String coColor) {
        this.coColor = coColor;
    }

    public Double getCoCount() {
        return coCount;
    }

    public void setCoCount(Double coCount) {
        this.coCount = coCount;
    }

    public Double getCoPrice() {
        return coPrice;
    }

    public void setCoPrice(Double coPrice) {
        this.coPrice = coPrice;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getCoX() {
        return coX;
    }

    public void setCoX(String coX) {
        this.coX = coX;
    }

    public String getCoX1() {
        return coX1;
    }

    public void setCoX1(String coX1) {
        this.coX1 = coX1;
    }

    public String getCoX2() {
        return coX2;
    }

    public void setCoX2(String coX2) {
        this.coX2 = coX2;
    }
}