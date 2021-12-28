package com.example.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Aspect
@Component
public class TimingAspect {
/*    private final ApplicationContext context;

    @Autowired
    public TimingAspect(ApplicationContext context) {
        this.context = context;
        System.out.println("ApplicationContext is " + context);
    }*/

    @Autowired
    ApplicationContext context;

    @Autowired
    ObjectMapper objectMapper;

    @PostConstruct
    public void init() {
//        this.context = context;
        System.out.println("ApplicationContext is " + context);
    }
}
