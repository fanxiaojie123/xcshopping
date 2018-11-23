package cn.axy.xc.xcitemshowprovider.dao.impl;

import cn.axy.xc.xcitemshowprovider.dao.MessageSolrdao;
import cn.axy.xc.xcitemshowprovider.pojo.Messagegetallsolr;
import cn.axy.xc.xcitemshowprovider.pojo.Messagesolr;
import cn.axy.xc.xcitemshowprovider.pojo.Messagesolrpojo;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.params.ModifiableSolrParams;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class MessageSolrimpl implements MessageSolrdao {
    private static final String solrUrl="http://localhost:8983/solr/zhangli";
    //创建solrClient同时指定超时时间，不指定走默认配置
    private static HttpSolrClient client=new HttpSolrClient.Builder(solrUrl)
            .withConnectionTimeout(10000)
            .withSocketTimeout(60000).build();
    @Override
    public List<Messagesolrpojo> searchProduct(Messagesolr messagesolr) throws Exception {
//        ModifiableSolrParams params = new ModifiableSolrParams();
        SolrQuery solrQuery = new SolrQuery();
        //设置关键字
        solrQuery.setQuery(messagesolr.getQueryString());
        //设置默认搜索域
        solrQuery.set("df", "product_keywords");
        //设置过滤条件
//        if(null != messagesolr.getCatalog_name() && !"".equals(messagesolr.getCatalog_name())){
//            solrQuery.set("fq", "product_catalog_name:" + messagesolr.getCatalog_name());
//        }
        ModifiableSolrParams params = new ModifiableSolrParams();
        SolrQuery filterQuery = new SolrQuery();
        filterQuery.addFilterQuery("fq","mName:"+messagesolr.getCatalog_name());
        filterQuery.addFilterQuery("fq","searchCategoryName:"+messagesolr.getType());
        filterQuery.addFilterQuery("fq","sName:"+messagesolr.getSeller());
        filterQuery.addFilterQuery("fq","mPoints:"+messagesolr.getPoints());
        params.add(filterQuery);
        if(null != messagesolr.getPrice() && !"".equals(messagesolr.getPrice())){
            //0-99   500-*  对价格进行过滤
            String[] p = messagesolr.getPrice().split("-");
            solrQuery.set("fq", "mPrice:[" + p[0] + " TO " + p[1] + "]");
        }
        // 价格排序
        if ("1".equals(messagesolr.getSort())) {
            solrQuery.addSort("mPrice", SolrQuery.ORDER.desc);
        } else {
            solrQuery.addSort("mPrice", SolrQuery.ORDER.asc);
        }
        // 分页
        solrQuery.setStart(0);//第几行开始
        solrQuery.setRows(16);//一页显示多少行
        // 只查询指定域
        solrQuery.set("fl", "id,mName,mPicture,mParticulars,mPoints,mPrice,mCount,searchCategoryName,sName,sAddress,sPhone,sDescribe,sPicture");
        // 高亮
        // 打开开关
        solrQuery.setHighlight(true);
        // 指定高亮域
        solrQuery.addHighlightField("mName");
        solrQuery.addHighlightField("mPoints");
        solrQuery.addHighlightField("searchCategoryName");
        solrQuery.addHighlightField("sName");
        // 前缀
        solrQuery.setHighlightSimplePre("<span style='color:red'>");
        solrQuery.setHighlightSimplePost("</span>");
        // 执行查询
        QueryResponse response = client.query(solrQuery);
        // 文档结果集
        SolrDocumentList docs = response.getResults();
        Map<String, Map<String, List<String>>> highlighting = response.getHighlighting();
        List<Messagesolrpojo> messagesolrpojos = new ArrayList<Messagesolrpojo>();
        for (SolrDocument doc : docs) {
            Messagesolrpojo messagesolrpojo = new Messagesolrpojo();
            messagesolrpojo.setId((String) doc.get("id"));
            messagesolrpojo.setmName((String) doc.get("mPicture"));
            messagesolrpojo.setmParticulars((String) doc.get("mParticulars"));
            messagesolrpojo.setmParticulars((String) doc.get("mPrice"));
            messagesolrpojo.setmParticulars((String) doc.get("mCount"));
            messagesolrpojo.setmParticulars((String) doc.get("sPicture"));
            messagesolrpojo.setmParticulars((String) doc.get("sAddress"));
            messagesolrpojo.setmParticulars((String) doc.get("sPhone"));
            messagesolrpojo.setmParticulars((String) doc.get("sDescribe"));
//            productModel.setDescription((String) doc.get("product_description"));
//            productModel.setType((String) doc.get("product_type"));
            Map<String, List<String>> map = highlighting.get((String) doc.get("id"));
            List<String> list = map.get("mName");
            List<String> list1 = map.get("mPoints");
            List<String> list2 = map.get("searchCategoryName");
            List<String> list3 = map.get("sName");
            if (list != null){
                //如果能匹配上说明，名称中存在与用户高亮相关的内容，使用高亮
                messagesolrpojo.setmName(list.get(0));
            }else {
                //当与用户高亮的相关内容匹配不上，就不使用高亮，直接展示商品名称
                messagesolrpojo.setmName((String) doc.get("mName"));
            }
            if (list1 != null){
                messagesolrpojo.setmPoints(list1.get(0));
            }else {
                messagesolrpojo.setmPoints((String) doc.get("mPoints"));
            }
            if (list2 != null){
                messagesolrpojo.setSearchCategoryName(list2.get(0));
            }else {
                messagesolrpojo.setSearchCategoryName((String) doc.get("searchCategoryName"));
            }
            if (list3 != null){
                messagesolrpojo.setsName(list3.get(0));
            }else {
                messagesolrpojo.setsName((String) doc.get("sName"));
            }
            messagesolrpojos.add(messagesolrpojo);
        }
        return messagesolrpojos;
    }

    public List<Messagesolrpojo> searchProduct1(String mStatus) throws Exception {
        SolrQuery solrQuery = new SolrQuery();
        //设置关键字
        solrQuery.setQuery(mStatus);
        //设置默认搜索域
        solrQuery.set("df", "product_keyword");
        //设置过滤条件
        if(null != mStatus && !"".equals(mStatus)){
            solrQuery.set("fq", "mStatus:" + mStatus);
        }
        solrQuery.set("fl", "id,mStatus,mPrice,mPicture,mCount");
        // 执行查询
        QueryResponse response = client.query(solrQuery);
        // 文档结果集
        SolrDocumentList docs = response.getResults();
        List<Messagesolrpojo> messagesolrpojos = new ArrayList<Messagesolrpojo>();
        for (SolrDocument doc : docs) {
            Messagesolrpojo messagesolrpojo = new Messagesolrpojo();
            messagesolrpojo.setId((String) doc.get("id"));
            messagesolrpojo.setmPoints((String) doc.get("mPoints"));
            messagesolrpojo.setmPicture((String) doc.get("mPicture"));
            messagesolrpojo.setmPrice((String) doc.get("mPrice"));
            messagesolrpojo.setmStatus(Integer.parseInt((String) doc.get("mStatus")));
            messagesolrpojos.add(messagesolrpojo);
        }
        return messagesolrpojos;
    }
}
