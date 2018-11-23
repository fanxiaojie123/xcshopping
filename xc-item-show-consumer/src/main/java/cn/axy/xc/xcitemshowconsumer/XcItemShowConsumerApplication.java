package cn.axy.xc.xcitemshowconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.solr.SolrAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(exclude = SolrAutoConfiguration.class)
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrixDashboard
@EnableCircuitBreaker
@EnableScheduling//boot开启定时任务注解
public class XcItemShowConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(XcItemShowConsumerApplication.class, args);
    }
}
