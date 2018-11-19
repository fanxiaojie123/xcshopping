package cn.axy.xc.xcitemshowprovider.controller;

import cn.axy.xc.xcitemshowprovider.service.Closelservice;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.solr.client.solrj.SolrServerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@Api(value="/upsolrclo", tags="更新服装solr接口")
@RestController
public class Closelcontroller {
    @Autowired
    private Closelservice closelservice;
    /**
     * 更新服装SOLR
     * @return
     * @throws IOException
     * @throws SolrServerException
     */
    @ApiOperation(value="更新服装solr接口", notes = "更新服装solr接口")
    @RequestMapping(value = "/upsolrclo",method = RequestMethod.POST)
    private String upsolrclo() throws IOException, SolrServerException {
        String upsolr = closelservice.upsolrclo();
        return upsolr;
    }
}
