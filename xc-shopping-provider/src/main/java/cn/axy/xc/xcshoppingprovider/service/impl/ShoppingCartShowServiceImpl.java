package cn.axy.xc.xcshoppingprovider.service.impl;

import cn.axy.xc.xcshoppingprovider.pojo.ShoppingCarts;
import cn.axy.xc.xcshoppingprovider.service.ShoppingCartDeleteService;
import cn.axy.xc.xcshoppingprovider.service.ShoppingCartShowService;
import cn.axy.xc.xcshoppingprovider.util.RedisUtil;
import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCartShowServiceImpl implements ShoppingCartShowService {


    @Autowired
    private RedisUtil redisUtil;
    /**
     * 修改商品数量
     * @param request
     * @param response
     * @return
     * @throws IOException
     */
    @Override
    public String showItemInCard(@RequestParam HttpServletRequest request, @RequestParam HttpServletResponse response ) throws IOException {
        //判断是否登陆
        String code = request.getHeader("code");
        String userId = request.getHeader("userId");

        Map<String,Object> mapRe = new HashMap<>();

        if(!code.equals("200")){
            //未登录，将信息存到cookie中

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

            mapRe.put("code","200");
            mapRe.put("info","删除商品成功...");
            mapRe.put("result",shoppingCarts);
            String string = JSON.toJSONString(mapRe);
            return string;
        }else{
            ShoppingCarts shoppingCarts = (ShoppingCarts) redisUtil.get(userId);

            mapRe.put("code","200");
            mapRe.put("info","删除商品成功...");
            mapRe.put("result",shoppingCarts);
            String string = JSON.toJSONString(mapRe);
            return string;
        }


    }
}
