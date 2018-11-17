package cn.axy.xc.xcorderprovider.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(value = "XcOrderShipping",description = "订单物流，记录该订单的物流信息")
public class XcOrderShipping {

    @ApiModelProperty(value = "订单ID",dataType = "String")
    private String orderId;

    @ApiModelProperty(value = "收货人全名",dataType = "String")
    private String receiverName;

    @ApiModelProperty(value = "固定电话",dataType = "String")
    private String receiverPhone;

    @ApiModelProperty(value = "移动电话",dataType = "String")
    private String receiverMobile;

    @ApiModelProperty(value = "收货地址，如：xx路xx号",dataType = "String")
    private String receiverAddress;

    @ApiModelProperty(value = "邮政编码,如：310001",dataType = "String")
    private String receiverZip;

    @ApiModelProperty(value = "创建时间",dataType = "Date")
    private Date created;

    @ApiModelProperty(value = "更新时间",dataType = "Date")
    private Date updated;

    @ApiModelProperty(value = "冗余列1",dataType = "String")
    private String extend1;

    @ApiModelProperty(value = "冗余列2",dataType = "String")
    private String extend2;

    @ApiModelProperty(value = "冗余列3",dataType = "String")
    private String extend3;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone == null ? null : receiverPhone.trim();
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile == null ? null : receiverMobile.trim();
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress == null ? null : receiverAddress.trim();
    }

    public String getReceiverZip() {
        return receiverZip;
    }

    public void setReceiverZip(String receiverZip) {
        this.receiverZip = receiverZip == null ? null : receiverZip.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getExtend1() {
        return extend1;
    }

    public void setExtend1(String extend1) {
        this.extend1 = extend1 == null ? null : extend1.trim();
    }

    public String getExtend2() {
        return extend2;
    }

    public void setExtend2(String extend2) {
        this.extend2 = extend2 == null ? null : extend2.trim();
    }

    public String getExtend3() {
        return extend3;
    }

    public void setExtend3(String extend3) {
        this.extend3 = extend3 == null ? null : extend3.trim();
    }
}