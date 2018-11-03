package cn.axy.xc.xcitemshowprovider.pojo;

public class Ornaments {
    private String oId;

    private String mId;

    private Double oSize;

    private String oColor;

    private Double oCount;

    private Double oPrice;

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId == null ? null : oId.trim();
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId == null ? null : mId.trim();
    }

    public Double getoSize() {
        return oSize;
    }

    public void setoSize(Double oSize) {
        this.oSize = oSize;
    }

    public String getoColor() {
        return oColor;
    }

    public void setoColor(String oColor) {
        this.oColor = oColor == null ? null : oColor.trim();
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