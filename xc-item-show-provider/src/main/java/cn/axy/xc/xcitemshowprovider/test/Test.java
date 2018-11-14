package cn.axy.xc.xcitemshowprovider.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public String test(){
       return "test";
    }
}
