package cn.axy.xc.xcitemshowconsumer.service;

import cn.axy.xc.xcitemshowconsumer.service.impl.Closeleserviceimpl;
import org.apache.solr.client.solrj.SolrServerException;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;

@FeignClient(name = "xc-item-show-provider",fallback = Closeleserviceimpl.class)
public interface Closeleservice {
    @RequestMapping(value = "/upsolrclo",method = RequestMethod.POST)
    String upsolrclo() throws IOException, SolrServerException;
    @RequestMapping(value = "/upsolrcos",method = RequestMethod.POST)
    String upsolrcos() throws IOException, SolrServerException;
    @RequestMapping(value = "/upsolrfoo",method = RequestMethod.POST)
    String upsolrfoo() throws IOException, SolrServerException;
    @RequestMapping(value = "/solrmes",method = RequestMethod.POST)
    String upsolrmes() throws IOException, SolrServerException;
    @RequestMapping(value = "/upsolrorn",method = RequestMethod.POST)
    String upsolrorn() throws IOException, SolrServerException;
    @RequestMapping(value = "/solrSKU",method = RequestMethod.POST)
    String upsolrSKU() throws IOException, SolrServerException;

}
