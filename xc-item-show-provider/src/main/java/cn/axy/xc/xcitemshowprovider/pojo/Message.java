package cn.axy.xc.xcitemshowprovider.pojo;

public class Message {
    private String mId;

    private String mName;

    private String mPicture;

    private String mParticulars;

    private Integer mStatus;

    private String mPoints;

    private String mCreated;

    private String mUpdated;

    private String sId;

    private String mBrand;

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId == null ? null : mId.trim();
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    public String getmPicture() {
        return mPicture;
    }

    public void setmPicture(String mPicture) {
        this.mPicture = mPicture == null ? null : mPicture.trim();
    }

    public String getmParticulars() {
        return mParticulars;
    }

    public void setmParticulars(String mParticulars) {
        this.mParticulars = mParticulars == null ? null : mParticulars.trim();
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
        this.mPoints = mPoints == null ? null : mPoints.trim();
    }

    public String getmCreated() {
        return mCreated;
    }

    public void setmCreated(String mCreated) {
        this.mCreated = mCreated == null ? null : mCreated.trim();
    }

    public String getmUpdated() {
        return mUpdated;
    }

    public void setmUpdated(String mUpdated) {
        this.mUpdated = mUpdated == null ? null : mUpdated.trim();
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId == null ? null : sId.trim();
    }

    public String getmBrand() {
        return mBrand;
    }

    public void setmBrand(String mBrand) {
        this.mBrand = mBrand == null ? null : mBrand.trim();
    }
}