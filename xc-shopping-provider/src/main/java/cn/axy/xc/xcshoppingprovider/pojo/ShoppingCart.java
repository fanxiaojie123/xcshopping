package cn.axy.xc.xcshoppingprovider.pojo;

/**
 * 购物车实体类
 */
public class ShoppingCart {
    /**
     * 商品id
     */
    private Long itemId;
    /**
     * 商品标题
     */

    private String itemTitle;

    /**
     * 商品单价
     */
    private Double itemPrice;
    /**
     * 商品属性
     */
    private String itemSku;
    /**
     * 商品小图
     */
    private String itemImg;
    /**
     * 商品商店id
     */
    private String shopId;
    /**
     * 商店名字
     */
    private String shopName;

    /**
     * 商品数量
     */
    private Integer itemNum;


    public Integer getItemNum() {

        if (itemNum < 0){
            itemNum = 0;
            throw new RuntimeException("商品数量需要大于0");
        }

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

        if (itemPrice < 0){
            //商品单价小于0，将他置为0
            this.itemPrice = 0.0;
            throw new RuntimeException("商品价格需要大于0");
        }

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
