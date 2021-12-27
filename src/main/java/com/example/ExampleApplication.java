package com.example;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

public class ExampleApplication extends ResourceConfig {

    @Autowired
    private ApplicationContext context;

    public ExampleApplication() {

    }

    @PostConstruct
    public void init() {
        System.out.println("Called on PostConstruct");
        Set<Class<?>> resources = new HashSet<>();

        resources.add(TestService.class);

//        resources.add(UserApi.class);
        resources.add(io.swagger.jaxrs.listing.ApiListingResource.class);
        resources.add(io.swagger.jaxrs.listing.SwaggerSerializers.class);

        resources.forEach(this::register);
        System.out.println(context);
    }
}
