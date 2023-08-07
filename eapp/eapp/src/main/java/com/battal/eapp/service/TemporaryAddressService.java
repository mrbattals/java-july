package com.battal.eapp.service;

import com.battal.eapp.entity.TemporaryAddress;
import org.springframework.stereotype.Service;

@Service
public class TemporaryAddressService {
    TemporaryAddress temporaryAddress = new TemporaryAddress();

    public TemporaryAddress getTemporaryAddress() {
        temporaryAddress.setCountryTemp("32");
        temporaryAddress.setHouseNoTemp("12");
        temporaryAddress.setVillageToleTemp("22");
        temporaryAddress.setWardNoTemp("23");
        return temporaryAddress;
    }
}
