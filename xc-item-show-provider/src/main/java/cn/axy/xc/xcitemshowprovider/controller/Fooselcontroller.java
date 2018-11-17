package cn.axy.xc.xcitemshowprovider.controller;

import cn.axy.xc.xcitemshowprovider.service.Fooselservice;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.solr.client.solrj.SolrServerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
@Api(value="/upsolrfoo", tags="更新食品solr接口")
@RestController
public class Fooselcontroller {
    @Autowired
    private Fooselservice fooselservice;
    @ApiOperation(value="更新食品solr接口", notes = "更新食品solr接口")
    @RequestMapping(value = "/upsolrfoo",method = RequestMethod.POST)
    public String upsolrfoo() throws IOException, SolrServerException {
        String upsolr = fooselservice.upsolrfoo();
        return upsolr;
    }
}
