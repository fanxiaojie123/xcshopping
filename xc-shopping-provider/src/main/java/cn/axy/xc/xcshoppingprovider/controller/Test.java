package cn.axy.xc.xcshoppingprovider.controller;


import cn.axy.xc.xcshoppingprovider.pojo.ABC;
import cn.axy.xc.xcshoppingprovider.pojo.ShoppingCart;
import com.alibaba.fastjson.JSON;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {


    @RequestMapping(value = "/aa")
    public String aa(@Param("aa") ABC aa, @Param("bb")ABC bb){

        System.out.println(JSON.toJSONString(aa));
        System.out.println(JSON.toJSONString(bb));

        return "sss";
    }
}
