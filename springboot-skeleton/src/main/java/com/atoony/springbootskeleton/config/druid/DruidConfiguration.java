package com.atoony.springbootskeleton.config.druid;


import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


/**
 * @author Atoony
 */
@Configuration
public class DruidConfiguration {

    @ConfigurationProperties(prefix = "spring.datasource.druid")
    @Bean
    public DataSource dataSource(){
        return DruidDataSourceBuilder.create().build();
    }
}