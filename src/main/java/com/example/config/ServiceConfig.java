package com.example.config;

import io.swagger.jaxrs.config.BeanConfig;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class ServiceConfig {
    @PostConstruct
    public void beanConfig() {
        System.out.println("postConstruct on serviceconfig");

        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.2");
        beanConfig.setSchemes(new String[]{"http"});
        beanConfig.setHost("localhost:3000");
        beanConfig.setBasePath("/api");
        beanConfig.setResourcePackage("com.example");
        beanConfig.setScan(true);
    }
}
