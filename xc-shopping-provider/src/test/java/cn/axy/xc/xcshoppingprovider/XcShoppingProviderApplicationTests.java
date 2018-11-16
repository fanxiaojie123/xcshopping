package cn.axy.xc.xcshoppingprovider;

import cn.axy.xc.xcshoppingprovider.util.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class XcShoppingProviderApplicationTests {

    //@Autowired
    //private RedisUtil redisUtil;

    @Test
    public void contextLoads() {

       /* List<String> list =  new ArrayList<>();
        list.add("123");
        redisUtil.lSet("123",list);

        List<Object> objects = redisUtil.lGet("123", 0, -1);
        for (Object o :objects){

           String s =   (String)o;

            System.out.println(s);

        }*/


    }

}
