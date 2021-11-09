package com.sapiens.Springdemo.daoSupport.Employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    int Id;
    String Name;
    int age;
    String desig;
    int salary;

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", age=" + age +
                ", desig='" + desig + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public static Employee create(String Name, int age, String desig,int salary) {
        Employee emp = new Employee();
        emp.setName(Name);
        emp.setAge(age);
        emp.setDesig(desig);
        emp.setSalary(salary);
        return emp;
    }
}
