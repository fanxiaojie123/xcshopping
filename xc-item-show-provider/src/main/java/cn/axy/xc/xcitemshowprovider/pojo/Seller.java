package cn.axy.xc.xcitemshowprovider.pojo;

public class Seller {
    private String sId;

    private String sPwd;

    private String sName;

    private Integer sSex;

    private String sAddress;

    private String sPhone;

    private String sDescribe;

    private String sPicture;

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId == null ? null : sId.trim();
    }

    public String getsPwd() {
        return sPwd;
    }

    public void setsPwd(String sPwd) {
        this.sPwd = sPwd == null ? null : sPwd.trim();
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public Integer getsSex() {
        return sSex;
    }

    public void setsSex(Integer sSex) {
        this.sSex = sSex;
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress == null ? null : sAddress.trim();
    }

    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone == null ? null : sPhone.trim();
    }

    public String getsDescribe() {
        return sDescribe;
    }

    public void setsDescribe(String sDescribe) {
        this.sDescribe = sDescribe == null ? null : sDescribe.trim();
    }

    public String getsPicture() {
        return sPicture;
    }

    public void setsPicture(String sPicture) {
        this.sPicture = sPicture == null ? null : sPicture.trim();
    }
}