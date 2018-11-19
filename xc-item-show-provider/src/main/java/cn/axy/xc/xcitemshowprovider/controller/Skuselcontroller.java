package cn.axy.xc.xcitemshowprovider.controller;

import cn.axy.xc.xcitemshowprovider.service.Skuselservice;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.solr.client.solrj.SolrServerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
@Api(value="/solr1", tags="更新SKU接口")
@RestController
public class Skuselcontroller {
    @Autowired
    private Skuselservice skuselservice;
    /**
     * 更新SKU SOLR
     * @return
     * @throws IOException
     * @throws SolrServerException
     */
    @ApiOperation(value="更新SKU接口", notes = "更新SKU接口")
    @RequestMapping(value = "/solrSKU",method = RequestMethod.POST)
    public String upsolrSKU() throws IOException, SolrServerException {
        String upsolr = skuselservice.upsolr1();
        return upsolr;
    }
}
