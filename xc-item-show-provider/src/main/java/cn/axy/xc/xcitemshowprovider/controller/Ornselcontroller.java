package cn.axy.xc.xcitemshowprovider.controller;

import cn.axy.xc.xcitemshowprovider.service.Ornselservice;
import org.apache.solr.client.solrj.SolrServerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class Ornselcontroller {
    @Autowired
    private Ornselservice ornselservice;
    @RequestMapping("/upsolrorn")
    public String upsolrorn() throws IOException, SolrServerException {
        String upsolrorn = ornselservice.upsolrorn();
        return upsolrorn;
    }
}
