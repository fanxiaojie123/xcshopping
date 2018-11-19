package cn.axy.xc.xcitemdetailconsumer.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Food",description = "食品的SKU表")
public class Food {
    @ApiModelProperty(value = "食品SKUID",dataType = "Integer")
    private Integer fId;
    @ApiModelProperty(value = "食品SKU大小",dataType = "String")
    private String fSize;
    @ApiModelProperty(value = "食品SKU颜色",dataType = "String")
    private String fColor;
    @ApiModelProperty(value = "食品SKU库存",dataType = "Double")
    private Double fCount;
    @ApiModelProperty(value = "食品SKU价格",dataType = "Double")
    private Double fPrice;
    @ApiModelProperty(value = "商品ID",dataType = "Integer")
    private Integer mId;
    @ApiModelProperty(value = "冗余",dataType = "String")
    private String fX;
    @ApiModelProperty(value = "冗余",dataType = "String")
    private String fX1;
    @ApiModelProperty(value = "冗余",dataType = "String")
    private String fX2;

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public String getfSize() {
        return fSize;
    }

    public void setfSize(String fSize) {
        this.fSize = fSize;
    }

    public String getfColor() {
        return fColor;
    }

    public void setfColor(String fColor) {
        this.fColor = fColor;
    }

    public Double getfCount() {
        return fCount;
    }

    public void setfCount(Double fCount) {
        this.fCount = fCount;
    }

    public Double getfPrice() {
        return fPrice;
    }

    public void setfPrice(Double fPrice) {
        this.fPrice = fPrice;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getfX() {
        return fX;
    }

    public void setfX(String fX) {
        this.fX = fX;
    }

    public String getfX1() {
        return fX1;
    }

    public void setfX1(String fX1) {
        this.fX1 = fX1;
    }

    public String getfX2() {
        return fX2;
    }

    public void setfX2(String fX2) {
        this.fX2 = fX2;
    }
}