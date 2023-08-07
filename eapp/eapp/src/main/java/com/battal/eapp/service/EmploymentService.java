package com.battal.eapp.service;

import com.battal.eapp.entity.Address;
import com.battal.eapp.entity.EmploymentDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmploymentService {
    @Autowired
            AddressService addressService;
    EmploymentDetails employmentDetails = new EmploymentDetails();

    public EmploymentDetails getEmployment() {
        employmentDetails.setAddress(addressService.getAddress());
        return employmentDetails;
    }
}
