package cn.axy.xc.xcitemshowprovider.controller;

import cn.axy.xc.xcitemshowprovider.service.Closelservice;
import org.apache.solr.client.solrj.SolrServerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
@RestController
public class Closelcontroller {
    @Autowired
    private Closelservice closelservice;
    @RequestMapping("upsolrclo")
    public String upsolrclo() throws IOException, SolrServerException {
        String upsolr = closelservice.upsolrclo();
        return upsolr;
    }
}
