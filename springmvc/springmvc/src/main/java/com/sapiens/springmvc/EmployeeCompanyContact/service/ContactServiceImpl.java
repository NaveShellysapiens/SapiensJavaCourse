package com.sapiens.springmvc.EmployeeCompanyContact.service;

import com.sapiens.springmvc.EmployeeCompanyContact.models.CompanyDetails;
import com.sapiens.springmvc.EmployeeCompanyContact.models.Contact;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ContactServiceImpl implements  ContactService{
    @Override
    public List<Contact> findAll() {
        ArrayList<Contact> con = new ArrayList<Contact>();
        con.add(new Contact("mob1","add1","email1","web1"));
        con.add(new Contact("mob2","add2","email2","web2"));
        con.add(new Contact("mob3","add3","email3","web3"));
        con.add(new Contact("mob4","add4","email4","web4"));
        con.add(new Contact("mob5","add5","email5","web5"));

        return con;
    }
}
