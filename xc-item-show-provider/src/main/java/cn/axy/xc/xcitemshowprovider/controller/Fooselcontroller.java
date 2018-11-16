package cn.axy.xc.xcitemshowprovider.controller;

import cn.axy.xc.xcitemshowprovider.service.Fooselservice;
import org.apache.solr.client.solrj.SolrServerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class Fooselcontroller {
    @Autowired
    private Fooselservice fooselservice;
    @RequestMapping("/upsolrfoo")
    public String upsolrfoo() throws IOException, SolrServerException {
        String upsolr = fooselservice.upsolrfoo();
        return upsolr;
    }
}
