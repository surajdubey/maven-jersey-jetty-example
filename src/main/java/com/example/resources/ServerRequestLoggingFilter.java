package com.example.resources;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import java.io.IOException;

public class ServerRequestLoggingFilter implements ContainerRequestFilter {
    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        System.out.println("Inside ServerRequestLoggingFilter");
        System.out.println(Thread.currentThread());
        System.out.println(containerRequestContext.getUriInfo().getRequestUri().toASCIIString());
        System.out.println(containerRequestContext.getMethod());
        System.out.println(containerRequestContext.getHeaders());
    }
}
