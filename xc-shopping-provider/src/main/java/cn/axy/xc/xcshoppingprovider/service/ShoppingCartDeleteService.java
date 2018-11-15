package cn.axy.xc.xcshoppingprovider.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Service
public interface ShoppingCartDeleteService {
    /**
     * 删除购物车中的商品
     * @param itmeId
     * @return
     */
    String deleteItemInCard(@RequestParam HttpServletRequest request, @RequestParam HttpServletResponse response, @RequestParam Long itmeId) throws IOException;


}
