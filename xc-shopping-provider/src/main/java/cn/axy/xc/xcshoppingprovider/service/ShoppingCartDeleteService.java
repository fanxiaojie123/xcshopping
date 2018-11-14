package cn.axy.xc.xcshoppingprovider.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Service
public interface ShoppingCartDeleteService {
    /**
     * 添加商品到购物车，如果没有登录，添加到cookie中，如果登陆了，添加到redis中
     * @param itmeId
     * @return
     */
    String deleteItemInCard(@RequestParam HttpServletRequest request, @RequestParam HttpServletResponse response, @RequestParam Long itmeId) throws IOException;


}
