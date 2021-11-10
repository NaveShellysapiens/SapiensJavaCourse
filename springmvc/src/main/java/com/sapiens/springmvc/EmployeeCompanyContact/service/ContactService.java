package com.sapiens.springmvc.EmployeeCompanyContact.service;

import com.sapiens.springmvc.EmployeeCompanyContact.models.Contact;

import java.util.List;

public interface ContactService {
    List<Contact> findAll();
}
