package com.yqn.user.user01;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableHystrix
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
//@EnableDistributedTransaction
public class Order01Application {

    public static void main(String[] args) {
        SpringApplication.run(Order01Application.class, args);
    }

}
