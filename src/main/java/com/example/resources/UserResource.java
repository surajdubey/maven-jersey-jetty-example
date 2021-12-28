package com.example.resources;

import com.example.api.UserApi;
import com.example.model.GetUserDetailsResponse;
import org.springframework.stereotype.Controller;

@Controller
public class UserResource implements UserApi {

    public GetUserDetailsResponse getUser() {
        return new GetUserDetailsResponse(1, "Suraj");
    }
}
