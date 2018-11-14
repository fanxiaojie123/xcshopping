package cn.axy.xc.xcshoppingprovider.service.impl;

import cn.axy.xc.xcshoppingprovider.pojo.ShoppingCart;
import cn.axy.xc.xcshoppingprovider.pojo.ShoppingCarts;
import cn.axy.xc.xcshoppingprovider.service.ShoppingCartAddService;
import cn.axy.xc.xcshoppingprovider.util.PutRedis;
import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

@Service
public class ShoppingCardAddServiceImpl implements ShoppingCartAddService {

    /**
     * 根据登陆状态进行不同的添加，如果未登陆添加进入cookie,如果登陆了添加进入redis
     * 添加时需要判断是否存在商品，如果存在进行数量和价格改变，如果不存在就进行商品添加
     * @param request
     * @param shoppingCart
     * @return
     */
    @Override
    public String addItemInCard(@RequestParam HttpServletRequest request,@RequestParam HttpServletResponse response,@RequestBody ShoppingCart shoppingCart, @RequestParam Long itemId) throws IOException {

        //判断是否登陆
        String code = request.getHeader("code");
        String userId = request.getHeader("userId");

        //返回值map
        Map<String,Object> mapRe = new HashMap<>();

        //获取cookie中购物车信息
        Cookie[] cookies = request.getCookies();
        ObjectMapper om = new ObjectMapper();
        ShoppingCarts shoppingCarts = null;
        om.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        //获取cookie中的购物车数据
        if (null != cookies && cookies.length > 0) {
            for (Cookie cookie : cookies) {
                if ("BUYCAT".equals(cookie.getName())) {
                    // 购物车 对象 与json字符串互转
                    shoppingCarts = om.readValue(cookie.getValue(), ShoppingCarts.class);
                    break;
                }
            }
        }

        //如果cookie中没有购物车信息
        if(shoppingCarts == null){
            shoppingCarts = new ShoppingCarts();
        }

        //将当前商品添加到购物车
        if((shoppingCart.getItemId() != 0 ) && shoppingCart.getItemNum() > 0){

            boolean b = shoppingCarts.addItemInCard(itemId, shoppingCart.getItemNum(), shoppingCart);

            if (!b){
                mapRe.put("code","500");
                mapRe.put("info","添加购物车失败，参数错误...");
                String string = JSON.toJSONString(mapRe);
                return string;
            }
        }

        if(code.equals("200")){
            //已登录，将cookie中的数据存到redis中，并删除cookie中的信息
            PutRedis.insertBuyerCartToRedis(shoppingCarts,userId);
            //清空reids
            Cookie cookie = new Cookie("BUYCAT", null);
            cookie.setPath("/");
            cookie.setMaxAge(-0);
            response.addCookie(cookie);
        }else{
            //未登录，将信息存到cookie中

            //如果登陆就加入cookie
            Writer w = new StringWriter();
            om.writeValue(w, shoppingCarts);
            Cookie cookie = new Cookie("BUYCAT", w.toString());
            //设置path是可以共享cookie
            cookie.setPath("/");
            //设置Cookie过期时间: -1 表示关闭浏览器失效  0: 立即失效  >0: 单位是秒, 多少秒后失效
            //一天失效
            cookie.setMaxAge(24 * 60 * 60);
            //Cookie写回浏览器
            response.addCookie(cookie);
        }

        mapRe.put("code","200");
        mapRe.put("info","添加成功");
        mapRe.put("result",shoppingCarts);
        String string = JSON.toJSONString(mapRe);
        return string;
    }

}
