package cn.axy.xc.xcitemshowprovider.controller;

import cn.axy.xc.xcitemshowprovider.service.Messageselservice;
import org.apache.solr.client.solrj.SolrServerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class Messageselcontroller {
    @Autowired
    private Messageselservice messageselservice;
    @RequestMapping("solr")
    public String upsolr() throws IOException, SolrServerException {
        String upsolr = messageselservice.upsolr();
        return upsolr;
    }
}
