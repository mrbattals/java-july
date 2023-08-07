package com.battal.eapp.entity;

import lombok.Data;

@Data
public class FetchedProspect {

    private PersonalDetails personalDetails;
    private ContactDetails contactDetails;
    private EmploymentDetails employmentDetails;

}
