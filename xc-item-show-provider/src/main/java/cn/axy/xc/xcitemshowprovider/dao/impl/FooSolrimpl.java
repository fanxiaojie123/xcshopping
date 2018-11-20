package cn.axy.xc.xcitemshowprovider.dao.impl;

import cn.axy.xc.xcitemshowprovider.dao.FooSolrdao;
import cn.axy.xc.xcitemshowprovider.pojo.Food;
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
public class FooSolrimpl implements FooSolrdao {
        private static final String solrUrl="http://localhost:8983/solr/foo";
        //创建solrClient同时指定超时时间，不指定走默认配置
        private static HttpSolrClient client1=new HttpSolrClient.Builder(solrUrl)
                .withConnectionTimeout(10000)
                .withSocketTimeout(60000).build();
        @Override
        public List<Food> foo(Skusolr skusolr) throws Exception {
            SolrQuery solrQuery = new SolrQuery();
            //设置关键字
            solrQuery.setQuery(skusolr.getSkuid());
            //设置默认搜索域
            solrQuery.set("df", "product_keywords");
            //设置过滤条件
            if(null != skusolr.getSkuid() && !"".equals(skusolr.getSkuid())){
                solrQuery.set("fq", "mId:" + skusolr.getSkuid());
            }
            solrQuery.set("fl", "id,fSize,fColor,fPrice,fCount,mId,mPrice,mCount");
            // 执行查询
            QueryResponse response = client1.query(solrQuery);
            // 文档结果集
            SolrDocumentList docs = response.getResults();
            List<Food> foods = new ArrayList<Food>();
        for (SolrDocument doc : docs) {
            Food food = new Food();
            food.setId(Long.parseLong((String) doc.get("id")));
            food.setfColor((String) doc.get("fColor"));
            food.setfSize((String) doc.get("fSize"));
            food.setfPrice(Double.parseDouble((String) doc.get("fPrice")));
            food.setfCount(Double.parseDouble((String) doc.get("fCount")));
            food.setmId(Integer.parseInt((String) doc.get("mId")));
            food.setmPrice(Double.parseDouble((String) doc.get("mPrice")));
            food.setmCount(Double.parseDouble((String) doc.get("mCount")));
            foods.add(food);
        }
        return foods;
    }



    public List<Skuservicepojo> foosku(String skuid) throws Exception {
        SolrQuery solrQuery = new SolrQuery();
        //设置关键字
        solrQuery.setQuery(skuid);
        //设置默认搜索域
        solrQuery.set("df", "product_keywords");
        //设置过滤条件
        if(null != skuid && !"".equals(skuid)){
            solrQuery.set("fq", "id:" + skuid);
        }
        solrQuery.set("fl", "id,fSize,fColor,fPrice,fCount,mId,mPrice,mCount,mPicture,mPoints");
        // 执行查询
        QueryResponse response = client1.query(solrQuery);
        // 文档结果集
        SolrDocumentList docs = response.getResults();
        List<Skuservicepojo> foods = new ArrayList<Skuservicepojo>();
        for (SolrDocument doc : docs) {
            Skuservicepojo food = new Skuservicepojo();
            food.setFid(Long.parseLong((String) doc.get("id")));
            food.setfColor((String) doc.get("fColor"));
            food.setfSize((String) doc.get("fSize"));
            food.setfPrice(Double.parseDouble((String) doc.get("fPrice")));
            food.setfCount(Double.parseDouble((String) doc.get("fCount")));
            food.setmId(Integer.parseInt((String) doc.get("mId")));
            food.setmPrice(Double.parseDouble((String) doc.get("mPrice")));
            food.setmCount(Double.parseDouble((String) doc.get("mCount")));
            food.setmPicture((String) doc.get("mPicture"));
            food.setmPoints((String) doc.get("mPoints"));
            foods.add(food);
        }
        return foods;
    }
}
