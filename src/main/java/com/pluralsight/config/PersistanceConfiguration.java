package com.pluralsight.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistanceConfiguration {

    @Bean
    public DataSource dataSource(){
        DataSourceBuilder builder =  DataSourceBuilder.create();
        builder.url("jdbc:mysql://localhost:3306/conference_demo");
        System.out.println("Custom dataSource");
        return builder.build();


    }
}
