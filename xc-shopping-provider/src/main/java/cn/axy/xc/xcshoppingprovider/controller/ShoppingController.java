package cn.axy.xc.xcshoppingprovider.controller;

import cn.axy.xc.xcshoppingprovider.pojo.ShoppingCart;
import cn.axy.xc.xcshoppingprovider.service.ShoppingCartAddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RequestMapping(value = "/shopping")
@RestController
public class ShoppingController {

    @Autowired
    private ShoppingCartAddService shoppingCartService;


    /**
     * 增加购物车商品
     * 传入购物车实体类
     * @return
     */
    @RequestMapping(value = "/addShopping",method = RequestMethod.POST)
    public String addShopping(@RequestParam HttpServletRequest request, @RequestParam ShoppingCart shoppingCart,@RequestParam int num, @RequestParam String userId) throws IOException {
        //String re = shoppingCartService.addItemInCard(request,shoppingCart, num, userId);
        //return re;
        return null;
    }




}
