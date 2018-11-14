package cn.axy.xc.xcitemshowprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class XcItemShowProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(XcItemShowProviderApplication.class, args);
    }
}
