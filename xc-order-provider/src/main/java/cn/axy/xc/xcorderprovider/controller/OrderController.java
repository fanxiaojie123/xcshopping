package cn.axy.xc.xcorderprovider.controller;

import cn.axy.xc.xcorderprovider.pojo.OrderInfo;
import cn.axy.xc.xcorderprovider.service.ChangeService;
import cn.axy.xc.xcorderprovider.service.CreateService;
import cn.axy.xc.xcorderprovider.service.ShowInfoService;
import cn.axy.xc.xcorderprovider.service.ShowListService;
import cn.axy.xc.xcorderprovider.service.impl.ShowListServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//需要先登陆才可以调用本接口
@Api(value="/order", tags="订单系统provider接口")
@RestController
public class OrderController {

    @Autowired
    private ChangeService changeService;

    @Autowired
    private CreateService createService;

    @Autowired
    private ShowInfoService showInfoService;

    @Autowired
    private ShowListService showListService;

    /**
     * 创建一个订单，首先存在redis中，
     * 若支付成功，redis中删除，存到mysql中
     * 若支付失败，或没有进行支付，留在redis中30分钟，
     * 若在未支付期间支付成功了，redis中删除，存到mysql中
     * @param orderInfo
     * @return
     */
    @ApiOperation(value="创建订单", notes = "创建订单")
    @ApiImplicitParams({
            @ApiImplicitParam(name="orderInfo", value="orderInfo", dataType = "OrderInfo")
    })
    @RequestMapping(value = "create",method = RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
    public String createOrder(@RequestBody OrderInfo orderInfo, HttpServletRequest request){
        String userId = request.getHeader("userId");
        String order = createService.createOrder(orderInfo, userId);
        return order;
    }

    /**
     * 商家根据订单id，获得订单信息
     * 先查看 redis中 然后查询mysql
     * @param orderId
     * @return
     */
    @ApiOperation(value="商家根据订单id，获得订单信息", notes = "商家根据订单id，获得订单信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name="orderId", value="orderId", dataType = "String")
    })
    @RequestMapping(value = "orderInfoShop",method = RequestMethod.POST)
    public String orderInfoShop(@RequestParam String  orderId){
        return showInfoService.orderInfoShop(orderId);
    }

    /**
     * 用户根据订单id，获得订单信息
     * 先查看 redis中 然后查询mysql
     * @param orderId
     * @return
     */
    @ApiOperation(value="用户根据订单id，获得订单信息", notes = "用户根据订单id，获得订单信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name="orderId", value="orderId", dataType = "String")
    })
   @RequestMapping(value = "orderInfoUser",method = RequestMethod.POST)
    public String orderInfoUser(@RequestParam String  orderId){
        return showInfoService.orderInfoUser(orderId);
    }


    /**
     * 用户查看订单列表（时间倒叙）
     * @param userId 用户id
     * @param page 起始页
     * @param count 每页数量
     * @param type 显示类型 1 显示所有订单 2显示待付款 3显示代发货 4显示待收货
     * @return
     */
    /*@RequestMapping(value = "list",method = RequestMethod.POST)
    public String orderListUser(@RequestParam String  userId, @RequestParam int page, @RequestParam int count, @RequestParam Integer type){

        return null;
    }*/

    /**
     * 用户查看订单列表（时间倒叙）（所有）
     * @param userId
     * @param page
     * @param count
     * @return
     */
    @ApiOperation(value="用户查看订单列表", notes = "用户查看订单列表（时间倒叙）（所有）")
    @ApiImplicitParams({
            @ApiImplicitParam(name="userId", value="用户id", dataType = "String")
            ,@ApiImplicitParam(name="page", value="第几页（页码）", dataType = "int")
            ,@ApiImplicitParam(name="count", value="每页数量", dataType = "int")
    })
    @RequestMapping(value = "userlist",method = RequestMethod.POST)
    public String orderListUser(@RequestParam String  userId, @RequestParam int page, @RequestParam int count){
        String s = showListService.orderListUser(userId, page, count);
        return s;
    }



    /**
     * 商家查看订单列表（时间倒叙）
     * @param userId 用户id
     * @param page 起始页
     * @param count 每页数量
     * @param type 显示类型 1 显示所有订单 2显示待付款 3显示代发货 4显示待收货
     * @return
     */
   /* @RequestMapping(value = "list",method = RequestMethod.POST)
    public String orderListShop(@RequestParam String  userId, @RequestParam int page, @RequestParam int count, @RequestParam Integer type){

        return null;
    }*/


    /**
     * 商家查看订单列表（时间倒叙）（所有）
     * @param userId
     * @param page
     * @param count
     * @return
     */
    @ApiOperation(value="商家查看订单列表", notes = "商家查看订单列表（时间倒叙）（所有）")
    @ApiImplicitParams({
            @ApiImplicitParam(name="userId", value="用户id", dataType = "String")
            ,@ApiImplicitParam(name="page", value="第几页（页码）", dataType = "int")
            ,@ApiImplicitParam(name="count", value="每页数量", dataType = "int")
    })
    @RequestMapping(value = "shoplist",method = RequestMethod.POST)
    public String orderListShop(@RequestParam String  userId, @RequestParam int page, @RequestParam int count){
        String s = showListService.orderListShop(userId, page, count);
        return s;
    }



    /**
     * 修改订单状态
     * @param status 修改后的状态 4、已发货，5、交易成功，6、交易关闭
     * @return
     */
    @ApiOperation(value="修改订单状态", notes = "修改后的状态 4、已发货，5、交易成功，6、交易关闭")
    @ApiImplicitParams({
            @ApiImplicitParam(name="userId", value="用户id", dataType = "String")
            ,@ApiImplicitParam(name="page", value="第几页（页码）", dataType = "int")
            ,@ApiImplicitParam(name="count", value="每页数量", dataType = "int")
    })
    @RequestMapping(value = "change",method = RequestMethod.POST)
    public String orderChange(@RequestParam("orderid") String orderid ,@RequestParam("status") int status){
        String s = changeService.orderChange(orderid,status);
        return s;
    }

    /**
     * 修改订单状态为 已付款
     * @param orderid
     * @return
     */
    @ApiOperation(value="修改订单状态为已付款", notes = "修改订单状态为已付款")
    @ApiImplicitParams({
            @ApiImplicitParam(name="orderid", value="订单id", dataType = "String")
    })
    @RequestMapping(value = "orderChangetoPaid",method = RequestMethod.POST)
    public String orderChangetoPaid(@RequestParam("orderid") String orderid){
        String s = changeService.ChangeToPaid(orderid);
        return s;
    }

    /**
     * 修改订单状态为 已发货
     * @param orderid
     * @return
     */
    @ApiOperation(value="修改订单状态为已发货", notes = "修改订单状态为已发货")
    @ApiImplicitParams({
            @ApiImplicitParam(name="orderid", value="订单id", dataType = "String")
    })
    @RequestMapping(value = "orderChangetoDeliver",method = RequestMethod.POST)
    public String orderChangetoDeliver(@RequestParam("orderid") String orderid){
        String s = changeService.orderChangetoDeliver(orderid);
        return s;
    }

    /**
     * 修改订单状态为 交易成功
     * @param orderid
     * @return
     */
    @ApiOperation(value="修改订单状态为交易成功", notes = "修改订单状态为交易成功")
    @ApiImplicitParams({
            @ApiImplicitParam(name="orderid", value="订单id", dataType = "String")
    })
    @RequestMapping(value = "orderChangetoDeals",method = RequestMethod.POST)
    public String orderChangetoDeals(@RequestParam("orderid") String orderid){
        String s = changeService.orderChangetoDeals(orderid);
        return s;
    }

    /**
     * 修改订单状态为 交易关闭
     * @param orderid
     * @return
     */
    @ApiOperation(value="修改订单状态为交易关闭", notes = "修改订单状态为交易关闭")
    @ApiImplicitParams({
            @ApiImplicitParam(name="orderid", value="订单id", dataType = "String")
    })
    @RequestMapping(value = "orderChangetoClose",method = RequestMethod.POST)
    public String orderChangetoClose(@RequestParam("orderid") String orderid){
        String s = changeService.orderChangetoClose(orderid);
        return s;
    }
}
