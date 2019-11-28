package com.yqn.zuul.config;

import com.yqn.zuul.filter.MyFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName ZuulConfig
 * Description TODO
 * Date 2019/11/21 9:50
 * Author   likangli
 */
@Configuration
public class ZuulConfig {

    @Bean
    public MyFilter getMyFilter(){

        return new MyFilter();
    }
}
