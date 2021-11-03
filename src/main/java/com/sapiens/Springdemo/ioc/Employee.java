package com.sapiens.Springdemo.ioc;

public class Employee {
    String ID;
    String Name;
    int Age;
    String Gender;

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        Age = age;
    }
    public void setGender(String gender) {
        Gender = gender;
    }
    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }
    public int getAge() {
        return Age;
    }

    public String getGender() {
        return Gender;
    }
}
