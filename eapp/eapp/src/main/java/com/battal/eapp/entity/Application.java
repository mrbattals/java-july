package com.battal.eapp.entity;

import lombok.Data;

import java.util.List;

@Data
public class Application {

    private String proposalNumber;
    private FetchedProspect fetchedProspect;
    private List<String> selectedProduct;
    private List<String> modalPremium;

}
