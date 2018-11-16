package cn.axy.xc.xcitemshowprovider.dao.impl;

import cn.axy.xc.xcitemshowprovider.dao.Foopricedao;
import cn.axy.xc.xcitemshowprovider.pojo.Cosmetics;
import cn.axy.xc.xcitemshowprovider.pojo.Food;
import cn.axy.xc.xcitemshowprovider.pojo.Skupricesolr;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.params.ModifiableSolrParams;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Foopricesolrimpl implements Foopricedao {
    private static final String solrUrl="http://localhost:8983/solr/foo";
    //创建solrClient同时指定超时时间，不指定走默认配置
    private static HttpSolrClient client1=new HttpSolrClient.Builder(solrUrl)
            .withConnectionTimeout(10000)
            .withSocketTimeout(60000).build();
    @Override
    public List<Food> fooprice(Skupricesolr skupricesolr) throws Exception {
        SolrQuery solrQuery = new SolrQuery();
        //设置关键字
        solrQuery.setQuery(skupricesolr.getmId());
        //设置默认搜索域
        solrQuery.set("df", "product_keywords");
        //设置过滤条件
        ModifiableSolrParams params = new ModifiableSolrParams();
        SolrQuery filterQuery = new SolrQuery();
        filterQuery.addFilterQuery("fq","mId:"+ skupricesolr.getmId());
        filterQuery.addFilterQuery("fq","fColor:"+ skupricesolr.getmColor());
        filterQuery.addFilterQuery("fq","fSize:"+ skupricesolr.getmSize());
        solrQuery.set("fl", "id,fPrice,fCount,mId");
        // 执行查询
        QueryResponse response = client1.query(solrQuery);
        // 文档结果集
        SolrDocumentList docs = response.getResults();
        List<Food> foods = new ArrayList<Food>();
        for (SolrDocument doc : docs) {
            Food food = new Food();
            food.setId( Integer.parseInt((String) doc.get("id")) );
            food.setmPrice(Double.parseDouble((String) doc.get("fPrice")));
            food.setmCount(Double.parseDouble((String) doc.get("fCount")));
            food.setmId(Integer.parseInt((String) doc.get("mId")));
            foods.add(food);
        }
        return foods;
    }
}
