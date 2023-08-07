package com.battal.eapp.service;

import com.battal.eapp.entity.FetchedProspect;
import com.battal.eapp.entity.Identification;
import com.battal.eapp.entity.PersonalDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalDetailsService {
    @Autowired
    IdentificationService identificationService;

    PersonalDetails personalDetails = new PersonalDetails();


    public PersonalDetails getPersonalDetails() {
        personalDetails.setFirstName("");
        personalDetails.setImageData("images\\\\/prospect\\\\/defaultprofilepic.svg");
        personalDetails.setGender("Male");
        personalDetails.setSmoker(false);
        personalDetails.setIdentification(identificationService.getIdentification());
        return personalDetails;
    }
}
