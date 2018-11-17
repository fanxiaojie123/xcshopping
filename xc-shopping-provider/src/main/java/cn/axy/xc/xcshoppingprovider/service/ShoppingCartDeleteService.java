package cn.axy.xc.xcshoppingprovider.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@Service
public interface ShoppingCartDeleteService {
    /**
     * 删除购物车中的商品
     * @param itmeId
     * @return
     */
    String deleteItemInCard( HttpServletRequest request,  HttpServletResponse response, List<Long> itmeIds) throws IOException;


}
