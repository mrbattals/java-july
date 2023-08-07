package com.battal.eapp.service;

import com.battal.eapp.entity.Address;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    Address address = new Address();

    public Address getAddress() {
        address.setHouseNo("");
        address.setVillageTole("");
        address.setWardno("");
        address.setGaupalikaNagarpalika("");
        return address;
    }
}
