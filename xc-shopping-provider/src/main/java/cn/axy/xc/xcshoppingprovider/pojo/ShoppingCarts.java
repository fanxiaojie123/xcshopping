package cn.axy.xc.xcshoppingprovider.pojo;

import lombok.extern.slf4j.Slf4j;


import java.util.*;

@Slf4j
public class ShoppingCarts {
    /**
     * 购物车列表
     */
    private Map<Long,ShoppingCart> shoppingCartMap;

    /**
     * 购物车总金额
     */
    private Double totalPrice;

    /**
     * 构造函数
     */
    public ShoppingCarts(){
        shoppingCartMap = new HashMap<Long,ShoppingCart>();

        totalPrice = 0.0;
    }

    public Map<Long, ShoppingCart> getShoppingCartMap() {
        return shoppingCartMap;
    }

    public void setShoppingCartMap(Map<Long, ShoppingCart> shoppingCartMap) {
        this.shoppingCartMap = shoppingCartMap;
    }

    /**
     * 获得购物车总金额
     * @return 总金额
     */
    public Double getTotalPrice() {
        double sum = 0.0;
        Set<Long> Longs = shoppingCartMap.keySet();
        for (Long i : Longs) {
            sum += shoppingCartMap.get(i).getItemPrice() * shoppingCartMap.get(i).getItemNum();
        }
        this.totalPrice = sum;//设置购物车的总金额
        return this.totalPrice;
    }

    /**
     * 添加商品到购物车
     * @param itemId 购物车商品id
     * @param num 添加入购物车的数量
     * @param shoppingCart 如果购物信息不存在 添加过得购物车信息，如果存在 可以为null
     * @return
     */
    public boolean addItemInCard(Long itemId, int num,ShoppingCart shoppingCart){
        //获取到这个商品
        ShoppingCart shoppingCartInCard = shoppingCartMap.get(itemId);
        if (shoppingCartInCard != null){
            //购物车中存在这个商品
                //修改数量
            shoppingCartInCard.setItemNum(shoppingCartInCard.getItemNum() + num);
                //修改
            shoppingCartMap.put(itemId, shoppingCartInCard);
        }else{
            if (shoppingCart != null){
                shoppingCartMap.put(itemId,shoppingCart);
            }else {
                return false;
            }

        }
        getTotalPrice();//计算总金额
        return true;
    }


    /**
     * 从购物车删除商品
     * @param itemId 购物车id
     * @return
     */
    public boolean removeItem(Long itemId){
        if (shoppingCartMap.containsKey(itemId)){
            shoppingCartMap.remove(itemId);
            getTotalPrice();//计算总价格
            return true;
        }else {
            return false;
        }
    }

    /**
     * 购物车减少商品（保证商品不为负）
     * @param itemId 购物车id
     * @param num 数量
     * @return
     */
    public boolean reduceItem(Long itemId,int num){
        if (shoppingCartMap.containsKey(itemId)){
            //购物车有这个实体类
            //减少后 是否为负
            int numnow = shoppingCartMap.get(itemId).getItemNum() - num;
            if(numnow < 0){
                //减为负数了
                return false;
            }else{
                //获得购物车实体类
                ShoppingCart cart = shoppingCartMap.get(itemId);
                cart.setItemNum(numnow);
                shoppingCartMap.put(itemId,cart);
                getTotalPrice();//计算总金额
                return true;
            }
        }else{
            //购物车没有这个实体类
            return false;
        }
    }
}
