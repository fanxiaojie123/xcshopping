package cn.axy.xc.xcorderprovider.pojo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(value = "XcOrderO",description = "记录一条商家订单信息，商家订单从这个订单表里面查询，字段与用户订单表一样")
public class XcOrderO {
    @ApiModelProperty(value = "订单ID",dataType = "String")
    private String orderId;

    @ApiModelProperty(value = "实付金额。精确到2位小数;单位:元。如:200.07，表示:200元7分",dataType = "String")
    private String payment;

    @ApiModelProperty(value = "支付类型，1、在线支付，2、货到付款",dataType = "Integer")
    private Integer paymentType;

    @ApiModelProperty(value = "邮费。精确到2位小数;单位:元。如:200.07，表示:200元7分",dataType = "String")
    private String postFee;

    @ApiModelProperty(value = "状态：1、未付款，2、已付款，3、未发货，4、已发货，5、交易成功，6、交易关闭",dataType = "Integer")
    private Integer status;

    @ApiModelProperty(value = "订单创建时间",dataType = "Date")
    private Date createTime;

    @ApiModelProperty(value = "订单更新时间",dataType = "Date")
    private Date updateTime;

    @ApiModelProperty(value = "付款时间",dataType = "Date")
    private Date paymentTime;

    @ApiModelProperty(value = "发货时间",dataType = "Date")
    private Date consignTime;

    @ApiModelProperty(value = "交易完成时间",dataType = "Date")
    private Date endTime;

    @ApiModelProperty(value = "交易关闭时间",dataType = "Date")
    private Date closeTime;

    @ApiModelProperty(value = "物流名称",dataType = "String")
    private String shippingName;

    @ApiModelProperty(value = "物流单号",dataType = "String")
    private String shippingCode;

    @ApiModelProperty(value = "用户id",dataType = "String")
    private String userId;

    @ApiModelProperty(value = "买家留言",dataType = "String")
    private String buyerMessage;

    @ApiModelProperty(value = "买家昵称",dataType = "String")
    private String buyerNick;

    @ApiModelProperty(value = "买家是否已经评价",dataType = "Integer")
    private Integer buyerRate;

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

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment == null ? null : payment.trim();
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public String getPostFee() {
        return postFee;
    }

    public void setPostFee(String postFee) {
        this.postFee = postFee == null ? null : postFee.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Date getConsignTime() {
        return consignTime;
    }

    public void setConsignTime(Date consignTime) {
        this.consignTime = consignTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public String getShippingName() {
        return shippingName;
    }

    public void setShippingName(String shippingName) {
        this.shippingName = shippingName == null ? null : shippingName.trim();
    }

    public String getShippingCode() {
        return shippingCode;
    }

    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode == null ? null : shippingCode.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getBuyerMessage() {
        return buyerMessage;
    }

    public void setBuyerMessage(String buyerMessage) {
        this.buyerMessage = buyerMessage == null ? null : buyerMessage.trim();
    }

    public String getBuyerNick() {
        return buyerNick;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick == null ? null : buyerNick.trim();
    }

    public Integer getBuyerRate() {
        return buyerRate;
    }

    public void setBuyerRate(Integer buyerRate) {
        this.buyerRate = buyerRate;
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