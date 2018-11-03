package cn.axy.xc.xcitemshowprovider.pojo;

public class Clothing {
    private Integer cId;

    private Double cCount;

    private Double cPrice;

    private String cSize;

    private String cColor;

    private String mId;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
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
        this.cSize = cSize == null ? null : cSize.trim();
    }

    public String getcColor() {
        return cColor;
    }

    public void setcColor(String cColor) {
        this.cColor = cColor == null ? null : cColor.trim();
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId == null ? null : mId.trim();
    }
}