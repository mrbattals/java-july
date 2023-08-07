package com.battal.eapp.service;

import com.battal.eapp.entity.Application;
import com.battal.eapp.entity.PersonalDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ApplicationService {
    @Autowired
    FetchedProspectService fetchedProspectService;
    Application application = new Application();
    public Application getApplication(){
        application.setProposalNumber("60000001H7A0V1D");
        application.setFetchedProspect(fetchedProspectService.getFetchedProspect());
        application.setSelectedProduct(Arrays.asList("EducationProtectionPlan" ," LifeCare"));
        application.setModalPremium(Arrays.asList(" 41,325", "892"));
        return application;
    }
}
