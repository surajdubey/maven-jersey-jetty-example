package com.example.resources;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.annotation.PostConstruct;
import javax.ws.rs.Path;
import java.util.HashSet;
import java.util.Set;


public class ExampleApplication extends ResourceConfig {

    @Autowired
    ApplicationContext context;

    @Autowired
    ObjectMapper objectMapper;

    @PostConstruct
    public void init() {
        System.out.println("Called on ExampleApplication PostConstruct");
        System.out.println("Applicationcontext is  " + context);
        System.out.println("ObjectMapper is " + objectMapper);

        Set<Object> beanBag = new HashSet<>();

        // remove all @Path annotations once from here, otherwise they conflict

        /**
         * context.getBeansWithAnnotation(Path.class) return Map<String, Object>
         * context.getBeansWithAnnotation(Path.class).values() returns List<Object>
         * This is why it is added here
         *
         * If we want to add resources directly, it needs to be added to HashSet
         */
//        beanBag.addAll(context.getBeansWithAnnotation(Path.class).values());

        System.out.println(beanBag);
        beanBag.forEach(this::register);

        Set<Class<?>> resources = new HashSet<>();
        resources.add(io.swagger.jaxrs.listing.ApiListingResource.class);
        resources.add(io.swagger.jaxrs.listing.SwaggerSerializers.class);

        /**
         * Add Resource here if we want to add resource directly
         */
        resources.add(UserResource.class);
        resources.add(UniversityResource.class);

        System.out.println(resources);

        resources.forEach(this::register);
        System.out.println(context);
        System.out.println(objectMapper);
    }
}
