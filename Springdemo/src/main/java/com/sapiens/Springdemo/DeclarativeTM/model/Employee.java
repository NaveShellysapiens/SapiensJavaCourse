package com.sapiens.Springdemo.DeclarativeTM.model;

public class Employee {
    int id;
    String name;
    int age;
    int salary;
    PersonalInfo PI;
    EmployeeDetails ED;

    public int getId() {
        return id;
    }

    public PersonalInfo getPI() {
        return PI;
    }

    public void setPI(PersonalInfo PI) {
        this.PI=new PersonalInfo();
        this.PI.setId(this.id);
        this.PI.setContact(PI.getContact());
        this.PI.setEmail_ID(PI.getEmail_ID());
        this.PI.setAddress(PI.getAddress());
    }

    public EmployeeDetails getED() {
        return ED;
    }

    public void setED(EmployeeDetails ED) {
        this.ED=new EmployeeDetails();
        this.ED.setId(this.id);
        this.ED.setDeptname(ED.getDeptname());
        this.ED.setDesignation(ED.getDesignation());
        this.ED.setQualification(ED.getQualification());
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
