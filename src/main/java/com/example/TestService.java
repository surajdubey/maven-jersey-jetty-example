package com.example;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/user")
//@Consumes(MediaType.APPLICATION_JSON)
//@Produces(MediaType.APPLICATION_JSON)
public class TestService {

    @GET
    @Path("/")
    @Produces(MediaType.TEXT_PLAIN)
    public String getUser() {
        return "You have reached the endpoint";
    }
}
