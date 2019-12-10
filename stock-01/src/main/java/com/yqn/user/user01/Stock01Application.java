package com.yqn.user.user01;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableDistributedTransaction
@EnableEurekaClient
@SpringBootApplication
public class Stock01Application {

    public static void main(String[] args) {
        SpringApplication.run(Stock01Application.class, args);
    }

}
