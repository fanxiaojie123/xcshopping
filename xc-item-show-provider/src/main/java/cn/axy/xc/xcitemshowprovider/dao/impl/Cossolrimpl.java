package cn.axy.xc.xcitemshowprovider.dao.impl;

import cn.axy.xc.xcitemshowprovider.dao.CosSolrdao;
import cn.axy.xc.xcitemshowprovider.pojo.Clothing;
import cn.axy.xc.xcitemshowprovider.pojo.Cosmetics;
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
public class Cossolrimpl implements CosSolrdao {
    private static final String solrUrl="http://localhost:8983/solr/cos";
    //创建solrClient同时指定超时时间，不指定走默认配置
    private static HttpSolrClient client1=new HttpSolrClient.Builder(solrUrl)
            .withConnectionTimeout(10000)
            .withSocketTimeout(60000).build();
    @Override
    public List<Cosmetics> cos(Skusolr skusolr) throws Exception {
        SolrQuery solrQuery = new SolrQuery();
        //设置关键字
        solrQuery.setQuery(skusolr.getSkuid());
        //设置默认搜索域
        solrQuery.set("df", "product_keywords");
        //设置过滤条件
        if(null != skusolr.getSkuid() && !"".equals(skusolr.getSkuid())){
            solrQuery.set("fq", "mId:" + skusolr.getSkuid());
        }
        solrQuery.set("fl", "id,coSize,coColor,coPrice,coCount,mId,mPrice,mCount");
        // 执行查询
        QueryResponse response = client1.query(solrQuery);
        // 文档结果集
        SolrDocumentList docs = response.getResults();
        List<Cosmetics> cosmetics = new ArrayList<Cosmetics>();
        for (SolrDocument doc : docs) {
            Cosmetics cosmetics1 = new Cosmetics();
            cosmetics1.setId(Integer.parseInt((String) doc.get("id")));
            cosmetics1.setCoColor((String) doc.get("coColor"));
            cosmetics1.setCoSize((String) doc.get("coSize"));
            cosmetics1.setCoPrice(Double.parseDouble((String) doc.get("coPrice")));
            cosmetics1.setCoCount(Double.parseDouble((String) doc.get("coCount")));
            cosmetics1.setmId(Integer .parseInt((String) doc.get("mId")));
            cosmetics1.setmPrice(Double.parseDouble((String) doc.get("mPrice")));
            cosmetics1.setmCount(Double.parseDouble((String) doc.get("mCount")));
            cosmetics.add(cosmetics1);
        }
        return cosmetics;
    }
}
