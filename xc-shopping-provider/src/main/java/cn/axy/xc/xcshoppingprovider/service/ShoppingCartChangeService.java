package cn.axy.xc.xcshoppingprovider.service;

import cn.axy.xc.xcshoppingprovider.pojo.ShoppingCart;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Service
public interface ShoppingCartChangeService {
    /**
     * 添加商品到购物车，如果没有登录，添加到cookie中，如果登陆了，添加到redis中
     * @param itmeId
     * @param num
     * @return
     */
    String changeItemInCard(@RequestParam HttpServletRequest request, @RequestParam HttpServletResponse response, @RequestParam Long itmeId , @RequestParam int num) throws IOException;


}
