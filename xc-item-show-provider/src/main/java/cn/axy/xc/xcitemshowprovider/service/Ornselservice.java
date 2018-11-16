package cn.axy.xc.xcitemshowprovider.service;

import org.apache.solr.client.solrj.SolrServerException;

import java.io.IOException;

public interface Ornselservice {
    //solr更新数据
    String upsolrorn() throws IOException, SolrServerException;
}
