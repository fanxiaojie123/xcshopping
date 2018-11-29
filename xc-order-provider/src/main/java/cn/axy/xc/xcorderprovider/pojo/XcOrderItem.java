package cn.axy.xc.xcorderprovider.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
@ApiModel(value = "XcOrderItem",description = "订单商品表，记录该订单的商品信息")
public class XcOrderItem {
    @ApiModelProperty(value = "商品id",dataType = "String")
    private String itemId;

    @ApiModelProperty(value = "订单id",dataType = "String")
    private String orderId;

    @ApiModelProperty(value = "商品购买数量",dataType = "Integer")
    private Integer num;

    @ApiModelProperty(value = "商品标题",dataType = "String")
    private String title;

    @ApiModelProperty(value = "商品单价",dataType = "Double")
    private Double price;

    @ApiModelProperty(value = "商品总金额",dataType = "Double")
    private Double totalFee;

    @ApiModelProperty(value = "商品图片地址",dataType = "String")
    private String picPath;

    @ApiModelProperty(value = "冗余列1",dataType = "String")
    private String extend1;

    @ApiModelProperty(value = "冗余列2",dataType = "String")
    private String extend2;

    @ApiModelProperty(value = "冗余列3",dataType = "String")
    private String extend3;

    @ApiModelProperty(value = "信息创建时间",dataType = "Date")
    private Date created;

    @ApiModelProperty(value = "skuID" ,dataType = "Long")
    private Long skuid;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Double totalFee) {
        this.totalFee = totalFee;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath == null ? null : picPath.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
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

    public Long getSkuid() {
        return skuid;
    }

    public void setSkuid(Long skuid) {
        this.skuid = skuid;
    }
}