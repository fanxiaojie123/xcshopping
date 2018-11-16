package cn.axy.xc.xcitemshowprovider.dao.impl;

import cn.axy.xc.xcitemshowprovider.dao.Skusolrdao;
import cn.axy.xc.xcitemshowprovider.pojo.Appliances;
import cn.axy.xc.xcitemshowprovider.pojo.Skusolr;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AppliancesSolrdao implements Skusolrdao {
    private static final String solrUrl="http://localhost:8983/solr/zl";
    //创建solrClient同时指定超时时间，不指定走默认配置
    private static HttpSolrClient client1=new HttpSolrClient.Builder(solrUrl)
            .withConnectionTimeout(10000)
            .withSocketTimeout(60000).build();
    @Override
    public List<Appliances> searchProduct(Skusolr skusolr) throws Exception {
        SolrQuery solrQuery = new SolrQuery();
        //设置关键字
        solrQuery.setQuery(skusolr.getSkuid());
        //设置默认搜索域
        solrQuery.set("df", "product_keywords");
        //设置过滤条件
        if(null != skusolr.getSkuid() && !"".equals(skusolr.getSkuid())){
            solrQuery.set("fq", "mId:" + skusolr.getSkuid());
        }
        solrQuery.set("fl", "id,aSize,aColor,mPrice,mCount,mId");
        // 执行查询
        QueryResponse response = client1.query(solrQuery);
        // 文档结果集
        SolrDocumentList docs = response.getResults();
        List<Appliances> appliances = new ArrayList<Appliances>();
        for (SolrDocument doc : docs) {
            Appliances appliances1 = new Appliances();
            appliances1.setId( Integer.parseInt((String) doc.get("id")) );
            appliances1.setaColor((String) doc.get("aColor"));
            appliances1.setaSize((String) doc.get("aSize"));
            appliances1.setmId(Integer.parseInt((String) doc.get("mId")));
            appliances1.setmPrice(Double.parseDouble((String) doc.get("mPrice")));
            appliances1.setmCount(Double.parseDouble((String) doc.get("mCount")));
            appliances.add(appliances1);
        }
        return appliances;
    }
}
