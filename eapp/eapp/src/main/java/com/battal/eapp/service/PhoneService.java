package com.battal.eapp.service;

import com.battal.eapp.entity.Phone;
import org.springframework.stereotype.Service;

@Service
public class PhoneService {
    Phone phone = new Phone();

    public Phone getPhone() {
        phone.setHome("+121212");
        phone.setWork("+122232322");
        phone.setMobile("+1");
        return phone;
    }
}
