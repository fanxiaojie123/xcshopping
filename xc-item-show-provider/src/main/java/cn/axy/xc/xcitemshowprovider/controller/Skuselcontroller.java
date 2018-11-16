package cn.axy.xc.xcitemshowprovider.controller;

import cn.axy.xc.xcitemshowprovider.service.Skuselservice;
import org.apache.solr.client.solrj.SolrServerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class Skuselcontroller {
    @Autowired
    private Skuselservice skuselservice;
    @RequestMapping("solr1")
    public String upsolr1() throws IOException, SolrServerException {
        String upsolr = skuselservice.upsolr1();
        return upsolr;
    }
}
