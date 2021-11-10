package com.sapiens.Springdemo.daoSupport.Insurance;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @Column(name = "address_id")
    int address_id;
    String address;
    int contcat_no;
    String Email_ID;
    String Country;

    @Override
    public String toString() {
        return "Address{" +
                "address_id=" + address_id +
                ", address='" + address + '\'' +
                ", contcat_no=" + contcat_no +
                ", Email_ID='" + Email_ID + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContcat_no() {
        return contcat_no;
    }

    public void setContcat_no(int contcat_no) {
        this.contcat_no = contcat_no;
    }

    public String getEmail_ID() {
        return Email_ID;
    }

    public void setEmail_ID(String email_ID) {
        Email_ID = email_ID;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }
}
