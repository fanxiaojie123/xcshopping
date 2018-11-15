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
     * 修改购物车中的商品
     * @param itmeId
     * @param num
     * @return
     */
    String changeItemInCard(@RequestParam HttpServletRequest request, @RequestParam HttpServletResponse response, @RequestParam Long itmeId , @RequestParam int num) throws IOException;


}
