package com.battal.eapp.service;

import com.battal.eapp.entity.EmploymentDetails;
import com.battal.eapp.entity.FetchedProspect;
import com.battal.eapp.entity.PersonalDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FetchedProspectService {
    @Autowired
            PersonalDetailsService personalDetailsService;
    @Autowired
            ContactDetailsService contactDetailsService;
    @Autowired
            EmploymentService employmentService;
    FetchedProspect fetchedProspect = new FetchedProspect();

    public FetchedProspect getFetchedProspect() {
       fetchedProspect.setPersonalDetails(personalDetailsService.getPersonalDetails());
       fetchedProspect.setContactDetails(contactDetailsService.getContactDetails());
       fetchedProspect.setEmploymentDetails(employmentService.getEmployment());

        return fetchedProspect;


    }
}
