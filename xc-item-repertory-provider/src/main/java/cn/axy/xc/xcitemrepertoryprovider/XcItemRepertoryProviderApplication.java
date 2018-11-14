package cn.axy.xc.xcitemrepertoryprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class XcItemRepertoryProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(XcItemRepertoryProviderApplication.class, args);
    }
}
