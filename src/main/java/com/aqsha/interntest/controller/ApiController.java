package com.aqsha.interntest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aqsha.interntest.dto.ViewResponseDTO;
import com.aqsha.interntest.service.ApiService;

@RestController
public class ApiController {

    private final ApiService apiService;

    public ApiController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping("/api/viewData")
    public ViewResponseDTO viewData() {
        return apiService.getViewData();
    }
}
