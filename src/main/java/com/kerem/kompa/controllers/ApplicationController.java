package com.kerem.kompa.controllers;

import com.kerem.kompa.entities.Application;
import com.kerem.kompa.services.ApplicationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ApplicationController {

    private final ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping("applications")
    public String listAllApplications(Model model) {
        List<Application> listAllApplications = applicationService.allApplications();
        listAllApplications.add(new Application("Kerem Tazedal", "Pending"));
        model.addAttribute("listAllApplications", listAllApplications);
        return "application";
    }
}
