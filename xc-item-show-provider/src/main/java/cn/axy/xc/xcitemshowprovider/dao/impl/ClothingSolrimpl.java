package cn.axy.xc.xcitemshowprovider.dao.impl;

import cn.axy.xc.xcitemshowprovider.dao.Clothingsolrdao;
import cn.axy.xc.xcitemshowprovider.pojo.Clothing;
import cn.axy.xc.xcitemshowprovider.pojo.Skusolr;
import cn.axy.xc.xcitemshowprovider.service.exit.Skuservicepojo;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class ClothingSolrimpl implements Clothingsolrdao {
    private static final String solrUrl="http://localhost:8983/solr/clo";
    //创建solrClient同时指定超时时间，不指定走默认配置
    private static HttpSolrClient client1=new HttpSolrClient.Builder(solrUrl)
            .withConnectionTimeout(10000)
            .withSocketTimeout(60000).build();
    @Override
    public List<Clothing> clo(Skusolr skusolr) throws Exception {
        SolrQuery solrQuery = new SolrQuery();
        //设置关键字
        solrQuery.setQuery(skusolr.getSkuid());
        //设置默认搜索域
        solrQuery.set("df", "product_keywords");
        //设置过滤条件
        if(null != skusolr.getSkuid() && !"".equals(skusolr.getSkuid())){
            solrQuery.set("fq", "mId:" + skusolr.getSkuid());
        }
        solrQuery.set("fl", "id,cSize,cColor,mId,cPrice,cCount,mPrice,mCount");
        // 执行查询
        QueryResponse response = client1.query(solrQuery);
        // 文档结果集
        SolrDocumentList docs = response.getResults();
        List<Clothing> clothing = new ArrayList<Clothing>();
        for (SolrDocument doc : docs) {
            Clothing clothing1 = new Clothing();
            clothing1.setId(Long.parseLong((String) doc.get("id")) );
            clothing1.setcColor((String) doc.get("cColor"));
            clothing1.setcSize((String) doc.get("cSize"));
            clothing1.setcPrice(Double.parseDouble((String) doc.get("cPrice")));
            clothing1.setcCount(Double.parseDouble((String) doc.get("cCount")));
            clothing1.setmId(Integer.parseInt((String) doc.get("mId")));
            clothing1.setmPrice(Double.parseDouble((String) doc.get("mPrice")) );
            clothing1.setmCount(Double.parseDouble((String) doc.get("mCount")));
            clothing.add(clothing1);
        }
        return clothing;
    }
    public List<Skuservicepojo> closku(String skuid) throws Exception {
        SolrQuery solrQuery = new SolrQuery();
        //设置关键字
        solrQuery.setQuery(skuid);
        //设置默认搜索域
        solrQuery.set("df", "product_keywords");
        //设置过滤条件
        if(null != skuid && !"".equals(skuid)){
            solrQuery.set("fq", "id:" + skuid);
        }
        solrQuery.set("fl", "id,cSize,cColor,mId,cPrice,cCount,mPrice,mCount,mPicture,mPoints");
        // 执行查询
        QueryResponse response = client1.query(solrQuery);
        // 文档结果集
        SolrDocumentList docs = response.getResults();
        List<Skuservicepojo> clothing = new ArrayList<Skuservicepojo>();
        for (SolrDocument doc : docs) {
            Skuservicepojo clothing1 = new Skuservicepojo();
            clothing1.setCid(Long.parseLong((String) doc.get("id")) );
            clothing1.setcColor((String) doc.get("cColor"));
            clothing1.setcSize((String) doc.get("cSize"));
            clothing1.setcPrice(Double.parseDouble((String) doc.get("cPrice")));
            clothing1.setcCount(Double.parseDouble((String) doc.get("cCount")));
            clothing1.setmId(Integer.parseInt((String) doc.get("mId")));
            clothing1.setmPrice(Double.parseDouble((String) doc.get("mPrice")) );
            clothing1.setmCount(Double.parseDouble((String) doc.get("mCount")));
            clothing1.setmPicture((String) doc.get("mPicture"));
            clothing1.setmPoints((String) doc.get("mPoints"));
            clothing.add(clothing1);
        }
        return clothing;
    }
}
