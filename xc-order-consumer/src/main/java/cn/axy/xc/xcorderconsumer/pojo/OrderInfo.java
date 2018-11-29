package cn.axy.xc.xcorderconsumer.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "OrderInfo",description = "订单信息，Controller层使用")
public class OrderInfo implements Serializable {

    /**
     * 付款金额
     */
    @ApiModelProperty(value = "实付金额。精确到2位小数;单位:元。如:200.07，表示:200元7分",dataType = "double")
    private Double payment;

    /**
     * 支付类型
     */
    @ApiModelProperty(value = "支付类型，1、在线支付，2、货到付款",dataType = "Integer")
    private Integer paymentType;

    /**
     *邮费
     */
    @ApiModelProperty(value = "邮费。精确到2位小数;单位:元。如:200.07，表示:200元7分",dataType = "double")
    private Double postFee;

    /**
     * 用户id
     */
    @ApiModelProperty(value = "用户id",dataType = "String")
    private String userId;

    /**
     * 买家昵称
     */
    @ApiModelProperty(value = "买家昵称",dataType = "String")
    private String buyerNick;

    /**
     * 购买信息
     */
    @ApiModelProperty(value = "买家留言",dataType = "String")
    private String buyerMessage;

    /**
     * 订单商品信息表
     */
    @ApiModelProperty(value = "订单商品信息表",dataType = "XcOrderItem")
    private XcOrderItem orderItem;


    public Double getPayment() {
        return payment;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public Double getPostFee() {
        return postFee;
    }

    public void setPostFee(Double postFee) {
        this.postFee = postFee;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBuyerNick() {
        return buyerNick;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public String getBuyerMessage() {
        return buyerMessage;
    }

    public void setBuyerMessage(String buyerMessage) {
        this.buyerMessage = buyerMessage;
    }

    public XcOrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(XcOrderItem orderItem) {
        this.orderItem = orderItem;
    }


}
