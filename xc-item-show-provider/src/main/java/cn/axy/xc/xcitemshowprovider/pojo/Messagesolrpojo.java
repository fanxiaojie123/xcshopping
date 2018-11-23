package cn.axy.xc.xcitemshowprovider.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Messagesolrpojo",description = "商品详情实体类")
public class Messagesolrpojo {
    @ApiModelProperty(value = "商品ID",dataType = "String")
    private String id;
    @ApiModelProperty(value = "商品名称",dataType = "String")
    private String mName;
    @ApiModelProperty(value = "商品图片",dataType = "String")
    private String mPicture;
    @ApiModelProperty(value = "商品参数",dataType = "String")
    private String mParticulars;
    @ApiModelProperty(value = "商品买点",dataType = "String")
    private String mPoints;
    @ApiModelProperty(value = "商品价格",dataType = "String")
    private String mPrice;
    @ApiModelProperty(value = "商品总库存",dataType = "String")
    private String mCount;
    @ApiModelProperty(value = "商品商品类别",dataType = "String")
    private String searchCategoryName;
    @ApiModelProperty(value = "商家名称",dataType = "String")
    private String sName;
    @ApiModelProperty(value = "商家地址",dataType = "String")
    private String sAddress;
    @ApiModelProperty(value = "商家图片",dataType = "String")
    private String sPhone;
    @ApiModelProperty(value = "商家详情",dataType = "String")
    private String sDescribe;
    @ApiModelProperty(value = "商家图片",dataType = "String")
    private String sPicture;
    @ApiModelProperty(value = "商品状态",dataType = "Integer")
    private Integer mStatus;

    public Integer getmStatus() {
        return mStatus;
    }

    public void setmStatus(Integer mStatus) {
        this.mStatus = mStatus;
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone;
    }

    public String getsDescribe() {
        return sDescribe;
    }

    public void setsDescribe(String sDescribe) {
        this.sDescribe = sDescribe;
    }

    public String getsPicture() {
        return sPicture;
    }

    public void setsPicture(String sPicture) {
        this.sPicture = sPicture;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmPicture() {
        return mPicture;
    }

    public void setmPicture(String mPicture) {
        this.mPicture = mPicture;
    }

    public String getmParticulars() {
        return mParticulars;
    }

    public void setmParticulars(String mParticulars) {
        this.mParticulars = mParticulars;
    }

    public String getmPoints() {
        return mPoints;
    }

    public void setmPoints(String mPoints) {
        this.mPoints = mPoints;
    }

    public String getmPrice() {
        return mPrice;
    }

    public void setmPrice(String mPrice) {
        this.mPrice = mPrice;
    }

    public String getmCount() {
        return mCount;
    }

    public void setmCount(String mCount) {
        this.mCount = mCount;
    }

    public String getSearchCategoryName() {
        return searchCategoryName;
    }

    public void setSearchCategoryName(String searchCategoryName) {
        this.searchCategoryName = searchCategoryName;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
}
