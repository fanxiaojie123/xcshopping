package cn.axy.xc.xcitemshowprovider.service.exit;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value = "SKUALL",description = "所有的SKU")
public class Skuservicepojo {
    @ApiModelProperty(value = "家电SKUID",dataType = "Long")
    private Long aid;
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
    @ApiModelProperty(value = "商品总库存ID",dataType = "Double")
    private Double mCount;
    @ApiModelProperty(value = "服装SKUID",dataType = "Long")
    private Long cid;
    @ApiModelProperty(value = "服装SKU库存",dataType = "Double")
    private Double cCount;
    @ApiModelProperty(value = "服装SKU单价",dataType = "Double")
    private Double cPrice;
    @ApiModelProperty(value = "服装SKU大小",dataType = "String")
    private String cSize;
    @ApiModelProperty(value = "服装SKU颜色",dataType = "String")
    private String cColor;
    @ApiModelProperty(value = "化妆品SKUID",dataType = "Long")
    private Long coid;
    @ApiModelProperty(value = "化妆品SKU容量",dataType = "String")
    private String coSize;
    @ApiModelProperty(value = "化妆品SKU颜色",dataType = "String")
    private String coColor;
    @ApiModelProperty(value = "化妆品SKU库存",dataType = "Double")
    private Double coCount;
    @ApiModelProperty(value = "化妆品SKU单价",dataType = "Double")
    private Double coPrice;
    @ApiModelProperty(value = "食品SKUID",dataType = "Long")
    private Long fid;
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
    @ApiModelProperty(value = "首饰SKU库存",dataType = "Double")
    private Double oCount;
    @ApiModelProperty(value = "首饰SKU单价",dataType = "Double")
    private Double oPrice;
    @ApiModelProperty(value = "首饰SKUID",dataType = "Long")
    private Long oid;

    public Long getAid() {
        return aid;
    }

    public void setAid(Long aid) {
        this.aid = aid;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getCoid() {
        return coid;
    }

    public void setCoid(Long coid) {
        this.coid = coid;
    }

    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
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

    public Double getmPrice() {
        return mPrice;
    }

    public void setmPrice(Double mPrice) {
        this.mPrice = mPrice;
    }

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

    public Double getmCount() {
        return mCount;
    }

    public void setmCount(Double mCount) {
        this.mCount = mCount;
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
