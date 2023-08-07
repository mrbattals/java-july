package com.battal.eapp.service;

import com.battal.eapp.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    @Autowired
            EmailService emailService;
    @Autowired
            PhoneService phoneService;
    Contact contact = new Contact();

    public Contact getContact() {
        contact.setEmail(emailService.getEmail());
        contact.setPhone(phoneService.getPhone());
        return contact;
    }
}
