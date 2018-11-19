package cn.axy.xc.xcitemshowconsumer.service;

import cn.axy.xc.xcitemshowconsumer.pojo.Messagesolr;
import cn.axy.xc.xcitemshowconsumer.service.impl.Messageseleserviceimpl;
import io.swagger.annotations.ApiParam;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Component
@FeignClient(name = "xc-item-show-provider",fallback = Messageseleserviceimpl.class)
public interface Messageseleservice {
    @RequestMapping(value="/list",method = RequestMethod.POST)
    String searchProduct(@ApiParam(name = "messagesolr",value = "查询输入字段")Messagesolr messagesolr ,
                                @ApiParam(name = "model",value = "页面数据")Model model) throws Exception;
}
