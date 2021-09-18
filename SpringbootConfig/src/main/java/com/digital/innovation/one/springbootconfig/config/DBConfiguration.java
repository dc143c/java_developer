package com.digital.innovation.one.springbootconfig.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
@Getter
@Setter

public class DBConfiguration {

    private String driveClassName;
    private String url;
    private String username;
    private String password;

    @Profile("dev")
    @Bean
    public String testDBConnection(){
        System.out.println("DB Connection for DEV-H2");
        System.out.println(driveClassName);
        System.out.println(url);
        return "DB Connection to H2_TEST - Test instance";
    }

    @Profile("prod")
    @Bean
    public String prodDBConnection(){
        System.out.println("DB Connection for PRODUCTION-MYSQL");
        System.out.println(driveClassName);
        System.out.println(url);
        return "DB Connection to MYSQL_PROD - Test instance";
    }

}
