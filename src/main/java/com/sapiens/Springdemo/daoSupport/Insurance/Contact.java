package com.sapiens.Springdemo.daoSupport.Insurance;

import com.sapiens.Springdemo.daoSupport.Employee.Employee;

import javax.persistence.*;

@Entity
@Table(name = "Contact")
public class Contact {
    @Id
    @Column(name = "id")
    int id;
    String firstName;
    String lastName;
    String DOB;
    String design;
    @OneToOne(targetEntity=Address.class,cascade = {CascadeType.ALL})
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    Address address;
    @OneToOne(targetEntity=InsuranceDetails.class,cascade = {CascadeType.ALL})
    @JoinColumn(name = "i_details_id", referencedColumnName = "i_details_id")
    InsuranceDetails IDetails;

    @Override
    public String toString() {
        return "Contract{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", DOB='" + DOB + '\'' +
                ", design='" + design + '\'' +
             //   ", address=" + address +
               // ", IDetails=" + IDetails +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public InsuranceDetails getIDetails() {
        return IDetails;
    }

    public void setIDetails(InsuranceDetails IDetails) {
        this.IDetails = IDetails;
    }
    public static Contact create(int id ,String FName,String Lname,String DOB,String desig,Address add,InsuranceDetails ind) {
        Contact con = new Contact();
        con.setId(id);
        con.setFirstName(FName);
        con.setLastName(Lname);
        con.setDOB(DOB);
        con.setDesign(desig);
        con.setAddress(add);
        con.setIDetails(ind);
        return con;
    }
}
