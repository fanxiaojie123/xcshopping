package cn.axy.xc.xcitemshowprovider.controller;

import cn.axy.xc.xcitemshowprovider.service.Messageselservice;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.solr.client.solrj.SolrServerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
@Api(value="/upsolrfoo", tags="更新商品详情solr接口")
@RestController
public class Messageselcontroller {
    @Autowired
    private Messageselservice messageselservice;
    /**
     *更新商品SOLR
     * @return
     * @throws IOException
     * @throws SolrServerException
     */
    @ApiOperation(value="更新商品详情solr接口", notes = "更新商品详情solr接口")
    @RequestMapping(value = "/solrmes",method = RequestMethod.POST)
    public String upsolrmes() throws IOException, SolrServerException {
        String upsolr = messageselservice.upsolr();
        return upsolr;
    }
}
