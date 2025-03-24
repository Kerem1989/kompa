package com.kerem.kompa.controllers;

import com.kerem.kompa.entities.Application;
import com.kerem.kompa.services.ApplicationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/api")
public class RestApplicationController {
    private ApplicationService applicationService;

    public RestApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping("/allApplications")
    public List <Application> returnAllApplications() {
        return applicationService.allApplications();
    }
}


