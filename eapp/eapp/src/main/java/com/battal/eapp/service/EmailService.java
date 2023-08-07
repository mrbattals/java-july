package com.battal.eapp.service;

import com.battal.eapp.entity.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

 Email email = new Email();

    public Email getEmail() {
       email.setPersonal("");
        return email;
    }
}
