package com.sapiens.Springdemo.ioc;

public class Address {
    String city;
    String state;
    String country;
    String pincode;
    String PO_BOX_NUMBER;


    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public void setPO_BOX_NUMBER(String PO_BOX_NUMBER) {
        this.PO_BOX_NUMBER = PO_BOX_NUMBER;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getPincode() {
        return pincode;
    }

    public String getPO_BOX_NUMBER() {
        return PO_BOX_NUMBER;
    }
}
