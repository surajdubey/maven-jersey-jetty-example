package com.example;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/user")
@Api(value = "User Api")
//@Consumes(MediaType.APPLICATION_JSON)
//@Produces(MediaType.APPLICATION_JSON)
public class TestService {

    @GET
    @Path("/")
    @ApiOperation(value = "Get user details")
    @Produces(MediaType.TEXT_PLAIN)
    public String getUser() {
        return "You have reached the endpoint";
    }
}
