package cn.axy.xc.xcitemdetailconsumer.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Cosmetics",description = "化妆品的SKU表")
public class Cosmetics {
    @ApiModelProperty(value = "化妆品SKUID",dataType = "Integer")
    private Integer coId;
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

    public Integer getCoId() {
        return coId;
    }

    public void setCoId(Integer coId) {
        this.coId = coId;
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