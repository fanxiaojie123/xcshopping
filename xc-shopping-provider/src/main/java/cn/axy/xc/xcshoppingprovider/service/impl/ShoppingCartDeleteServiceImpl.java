package cn.axy.xc.xcshoppingprovider.service.impl;

import cn.axy.xc.xcshoppingprovider.pojo.ShoppingCarts;
import cn.axy.xc.xcshoppingprovider.service.ShoppingCartDeleteService;
import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCartDeleteServiceImpl implements ShoppingCartDeleteService {

    /**
     * 修改商品数量
     * @param request
     * @param response
     * @param itmeId
     * @return
     * @throws IOException
     */
    @Override
    public String deleteItemInCard(@RequestParam HttpServletRequest request, @RequestParam HttpServletResponse response, @RequestParam Long itmeId) throws IOException {
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

            //删除购物车中的信息
            if(itmeId != 0 ){
                boolean b = shoppingCarts.removeItem(itmeId);
                if(!b){
                    mapRe.put("code","500");
                    mapRe.put("info","删除商品失败...");
                    mapRe.put("result",shoppingCarts);
                    String string = JSON.toJSONString(mapRe);
                    return string;
                }
            }

            //如果未登陆就加入cookie
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

        }else{





        }

        mapRe.put("code","200");
        mapRe.put("result","修改数量成功...");
        String string = JSON.toJSONString(mapRe);
        return string;
    }
}
