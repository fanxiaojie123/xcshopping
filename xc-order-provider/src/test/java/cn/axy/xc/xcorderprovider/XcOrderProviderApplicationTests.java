package cn.axy.xc.xcorderprovider;

import cn.axy.xc.xcorderprovider.dao.XcOrderODao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class XcOrderProviderApplicationTests {

    @Autowired
    private XcOrderODao xcOrderO;
    @Test
    public void contextLoads() {
        int i = xcOrderO.selectAll();
        System.out.println("===================");
        System.out.println(i);
        System.out.println("===================");
    }
}
