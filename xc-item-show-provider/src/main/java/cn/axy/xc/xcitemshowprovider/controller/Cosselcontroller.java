package cn.axy.xc.xcitemshowprovider.controller;

import cn.axy.xc.xcitemshowprovider.service.Closelservice;
import cn.axy.xc.xcitemshowprovider.service.Cosselservice;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.solr.client.solrj.SolrServerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
@Api(value="/upsolr1", tags="更新化妆品solr接口")
@RestController
public class Cosselcontroller {
    @Autowired
    private Cosselservice cosselservice;
    @ApiOperation(value="更新化妆品solr接口", notes = "更新化妆品solr接口")
    @RequestMapping(value = "/upsolr1",method = RequestMethod.POST)
    public String upsolrcos() throws IOException, SolrServerException {
        String upsolr = cosselservice.upsolrcos();
        return upsolr;
    }
}
