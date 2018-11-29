package cn.axy.xc.xcorderprovider.service.impl;

import cn.axy.xc.xcorderprovider.dao.XcOrderOMapper;
import cn.axy.xc.xcorderprovider.dao.XcOrderUMapper;
import cn.axy.xc.xcorderprovider.pojo.*;
import cn.axy.xc.xcorderprovider.service.ShowListService;
import cn.axy.xc.xcorderprovider.util.RedisUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import io.swagger.models.auth.In;
import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.session.SessionProperties;
import org.springframework.stereotype.Service;

import java.nio.channels.Pipe;
import java.util.*;

@Slf4j
@Service
public class ShowListServiceImpl implements ShowListService {

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private XcOrderOMapper xcOrderOMapper;

    @Autowired
    private XcOrderUMapper xcOrderUMapper;

    @Override
    public String orderListUser(String userId, int page, int count) {
        Map<String,Object> reMap = new HashMap<>();
        //将userid转为整数
        int userIdInt ;
        try {
            userIdInt = Integer.parseInt(userId);
        }catch (Exception e){

            reMap.put("code","500");
            reMap.put("info","用户id必须为整数");
            String string = JSON.toJSONString(reMap);
            log.info(string);
            return string;
        }
        List<XcOrderO> orderOList = orderListRedis(userId);
        List<XcOrderU> xcOrderUS = orderListUserMysql(userIdInt);
        List<XcOrderU> lists = JSONObject.parseObject(JSON.toJSONBytes(orderOList), List.class);
        lists.addAll(xcOrderUS);

        //分页
        int size = lists.size();//总条数
        int pages = size / count + 1;//总页数
        log.info("总页数：" + size / count);
        log.info("总页数：" + pages);
        if (pages == 0.0){
            pages = 1;
        }
        log.info("总页数：" + pages);
        if (page < 1 || page > pages){

            reMap.put("code","500");
            reMap.put("info","当前页输入错误....");
            String string = JSON.toJSONString(reMap);
            log.info(string);
            return string;
        }
        if (count < 1) {
            reMap.put("code", "500");
            reMap.put("info", "页面大小输入错误....");
            String string = JSON.toJSONString(reMap);
            log.info(string);
            return string;
        }
        //开始位置（包含）
        int start = (page - 1) * count ;
        //结束位置（不包含）
        int end = start + count ;

        log.info("开始位置："+start);
        log.info("结束位置："+end);

        if (end > size){
            end = size;
        }

        List<XcOrderU> orderUList1 = lists.subList(start, end);


        //list按照时间倒叙排序
        System.out.println("排序前：" + JSON.toJSONString(orderUList1));

        Collections.sort(orderUList1, new Comparator<XcOrderU>() {
            @Override
            public int compare(XcOrderU o1, XcOrderU o2) {
                if (o1.getCreateTime().compareTo(o2.getCreateTime()) == 1) {
                    return -1;
                }
                if (o1.getCreateTime().compareTo(o2.getCreateTime()) == 0) {
                    return 0;
                }
                return 1;
            }
        });

        System.out.println("排序后：" + JSON.toJSONString(orderUList1));

        reMap.put("code","200");
        reMap.put("info","ok");
        reMap.put("result",orderUList1);
        String string = JSON.toJSONString(reMap);
        log.info(string);
        return string;

    }

    @Override
    public String orderListShop(String userId, int page, int count) {

        Map<String,Object> reMap = new HashMap<>();
        //将userid转为整数

        List<XcOrderO> orderOList = orderListRedis(userId);
        List<XcOrderO> xcOrderOS = orderListShopMysql(userId);

        xcOrderOS.addAll(orderOList);

        //分页
        int size = xcOrderOS.size();//总条数
        int pages = size / count + 1;//总页数
        log.info("总页数：" + size / count);
        log.info("总页数：" + pages);
        if (pages == 0.0){
            pages = 1;
        }
        log.info("总页数：" + pages);
        if (page < 1 || page > pages){

            reMap.put("code","500");
            reMap.put("info","当前页输入错误....");
            String string = JSON.toJSONString(reMap);
            log.info(string);
            return string;
        }
        if (count < 1) {
            reMap.put("code", "500");
            reMap.put("info", "页面大小输入错误....");
            String string = JSON.toJSONString(reMap);
            log.info(string);
            return string;
        }
        //开始位置（包含）
        int start = (page - 1) * count ;
        //结束位置（不包含）
        int end = start  + count ;

        log.info("开始位置："+start);
        log.info("结束位置："+end);

        if (end > size){
            end = size;
        }

        List<XcOrderO> orderOList1 = xcOrderOS.subList(start, end);

        //list按照时间倒叙排序
        System.out.println("排序前：" + JSON.toJSONString(orderOList1));

        Collections.sort(orderOList1, new Comparator<XcOrderO>() {
            @Override
            public int compare(XcOrderO o1, XcOrderO o2) {
                if (o1.getCreateTime().compareTo(o2.getCreateTime()) == 1) {
                    return -1;
                }
                if (o1.getCreateTime().compareTo(o2.getCreateTime()) == 0) {
                    return 0;
                }
                return 1;
            }
        });

        System.out.println("排序后：" + JSON.toJSONString(orderOList1));

        reMap.put("code","200");
        reMap.put("info","ok");
        reMap.put("result",orderOList1);
        String string = JSON.toJSONString(reMap);
        log.info(string);
        return string;
    }

    @Override
    public List<XcOrderO> orderListRedis(String userId) {
        //获取所有的用户信息
        Map<String,Object> reMap = new HashMap<>();
        if(userId == null || userId.equals("")){
            reMap.put("code","500");
            reMap.put("info","用户信息格式错误...");
            String string = JSON.toJSONString(reMap);
            log.info(string);
            return null;
        }

        //获取redis中的信息
        OrderList orderlist = (OrderList) redisUtil.hget("ORDERINFO","ORDERLIST");
        if (orderlist == null){
            orderlist = new OrderList();
        }
        List<XcOrderO> xcOrderOList = orderlist.getXcOrderOList();
        if (xcOrderOList == null){
            xcOrderOList =  new ArrayList<>();
        }

        List<XcOrderO> orderOList = new ArrayList<>();
        for (XcOrderO xcOrderO:xcOrderOList){
            if (xcOrderO.getUserId().equals(userId)){
                orderOList.add(xcOrderO);
            }
        }

        String string = JSON.toJSONString(orderOList);
        log.info("redis中的信息:" + string);

        return orderOList;
    }

    @Override
    public List<XcOrderU> orderListUserMysql(Integer userId) {
        //获取所有的用户信息
        Map<String,Object> reMap = new HashMap<>();
        if(userId == null || userId == 0){
            reMap.put("code","500");
            reMap.put("info","用户信息格式错误...");
            String string = JSON.toJSONString(reMap);
            log.info(string);
            return null;
        }

        //获取mysql中的信息
        XcOrderUExample xcOrderUExample = new XcOrderUExample();
        XcOrderUExample.Criteria criteria = xcOrderUExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        List<XcOrderU> xcOrderUList = xcOrderUMapper.selectByExample(xcOrderUExample);

        String string = JSON.toJSONString(xcOrderUList);
        log.info("数据库中的信息:" + string);

        return xcOrderUList;
    }

    @Override
    public List<XcOrderO> orderListShopMysql(String userId) {
        Map<String,Object> reMap = new HashMap<>();
        if(userId == null || userId.equals("")){
            reMap.put("code","500");
            reMap.put("info","用户信息格式错误...");
            String string = JSON.toJSONString(reMap);
            log.info(string);
            return null;
        }

        //获取mysql中的信息
        XcOrderOExample xcOrderOExample = new XcOrderOExample();
        XcOrderOExample.Criteria criteria = xcOrderOExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        List<XcOrderO> xcOrderOList = xcOrderOMapper.selectByExample(xcOrderOExample);

        String string = JSON.toJSONString(xcOrderOList);
        log.info("数据库中的信息:" + string);
        return xcOrderOList;
    }

}
