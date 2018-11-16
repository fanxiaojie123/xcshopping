package cn.axy.xc.xcitemshowprovider.service;

import org.apache.solr.client.solrj.SolrServerException;

import java.io.IOException;

public interface Cosselservice {
    String upsolrcos() throws IOException, SolrServerException;
}
