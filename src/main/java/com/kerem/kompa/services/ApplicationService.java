package com.kerem.kompa.services;

import com.kerem.kompa.entities.Application;
import com.kerem.kompa.repositories.ApplicationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {
    private final ApplicationRepo applicationRepo;

    @Autowired
    public ApplicationService (ApplicationRepo applicationRepo) {
        this.applicationRepo = applicationRepo;
    }

    public List<Application> allApplications() {
        return applicationRepo.findAll();
    }


}
