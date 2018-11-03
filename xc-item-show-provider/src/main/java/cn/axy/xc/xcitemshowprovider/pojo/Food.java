package cn.axy.xc.xcitemshowprovider.pojo;

public class Food {
    private String fId;

    private Double fSize;

    private String fColor;

    private String fCount;

    private Double fPrice;

    private String mId;

    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId == null ? null : fId.trim();
    }

    public Double getfSize() {
        return fSize;
    }

    public void setfSize(Double fSize) {
        this.fSize = fSize;
    }

    public String getfColor() {
        return fColor;
    }

    public void setfColor(String fColor) {
        this.fColor = fColor == null ? null : fColor.trim();
    }

    public String getfCount() {
        return fCount;
    }

    public void setfCount(String fCount) {
        this.fCount = fCount == null ? null : fCount.trim();
    }

    public Double getfPrice() {
        return fPrice;
    }

    public void setfPrice(Double fPrice) {
        this.fPrice = fPrice;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId == null ? null : mId.trim();
    }
}