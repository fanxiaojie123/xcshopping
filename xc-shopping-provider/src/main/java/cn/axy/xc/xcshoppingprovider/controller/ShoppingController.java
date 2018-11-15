package cn.axy.xc.xcshoppingprovider.controller;

import cn.axy.xc.xcshoppingprovider.pojo.ShoppingCart;
import cn.axy.xc.xcshoppingprovider.service.ShoppingCartAddService;
import cn.axy.xc.xcshoppingprovider.service.ShoppingCartChangeService;
import cn.axy.xc.xcshoppingprovider.service.ShoppingCartDeleteService;
import cn.axy.xc.xcshoppingprovider.service.ShoppingCartShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class ShoppingController {

    @Autowired
    private ShoppingCartAddService shoppingCartAddService;
    @Autowired
    private ShoppingCartShowService shoppingCartShowService;
    @Autowired
    private ShoppingCartDeleteService shoppingCartDeleteService;
    @Autowired
    private ShoppingCartChangeService shoppingCartChangeService;


    /**
     * 增加购物车商品
     * @param request
     * @param response
     * @param shoppingCart
     * @param itemId
     * @return
     */
    @RequestMapping(value = "/addShopping",method = RequestMethod.POST)
    public String addShopping(@RequestParam HttpServletRequest request,
                              @RequestParam HttpServletResponse response,
                              @RequestBody ShoppingCart shoppingCart,
                              @RequestParam Long itemId)  {
        String re = null;
        try {
            re = shoppingCartAddService.addItemInCard(request,response,shoppingCart,itemId);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return re;
    }


    /**
     * 删除购物车商品
     * 传入购物车实体类
     * @return
     */
    @RequestMapping(value = "/deleteShopping",method = RequestMethod.POST)
    public String deleteShopping(@RequestParam HttpServletRequest request,
                               @RequestParam HttpServletResponse response,
                               @RequestParam Long itmeId)  {
        String re = null;
        try {
            re = shoppingCartDeleteService.deleteItemInCard(request,response,itmeId);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return re;
    }

    /**
     * 显示购物车商品
     * 传入购物车实体类
     * @return
     */
    @RequestMapping(value = "/showShopping",method = RequestMethod.POST)
    public String showShopping(@RequestParam HttpServletRequest request,
                               @RequestParam HttpServletResponse response)  {
        String re = null;
        try {
            re = shoppingCartShowService.showItemInCard(request,response);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return re;
    }



    /**
     * 修改购物车商品
     * 传入购物车实体类
     * @return
     */
    @RequestMapping(value = "/changeShopping",method = RequestMethod.POST)
    public String changeShopping(@RequestParam HttpServletRequest request,
                               @RequestParam HttpServletResponse response,
                               @RequestParam Long itmeId ,
                               @RequestParam int num)  {
        String re = null;
        try {
            re = shoppingCartChangeService.changeItemInCard(request,response,itmeId,num);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return re;
    }


}
