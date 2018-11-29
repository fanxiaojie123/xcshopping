package cn.axy.xc.xcorderprovider;

import cn.axy.xc.xcorderprovider.dao.XcOrderItemMapper;
import cn.axy.xc.xcorderprovider.dao.XcOrderODao;
import cn.axy.xc.xcorderprovider.dao.XcOrderOMapper;
import cn.axy.xc.xcorderprovider.pojo.OrderInfo;
import cn.axy.xc.xcorderprovider.pojo.XcOrderItem;
import cn.axy.xc.xcorderprovider.pojo.XcOrderO;
import cn.axy.xc.xcorderprovider.pojo.XcOrderOExample;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class XcOrderProviderApplicationTests {
    @Autowired
    private XcOrderODao xcOrderODao;


    @Autowired
    private XcOrderOMapper xcOrderOMapper;


    @Test
    public void contextLoads() {
        List<XcOrderO> shopOrder = xcOrderODao.getShopOrder("200");
        System.out.println(shopOrder.size());
        System.out.println(JSON.toJSONString(shopOrder));



    }



    @Test
    public void contextLoads111() {

        XcOrderOExample xcOrderOExample = new XcOrderOExample();
        XcOrderOExample.Criteria criteria = xcOrderOExample.createCriteria();
        criteria.andUserIdEqualTo("200");

        List<XcOrderO> orderOList = xcOrderOMapper.selectByExample(xcOrderOExample);
        System.out.println(orderOList.size() + "=================");
        System.out.println(JSON.toJSONString(orderOList) + "=================");
    }


    @Test
    public void contextLoads222() {

    }
}
