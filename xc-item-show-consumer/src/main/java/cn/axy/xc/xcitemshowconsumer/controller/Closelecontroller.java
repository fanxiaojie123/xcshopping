package cn.axy.xc.xcitemshowconsumer.controller;

import cn.axy.xc.xcitemshowconsumer.service.Closeleservice;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.solr.client.solrj.SolrServerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
@Api(value="/upsolr", tags="更新solr接口")
@RestController
public class Closelecontroller {
    @Autowired
    private Closeleservice closeleservice;

    /**
     * 更新服装SOLR
     * @return
     * @throws IOException
     * @throws SolrServerException
     */
    @ApiOperation(value="更新服装solr接口", notes = "更新服装solr接口")
    @RequestMapping(value = "/upsolrclo",method = RequestMethod.POST)
    public String upsolrclo() throws IOException, SolrServerException {
        return closeleservice.upsolrclo();
    }

    /**
     *更新化妆品SOLR
     * @return
     * @throws IOException
     * @throws SolrServerException
     */
    @ApiOperation(value="更新化妆品solr接口", notes = "更新化妆品solr接口")
    @RequestMapping(value = "/upsolrcos",method = RequestMethod.POST)
    String upsolrcos() throws IOException, SolrServerException{
        return closeleservice.upsolrcos();
    }

    /**
     *更新食品SOLR
     * @return
     * @throws IOException
     * @throws SolrServerException
     */
    @ApiOperation(value="更新食品solr接口", notes = "更新食品solr接口")
    @RequestMapping(value = "/upsolrfoo",method = RequestMethod.POST)
    String upsolrfoo() throws IOException, SolrServerException{
        return closeleservice.upsolrfoo();
    }

    /**
     *更新商品SOLR
     * @return
     * @throws IOException
     * @throws SolrServerException
     */
    @ApiOperation(value="更新商品详情solr接口", notes = "更新商品详情solr接口")
    @RequestMapping(value = "/solrmes",method = RequestMethod.POST)
    String upsolrmes() throws IOException, SolrServerException{
        return closeleservice.upsolrmes();
    }

    /**
     *更新首饰SOLR
     * @return
     * @throws IOException
     * @throws SolrServerException
     */
    @ApiOperation(value="更新首饰solr接口", notes = "更新首饰solr接口")
    @RequestMapping(value = "/upsolrorn",method = RequestMethod.POST)
    public String upsolrorn() throws IOException, SolrServerException{
        return closeleservice.upsolrorn();
    }

    /**
     * 更新SKU SOLR
     * @return
     * @throws IOException
     * @throws SolrServerException
     */
    @ApiOperation(value="更新SKU接口", notes = "更新SKU接口")
    @RequestMapping(value = "/solrSKU",method = RequestMethod.POST)
    public String upsolrSKU() throws IOException, SolrServerException{
        return closeleservice.upsolrSKU();
    }
}
