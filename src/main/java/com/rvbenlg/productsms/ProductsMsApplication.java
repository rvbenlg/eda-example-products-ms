package com.rvbenlg.productsms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ProductsMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductsMsApplication.class, args);
    }

}
