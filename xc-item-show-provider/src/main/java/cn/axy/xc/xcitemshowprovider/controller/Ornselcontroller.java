package cn.axy.xc.xcitemshowprovider.controller;

import cn.axy.xc.xcitemshowprovider.service.Ornselservice;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.solr.client.solrj.SolrServerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
@Api(value="/upsolrorn", tags="更新首饰solr接口")
@RestController
public class Ornselcontroller {
    @Autowired
    private Ornselservice ornselservice;
    /**
     *更新首饰SOLR
     * @return
     * @throws IOException
     * @throws SolrServerException
     */
    @ApiOperation(value="更新首饰solr接口", notes = "更新首饰solr接口")
    @RequestMapping(value = "/upsolrorn",method = RequestMethod.POST)
    public String upsolrorn() throws IOException, SolrServerException {
        String upsolrorn = ornselservice.upsolrorn();
        return upsolrorn;
    }
}
