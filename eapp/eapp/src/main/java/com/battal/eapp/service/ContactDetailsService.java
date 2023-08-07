package com.battal.eapp.service;

import com.battal.eapp.entity.ContactDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactDetailsService {

    @Autowired
            AddressService addressService;
    @Autowired
            ContactService contactService;
    @Autowired
             TemporaryAddressService temporaryAddressService;

    ContactDetails contactDetails = new ContactDetails();

    public ContactDetails getContactDetails() {
        contactDetails.setAddress(addressService.getAddress());
        contactDetails.setContact(contactService.getContact());
        contactDetails.setTemporary(temporaryAddressService.getTemporaryAddress());
        return contactDetails;
    }
}
