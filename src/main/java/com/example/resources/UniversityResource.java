package com.example.resources;

import com.example.api.UniversityApi;
import com.example.model.GetUniversityDetailResponse;
import org.springframework.stereotype.Controller;

@Controller
public class UniversityResource implements UniversityApi {
    @Override
    public GetUniversityDetailResponse getUniversity() {
        return new GetUniversityDetailResponse("Hello");
    }
}
