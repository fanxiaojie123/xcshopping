package cn.axy.xc.xcitemshowconsumer.service.impl;

import cn.axy.xc.xcitemshowconsumer.service.FeignTest;
import org.springframework.stereotype.Component;

@Component
public class FeignTestImpl implements FeignTest {

    @Override
    public String test() {
        return "找不到客户端啊啊啊啊啊啊啊！！！";
    }
}
