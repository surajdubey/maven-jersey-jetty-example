package com.example.config;

import com.example.api.UserApi;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.jaxrs.config.BeanConfig;
import org.glassfish.jersey.client.proxy.WebResourceFactory;
import org.springframework.context.annotation.*;

import javax.annotation.PostConstruct;

@Configuration
@ComponentScan({
        "com.example.api",
        "com.example.config",
        "com.example.model",
        "com.example.resources"
})
@Import({
        TimingAspect.class
})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ServiceConfig {
    @Bean
    public ObjectMapper objectMapper() {
        System.out.println("objectMapper() is called");
        return new ObjectMapper();
    }

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

    @Bean
    public UserApi userApi() {
        ApacheRestClient restClient = new ApacheRestClient();

        /**
         * Each interface definition has URLs starting with '/' so URL ending with '/' is not needed here
         */
        UserApi userApi = WebResourceFactory.newResource(UserApi.class, restClient.getClient().target("http://localhost:3000/api"));
        return userApi;
    }
}
