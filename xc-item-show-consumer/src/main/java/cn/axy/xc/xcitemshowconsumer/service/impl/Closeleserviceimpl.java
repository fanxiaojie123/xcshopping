package cn.axy.xc.xcitemshowconsumer.service.impl;

import cn.axy.xc.xcitemshowconsumer.service.Closeleservice;
import org.apache.solr.client.solrj.SolrServerException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
@Component
public class Closeleserviceimpl implements Closeleservice {
    @Override
    public String upsolrclo() throws IOException, SolrServerException{
        return "找不到客户端啊啊啊啊啊啊啊！！！";
    }

    @Override
    public String upsolrcos() throws IOException, SolrServerException{
        return "找不到客户端啊啊啊啊啊啊啊！！！";
    }

    @Override
    public String upsolrfoo() throws IOException, SolrServerException {
        return "找不到客户端啊啊啊啊啊啊啊！！！";
    }

    @Override
    public String upsolrmes() throws IOException, SolrServerException {
        return "找不到客户端啊啊啊啊啊啊啊！！！";
    }

    @Override
    public String upsolrorn() throws IOException, SolrServerException {
        return "找不到客户端啊啊啊啊啊啊啊！！！";
    }

    @Override
    public String upsolrSKU() throws IOException, SolrServerException {
        return "找不到客户端啊啊啊啊啊啊啊！！！";
    }
}
