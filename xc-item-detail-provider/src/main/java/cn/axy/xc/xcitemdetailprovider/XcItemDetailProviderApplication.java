package cn.axy.xc.xcitemdetailprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableDiscoveryClient
@EnableTransactionManagement
@MapperScan("cn.axy.xc.xcitemdetailprovider.dao")
public class  XcItemDetailProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(XcItemDetailProviderApplication.class, args);
    }
}
