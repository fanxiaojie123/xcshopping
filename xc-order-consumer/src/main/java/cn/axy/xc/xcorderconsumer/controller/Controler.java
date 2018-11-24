package cn.axy.xc.xcorderconsumer.controller;


import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class Controler {

    @RequestMapping("/login")
    public String aaa(){
        Map<String,Object> reMap = new HashMap<>();

        reMap.put("userId",12300);
        reMap.put("userName","王小明");

        String re = JSON.toJSONString(reMap);

        return re;
    }

    @RequestMapping("/fangwen")
    public String fangwen(HttpServletRequest request){
        String token1 = request.getHeader("token");

        return token1;
    }

}
