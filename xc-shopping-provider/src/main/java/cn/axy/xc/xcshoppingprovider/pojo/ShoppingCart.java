package cn.axy.xc.xcshoppingprovider.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 购物车实体类
 */
@ApiModel(value = "ShoppingCart",description = "购物车实体类，保存购物车一件商品的信息")
public class ShoppingCart {
    /**
     * 商品id
     */
    @ApiModelProperty(value = "商品id",dataType = "Long")
    private Long itemId;

    /**
     * 商品标题
     */
    @ApiModelProperty(value = "商品标题")
    private String itemTitle;

    /**
     * 商品单价
     */
    @ApiModelProperty(value = "商品单价")
    private Double itemPrice;
    /**
     * 商品属性
     */
    @ApiModelProperty(value = "商品属性")
    private String itemSku;
    /**
     * 商品小图
     */
    @ApiModelProperty(value = "商品小图")
    private String itemImg;
    /**
     * 商品商店id
     */
    @ApiModelProperty(value = "商品商店id")
    private String shopId;
    /**
     * 商店名字
     */
    @ApiModelProperty(value = "商店名字")
    private String shopName;

    /**
     * 商品数量
     */
    @ApiModelProperty(value = "商品数量")
    private Integer itemNum;


    public Integer getItemNum() {
        return itemNum;
    }

    public void setItemNum(Integer itemNum) {
        if (itemNum < 0){
            this.itemNum = 0;
            throw new RuntimeException("商品数量需要大于0");
        }
        this.itemNum = itemNum;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public Double getItemPrice() {



        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {

        if (itemPrice < 0){
            //商品单价小于0，将他置为0
            this.itemPrice = 0.0;
            throw new RuntimeException("商品价格需要大于0");
        }

        this.itemPrice = itemPrice;
    }

    public String getItemSku() {
        return itemSku;
    }

    public void setItemSku(String itemSku) {
        this.itemSku = itemSku;
    }

    public String getItemImg() {
        return itemImg;
    }

    public void setItemImg(String itemImg) {
        this.itemImg = itemImg;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
}
