package cn.axy.xc.xcitemdetailconsumer.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Appliances",description = "家电的SKU表")
public class Appliances {
    @ApiModelProperty(value = "家电SKUID",dataType = "Integer")
    private Integer aId;
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
    @ApiModelProperty(value = "冗余",dataType = "String")
    private String aX;
    @ApiModelProperty(value = "冗余",dataType = "String")
    private String aX1;
    @ApiModelProperty(value = "冗余",dataType = "String")
    private String aX2;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
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

    public String getaX() {
        return aX;
    }

    public void setaX(String aX) {
        this.aX = aX;
    }

    public String getaX1() {
        return aX1;
    }

    public void setaX1(String aX1) {
        this.aX1 = aX1;
    }

    public String getaX2() {
        return aX2;
    }

    public void setaX2(String aX2) {
        this.aX2 = aX2;
    }
}