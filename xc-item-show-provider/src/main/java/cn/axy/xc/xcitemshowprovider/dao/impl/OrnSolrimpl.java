package cn.axy.xc.xcitemshowprovider.dao.impl;

import cn.axy.xc.xcitemshowprovider.dao.OrnSolrdao;
import cn.axy.xc.xcitemshowprovider.pojo.Food;
import cn.axy.xc.xcitemshowprovider.pojo.Ornaments;
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
public class OrnSolrimpl implements OrnSolrdao {
    private static final String solrUrl="http://localhost:8983/solr/orn";
    //创建solrClient同时指定超时时间，不指定走默认配置
    private static HttpSolrClient client1=new HttpSolrClient.Builder(solrUrl)
            .withConnectionTimeout(10000)
            .withSocketTimeout(60000).build();
    @Override
    public List<Ornaments> orn(Skusolr skusolr) throws Exception {
        SolrQuery solrQuery = new SolrQuery();
        //设置关键字
        solrQuery.setQuery(skusolr.getSkuid());
        //设置默认搜索域
        solrQuery.set("df", "product_keywords");
        //设置过滤条件
        if (null != skusolr.getSkuid() && !"".equals(skusolr.getSkuid())) {
            solrQuery.set("fq", "mId:" + skusolr.getSkuid());
        }
        solrQuery.set("fl", "id,oSize,oColor,mId,oPrice,oCount,mPrice,mCount");
        // 执行查询
        QueryResponse response = client1.query(solrQuery);
        // 文档结果集
        SolrDocumentList docs = response.getResults();
        List<Ornaments> ornaments = new ArrayList<Ornaments>();
        for (SolrDocument doc : docs) {
            Ornaments ornaments1 = new Ornaments();
            ornaments1.setId(Integer.parseInt((String) doc.get("id")) );
            ornaments1.setoColor((String) doc.get("oColor"));
            ornaments1.setoSize((String) doc.get("oSize"));
            ornaments1.setmId((Integer) doc.get("mId"));
            ornaments1.setoPrice(Double.parseDouble((String) doc.get("oPrice")));
            ornaments1.setoCount(Double.parseDouble((String) doc.get("oCount")));
            ornaments1.setmPrice(Double.parseDouble((String) doc.get("mPrice")));
            ornaments1.setmCount(Double.parseDouble((String) doc.get("mCount")));
            ornaments.add(ornaments1);
        }
        return ornaments;
    }
}
