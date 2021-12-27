package com.example.api;

import com.example.model.GetUserDetailsResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/user")
@Api(value = "User Api")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface UserApi {
    @GET
    @Path("/")
    @ApiOperation(value = "Get user details")
    @Produces(MediaType.APPLICATION_JSON)
    GetUserDetailsResponse getUser();
}
