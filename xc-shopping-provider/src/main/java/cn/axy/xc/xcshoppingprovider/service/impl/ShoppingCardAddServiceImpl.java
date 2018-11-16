package cn.axy.xc.xcshoppingprovider.service.impl;

import cn.axy.xc.xcshoppingprovider.pojo.ShoppingCart;
import cn.axy.xc.xcshoppingprovider.pojo.ShoppingCarts;
import cn.axy.xc.xcshoppingprovider.service.ShoppingCartAddService;
import cn.axy.xc.xcshoppingprovider.util.PutRedis;
import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;


@Slf4j
@Service
public class ShoppingCardAddServiceImpl implements ShoppingCartAddService {

    @Autowired
    private PutRedis putRedis;


    /**
     * 根据登陆状态进行不同的添加，如果未登陆添加进入cookie,如果登陆了添加进入redis
     * 添加时需要判断是否存在商品，如果存在进行数量和价格改变，如果不存在就进行商品添加
     * @param request
     * @param shoppingCart
     * @return
     */
    @Override
    public String addItemInCard(@RequestParam HttpServletRequest request,@RequestParam HttpServletResponse response, ShoppingCart shoppingCart, @RequestParam Long itemId) throws IOException {

        //判断是否登陆
        String code = request.getHeader("code");
        String userId = request.getHeader("userId");

        //返回值map
        Map<String,Object> mapRe = new HashMap<>();

        if (code == null || userId == null){
            mapRe.put("code","400");
            mapRe.put("info","找不到header信息...");
            String string = JSON.toJSONString(mapRe);
            return string;
        }

        //获取cookie中购物车信息
        Cookie[] cookies = request.getCookies();
        ObjectMapper om = new ObjectMapper();
        ShoppingCarts shoppingCarts = null;
        om.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        //获取cookie中的购物车数据
        if (null != cookies && cookies.length > 0) {
            for (Cookie cookie : cookies) {
                if ("BUYCAT".equals(cookie.getName())) {
                    String value = cookie.getValue();
                    String decode = URLDecoder.decode(value, "utf-8");

                    // 购物车 对象 与json字符串互转
                    shoppingCarts = om.readValue(decode, ShoppingCarts.class);
                    break;
                }
            }
        }

        //如果cookie中没有购物车信息
        if(shoppingCarts == null){
            shoppingCarts = new ShoppingCarts();
        }

        Long itemId1 = shoppingCart.getItemId();
        Integer itemNum = shoppingCart.getItemNum();

        //将当前商品添加到购物车
        if(itemId1 != 0  && itemNum > 0){

            boolean b = shoppingCarts.addItemInCard(itemId, shoppingCart.getItemNum(), shoppingCart);

            if (!b){
                mapRe.put("code","500");
                mapRe.put("info","添加购物车失败，参数错误...");
                mapRe.put("result",shoppingCarts);
                String string = JSON.toJSONString(mapRe);
                return string;
            }
        }

        if(code.equals("200")){
            //已登录，将cookie中的数据存到redis中，并删除cookie中的信息
            putRedis.insertBuyerCartToRedis(shoppingCarts,userId);
            //清空reids
            Cookie cookie = new Cookie("BUYCAT", null);
            cookie.setPath("/");
            cookie.setMaxAge(-0);
            response.addCookie(cookie);

            ShoppingCarts shoppingCarts1 = putRedis.get(userId);
            mapRe.put("result",shoppingCarts1);

        }else{
            //未登录，将信息存到cookie中

            //如果登陆就加入cookie
            Writer w = new StringWriter();
            om.writeValue(w, shoppingCarts);

            log.info("写入cookie的信息：" + w.toString());
            String cookieString = w.toString();
            //url
            String encode = URLEncoder.encode(cookieString, "utf-8");

            Cookie cookie = new Cookie("BUYCAT", encode);
            //设置path是可以共享cookie
            cookie.setPath("/");
            //设置Cookie过期时间: -1 表示关闭浏览器失效  0: 立即失效  >0: 单位是秒, 多少秒后失效
            //一天失效
            cookie.setMaxAge(24 * 60 * 60);
            //Cookie写回浏览器
            response.addCookie(cookie);
            mapRe.put("result",shoppingCarts);
        }

        mapRe.put("code","200");
        mapRe.put("info","添加成功");

        String string = JSON.toJSONString(mapRe);
        return string;
    }

}
