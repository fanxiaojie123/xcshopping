package cn.axy.xc.xcitemshowprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.solr.SolrAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(exclude = SolrAutoConfiguration.class)
@EnableDiscoveryClient
@MapperScan("cn.axy.xc.xcitemshowprovider.dao")
@EnableScheduling//boot开启定时任务注解
public class XcItemShowProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(XcItemShowProviderApplication.class, args);
    }
}
