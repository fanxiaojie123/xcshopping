package cn.axy.xc.xcorderprovider.service;

import cn.axy.xc.xcorderprovider.pojo.XcOrderO;
import cn.axy.xc.xcorderprovider.pojo.XcOrderU;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public interface ShowListService {

    /**
     * 用户获取订单列表 根据用户id，分页
     * @param userId
     * @param page
     * @param count
     * @return
     */
   String orderListUser(String  userId, int page, int count);


    String orderListShop(String  userId, int page, int count);

    /**
     * 获取订单列表 根据用户id，redis
     * @param userId
     * @return
     */
   List<XcOrderO> orderListRedis(String  userId);

    /**
     * 用户获取订单列表 根据用户id，mysql
     * @param userId
     * @return
     */
   List<XcOrderU> orderListUserMysql(Integer  userId);

    /**
     * 商家获取订单列表 根据用户id，mysql
     * @param userId
     * @return
     */
   List<XcOrderO> orderListShopMysql(String  userId);

}
