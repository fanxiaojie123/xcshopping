package cn.axy.xc.xcitemshowprovider.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Message",description = "商品详情表")
public class Message {
    @ApiModelProperty(value = "商品ID",dataType = "Integer")
    private Integer mId;
    @ApiModelProperty(value = "商品名字",dataType = "String")
    private String mName;
    @ApiModelProperty(value = "商品图片",dataType = "String")
    private String mPicture;
    @ApiModelProperty(value = "商品参数",dataType = "String")
    private String mParticulars;
    @ApiModelProperty(value = "商品状态",dataType = "Integer")
    private Integer mStatus;
    @ApiModelProperty(value = "商品买点",dataType = "String")
    private String mPoints;
    @ApiModelProperty(value = "商品创建时间",dataType = "String")
    private String mCreated;
    @ApiModelProperty(value = "商品更新时间",dataType = "String")
    private String mUpdated;
    @ApiModelProperty(value = "商家ID",dataType = "Integer")
    private Integer sId;
    @ApiModelProperty(value = "商品类型ID",dataType = "Integer")
    private Integer searchCategoryId;
    @ApiModelProperty(value = "商品大类型ID",dataType = "Integer")
    private Integer searchCategoryParentId;
    @ApiModelProperty(value = "商品价格",dataType = "Double")
    private Double mPrice;
    @ApiModelProperty(value = "商品总库存",dataType = "Double")
    private Double mCount;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
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

    public Integer getmStatus() {
        return mStatus;
    }

    public void setmStatus(Integer mStatus) {
        this.mStatus = mStatus;
    }

    public String getmPoints() {
        return mPoints;
    }

    public void setmPoints(String mPoints) {
        this.mPoints = mPoints;
    }

    public String getmCreated() {
        return mCreated;
    }

    public void setmCreated(String mCreated) {
        this.mCreated = mCreated;
    }

    public String getmUpdated() {
        return mUpdated;
    }

    public void setmUpdated(String mUpdated) {
        this.mUpdated = mUpdated;
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Integer getSearchCategoryId() {
        return searchCategoryId;
    }

    public void setSearchCategoryId(Integer searchCategoryId) {
        this.searchCategoryId = searchCategoryId;
    }

    public Integer getSearchCategoryParentId() {
        return searchCategoryParentId;
    }

    public void setSearchCategoryParentId(Integer searchCategoryParentId) {
        this.searchCategoryParentId = searchCategoryParentId;
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
}