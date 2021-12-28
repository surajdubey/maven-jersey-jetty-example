package com.example.api;

import com.example.model.GetUniversityDetailResponse;
import com.example.model.GetUserDetailsResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/university")
@Api(value = "University Api")
public interface UniversityApi {
    @GET
    @Path("/")
    @ApiOperation(value = "Get university details")
    @Produces(MediaType.APPLICATION_JSON)
    GetUniversityDetailResponse getUniversity();
}
