package com.battal.eapp.entity;

import lombok.Data;

@Data
public class ContactDetails {
    private Address address;
    private Contact contact;
    private TemporaryAddress temporary;
}
