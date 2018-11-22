package cn.axy.xc.xcitemdetailconsumer.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Appliances",description = "SKU添加")
public class Skuserviceimp {
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
    @ApiModelProperty(value = "服装SKU库存",dataType = "Double")
    private Double cCount;
    @ApiModelProperty(value = "服装SKU单价",dataType = "Double")
    private Double cPrice;
    @ApiModelProperty(value = "服装SKU大小",dataType = "String")
    private String cSize;
    @ApiModelProperty(value = "服装SKU颜色",dataType = "String")
    private String cColor;
    @ApiModelProperty(value = "化妆品SKU容量",dataType = "String")
    private String coSize;
    @ApiModelProperty(value = "化妆品SKU颜色",dataType = "String")
    private String coColor;
    @ApiModelProperty(value = "化妆品SKU库存",dataType = "Double")
    private Double coCount;
    @ApiModelProperty(value = "化妆品SKU单价",dataType = "Double")
    private Double coPrice;
    @ApiModelProperty(value = "食品SKU大小",dataType = "String")
    private String fSize;
    @ApiModelProperty(value = "食品SKU颜色",dataType = "String")
    private String fColor;
    @ApiModelProperty(value = "食品SKU库存",dataType = "Double")
    private Double fCount;
    @ApiModelProperty(value = "食品SKU价格",dataType = "Double")
    private Double fPrice;
    @ApiModelProperty(value = "首饰SKU大小",dataType = "String")
    private String oSize;
    @ApiModelProperty(value = "首饰SKU颜色",dataType = "String")
    private String oColor;
    @ApiModelProperty(value = "首饰SKU库存",dataType = "String")
    private Double oCount;
    @ApiModelProperty(value = "首饰SKU单价",dataType = "String")
    private Double oPrice;

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
}
