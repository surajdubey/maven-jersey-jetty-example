package com.example.config;

import com.example.resources.ServerRequestLoggingFilter;
import com.example.resources.ServerResponseLoggingFilter;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.config.RequestConfig;
import org.glassfish.jersey.jackson.JacksonFeature;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public class ApacheRestClient {
    public Client getClient() {
        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectionRequestTimeout(10_000)
                .setSocketTimeout(10_000)
                .build();

        ClientBuilder builder = ClientBuilder.newBuilder()
                .register(JacksonFeature.class)
                .register(ServerResponseLoggingFilter.class)
                .register(ServerRequestLoggingFilter.class);

//        return builder.build();

        return ClientBuilder.newClient();

    }
}
