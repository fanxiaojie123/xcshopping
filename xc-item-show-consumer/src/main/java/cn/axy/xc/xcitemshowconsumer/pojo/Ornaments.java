package cn.axy.xc.xcitemshowconsumer.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Ornaments",description = "首饰SKU实体类")
public class Ornaments {
    @ApiModelProperty(value = "首饰SKUID",dataType = "String")
    private Integer id;
    @ApiModelProperty(value = "商品ID",dataType = "String")
    private Integer mId;
    @ApiModelProperty(value = "首饰SKU大小",dataType = "String")
    private String oSize;
    @ApiModelProperty(value = "首饰SKU颜色",dataType = "String")
    private String oColor;
    @ApiModelProperty(value = "首饰SKU库存",dataType = "String")
    private Double oCount;
    @ApiModelProperty(value = "首饰SKU单价",dataType = "String")
    private Double oPrice;
    @ApiModelProperty(value = "首饰SKU冗余",dataType = "String")
    private String oX;
    @ApiModelProperty(value = "首饰SKU冗余",dataType = "String")
    private String oX1;
    @ApiModelProperty(value = "首饰SKU冗余",dataType = "String")
    private String oX2;
    @ApiModelProperty(value = "商品价格",dataType = "String")
    private Double mPrice;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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