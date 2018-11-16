package cn.axy.xc.xcitemshowprovider.service;

import org.apache.solr.client.solrj.SolrServerException;

import java.io.IOException;

public interface Messageselservice {
    //solr更新数据
    String upsolr() throws IOException, SolrServerException;
}
