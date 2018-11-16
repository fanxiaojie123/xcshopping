package cn.axy.xc.xcshoppingprovider.service;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Service
public interface ShoppingCartShowService {
    /**
     * 展示购物车商品
     * @return
     */
    String showItemInCard( HttpServletRequest request,  HttpServletResponse response) throws IOException;
}
