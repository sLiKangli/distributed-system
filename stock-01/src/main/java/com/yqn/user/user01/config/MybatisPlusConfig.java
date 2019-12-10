package com.yqn.user.user01.config;

import com.baomidou.mybatisplus.entity.GlobalConfiguration;
import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.plugins.PerformanceInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
@MapperScan("com.yqn.user.user01.mapper")
public class MybatisPlusConfig {
  /**
   * mybatis-plus 分页插件
   */
  @Bean
  public PaginationInterceptor paginationInterceptor(){
      PaginationInterceptor page = new PaginationInterceptor();
      page.setDialectType("mysql");
      return page;
  }

  /**
   * 打印 sql
   */
  @Bean
  public PerformanceInterceptor performanceInterceptor() {
      PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
      //格式化sql语句
      Properties properties = new Properties();
      properties.setProperty("format", "true");
      performanceInterceptor.setProperties(properties);
      return performanceInterceptor;
  }
  
	@Bean(name = "globalConfig")
	public GlobalConfiguration globalConfig(){
	    GlobalConfiguration globalConfig = new GlobalConfiguration();
	         globalConfig.setFieldStrategy(2); //字段策略
	    return globalConfig;
	}

}
