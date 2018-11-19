package cn.axy.xc.xcitemdetailprovider.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Clothing",description = "服装的SKU表")
public class Clothing {
    @ApiModelProperty(value = "服装SKUID",dataType = "Integer")
    private Integer cId;
    @ApiModelProperty(value = "服装SKU库存",dataType = "Double")
    private Double cCount;
    @ApiModelProperty(value = "服装SKU单价",dataType = "Double")
    private Double cPrice;
    @ApiModelProperty(value = "服装SKU大小",dataType = "String")
    private String cSize;
    @ApiModelProperty(value = "服装SKU颜色",dataType = "String")
    private String cColor;
    @ApiModelProperty(value = "商品SKUID",dataType = "Integer")
    private Integer mId;
    @ApiModelProperty(value = "冗余",dataType = "String")
    private String cX;
    @ApiModelProperty(value = "冗余",dataType = "String")
    private String cX1;
    @ApiModelProperty(value = "冗余",dataType = "String")
    private String cX2;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Double getcCount() {
        return cCount;
    }

    public void setcCount(Double cCount) {
        this.cCount = cCount;
    }

    public Double getcPrice() {
        return cPrice;
    }

    public void setcPrice(Double cPrice) {
        this.cPrice = cPrice;
    }

    public String getcSize() {
        return cSize;
    }

    public void setcSize(String cSize) {
        this.cSize = cSize;
    }

    public String getcColor() {
        return cColor;
    }

    public void setcColor(String cColor) {
        this.cColor = cColor;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getcX() {
        return cX;
    }

    public void setcX(String cX) {
        this.cX = cX;
    }

    public String getcX1() {
        return cX1;
    }

    public void setcX1(String cX1) {
        this.cX1 = cX1;
    }

    public String getcX2() {
        return cX2;
    }

    public void setcX2(String cX2) {
        this.cX2 = cX2;
    }
}