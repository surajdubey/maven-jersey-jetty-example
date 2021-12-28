package com.example.resources;

import com.example.api.UserApi;
import com.example.model.GetUserDetailsResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Controller
public class UserResource implements UserApi {

    public GetUserDetailsResponse getUser() {
        return new GetUserDetailsResponse(1, "Suraj");
    }
}
