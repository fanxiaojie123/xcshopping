package cn.axy.xc.xcitemshowprovider.controller;

import cn.axy.xc.xcitemshowprovider.service.Closelservice;
import cn.axy.xc.xcitemshowprovider.service.Cosselservice;
import org.apache.solr.client.solrj.SolrServerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class Cosselcontroller {
    @Autowired
    private Cosselservice cosselservice;
    @RequestMapping("/upsolr1")
    public String upsolrcos() throws IOException, SolrServerException {
        String upsolr = cosselservice.upsolrcos();
        return upsolr;
    }
}
