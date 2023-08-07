package com.battal.eapp.service;

import com.battal.eapp.entity.Identification;
import org.springframework.stereotype.Service;

@Service
public class IdentificationService {
    Identification identification = new Identification();

    public Identification getIdentification() {
        identification.setDocumentType("Citizenship");
        identification.setDocumentNumber("2020");
        return identification;
    }
}
