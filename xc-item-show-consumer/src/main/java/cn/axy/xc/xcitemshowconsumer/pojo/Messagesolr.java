package cn.axy.xc.xcitemshowconsumer.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Messagesolr",description = "搜索商品实体类")
public class Messagesolr {
    @ApiModelProperty(value = "商品名称",dataType = "String")
    private String catalog_name; //商品名称
    @ApiModelProperty(value = "价格",dataType = "String")
    private String price;  //价格
    @ApiModelProperty(value = "排序类型",dataType = "String")
    private String sort;  //排序类型
    @ApiModelProperty(value = "关键字",dataType = "String")
    private String queryString;  //关键字
    @ApiModelProperty(value = "商品类型",dataType = "String")
    private String type; //商品类型
    @ApiModelProperty(value = "商家",dataType = "String")
    private String seller; //商家
    @ApiModelProperty(value = "买点",dataType = "String")
    private String points; //买点


    public String getCatalog_name() {
        return catalog_name;
    }

    public void setCatalog_name(String catalog_name) {
        this.catalog_name = catalog_name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }
}
