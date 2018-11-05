package cn.axy.xc.xcshoppingprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class XcShoppingProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(XcShoppingProviderApplication.class, args);
    }
}
