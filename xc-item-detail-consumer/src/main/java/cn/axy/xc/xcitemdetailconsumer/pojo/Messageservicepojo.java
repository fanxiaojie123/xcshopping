package cn.axy.xc.xcitemdetailconsumer.pojo;

public class Messageservicepojo {
    private String mName;
    private String mPicture;
    private String mParticulars;
    private String mPoints;
    private Integer seller;
    private String searchCategoryId;
    private String searchCategoryParentId;
    private Double mPrice;
    private Double mCount;

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

    public Integer getSeller() {
        return seller;
    }

    public void setSeller(Integer seller) {
        this.seller = seller;
    }

    public String getSearchCategoryId() {
        return searchCategoryId;
    }

    public void setSearchCategoryId(String searchCategoryId) {
        this.searchCategoryId = searchCategoryId;
    }

    public String getSearchCategoryParentId() {
        return searchCategoryParentId;
    }

    public void setSearchCategoryParentId(String searchCategoryParentId) {
        this.searchCategoryParentId = searchCategoryParentId;
    }
}