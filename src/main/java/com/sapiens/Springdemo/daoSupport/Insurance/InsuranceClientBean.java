package com.sapiens.Springdemo.daoSupport.Insurance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InsuranceClientBean {
    @Autowired
    InsuranceSerivce insuranceSerivcecont;
    InsuranceSerivceADD insuranceSerivceADD;
    InsuranceSerivceID insuranceSerivceID;

    public void run() {
        System.out.println("Persisting Contract");
        Address add = new Address();
        InsuranceDetails DID= new InsuranceDetails();
        add.setAddress_id(1);
        add.setCountry("Count1");
        add.setAddress("add1");
        add.setEmail_ID("email@email.com");
        add.setContcat_no(2);
        DID.setInsuranceType("Life");
        DID.setI_details_id(1);
        DID.setValid_till("20/12/2025");
        DID.setPremium_amount(540);
        Contact com = Contact.create(1,"ContF1","ContL1","01/01/1995","desig1",add,DID);
        insuranceSerivcecont.saveInsurance(com);
        insuranceSerivceADD.saveInsurance(add);
        insuranceSerivceID.saveInsurance(DID);
        Address add1 = new Address();
        InsuranceDetails DID1= new InsuranceDetails();
        add1.setAddress_id(2);
        add1.setCountry("Count2");
        add1.setAddress("add2");
        add1.setEmail_ID("email1@email.com");
        add1.setContcat_no(2);
        DID1.setInsuranceType("NON-Life");
        DID1.setI_details_id(2);
        DID1.setValid_till("20/12/2026");
        DID1.setPremium_amount(540);
        com = Contact.create(2,"ContF2","ContL2","02/01/1995","desig2",add1,DID1);
        insuranceSerivcecont.saveInsurance(com);
        insuranceSerivceADD.saveInsurance(add1);
        insuranceSerivceID.saveInsurance(DID1);
        List<Contact> allContact = insuranceSerivcecont.getAllContacts();
        System.out.println("Contracts Loaded: " + allContact);
        com = insuranceSerivcecont.getContactById(1);
        System.out.println("Contract Loaded by id: " + com);
        System.out.println("Update the com with id 2 ");
        com.setDOB("01/01/1992");
        insuranceSerivcecont.updateContact(com);
        System.out.println("Deleting the Contract");
        insuranceSerivcecont.deleteContact(2);
        allContact = insuranceSerivcecont.getAllContacts();
        System.out.println("Contacts Loaded: " + allContact);
    }
}
