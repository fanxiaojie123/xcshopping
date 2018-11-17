package cn.axy.xc.xcitemshowprovider.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Skusolr",description = "商品查询实体类")
public class Skusolr {
    @ApiModelProperty(value = "商品ID",dataType = "Integer")
    private String skuid;

    public String getSkuid() {
        return skuid;
    }

    public void setSkuid(String skuid) {
        this.skuid = skuid;
    }
}
