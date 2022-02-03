package com.example.resources;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import java.io.IOException;

public class ServerResponseLoggingFilter implements ContainerResponseFilter {
    @Override
    public void filter(ContainerRequestContext containerRequestContext, ContainerResponseContext containerResponseContext) throws IOException {
        String newLine = System.lineSeparator();
        StringBuilder b = new StringBuilder();
        b.append(newLine);
        b.append("Inside ServerResponseLoggingFilter");
        b.append("ContainerRequestContext is ");
        b.append(containerRequestContext.getHeaders()).append(System.lineSeparator());
        b.append(containerRequestContext.getUriInfo()).append(newLine);

        b.append("ContainerResponseContext is")
                .append(containerResponseContext)
                .append(containerResponseContext.getHeaders())
                .append(newLine)
                .append(containerRequestContext.getUriInfo().getRequestUri().toASCIIString())
                .append(newLine)
                .append(containerResponseContext.getEntity());

        System.out.println(b);
    }
}
