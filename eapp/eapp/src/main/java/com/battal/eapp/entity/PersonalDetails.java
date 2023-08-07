package com.battal.eapp.entity;

import lombok.Data;

@Data
public class PersonalDetails {

    private String firstName;
    private String imageData;
    private String lastName;
    private String issueDate;
    private String issueOffice;
    private String placeOfBirth;
    private String dateOfBirth;
    private boolean smoker;
    private String gender;
    private String nationality;
    private boolean isCitizenOfUSA;
    private Identification identification;
}
