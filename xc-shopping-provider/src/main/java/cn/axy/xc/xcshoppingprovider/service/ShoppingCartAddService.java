package cn.axy.xc.xcshoppingprovider.service;

import cn.axy.xc.xcshoppingprovider.pojo.ShoppingCart;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Service
public interface ShoppingCartAddService {
    /**
     * 添加商品到购物车，如果没有登录，添加到cookie中，如果登陆了，添加到redis中
     * @param request
     * @param response
     * @param shoppingCart
     * @param itemId
     * @return
     * @throws IOException
     */
    String addItemInCard(@RequestParam HttpServletRequest request, @RequestParam HttpServletResponse response, @RequestBody ShoppingCart shoppingCart, @RequestParam Long itemId) throws IOException;


}
