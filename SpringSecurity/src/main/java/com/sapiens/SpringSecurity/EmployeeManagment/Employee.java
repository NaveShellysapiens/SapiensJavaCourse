package com.sapiens.SpringSecurity.EmployeeManagment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
    private Long id;
    private String FirstName;
    private String LastName;
    private String Desig;
    private String Dept;
    private String DOB;
    private int YOE;
    private long Salary;

    public Employee() {
    }

    public Employee(Long id, String firstName, String lastName, String DOB, String desig, String dept, String DOB1, int YOE, long salary) {
        super();
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
        this.DOB = DOB;
        Desig = desig;
        Dept = dept;
        this.DOB = DOB1;
        this.YOE = YOE;
        Salary = salary;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public int getYOE() {
        return YOE;
    }

    public void setYOE(int YOE) {
        this.YOE = YOE;
    }

    public long getSalary() {
        return Salary;
    }

    public void setSalary(long salary) {
        Salary = salary;
    }

    public String getDesig() {
        return Desig;
    }

    public void setDesig(String desig) {
        Desig = desig;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", DOB='" + DOB + '\'' +
                ", Desig='" + Desig + '\'' +
                ", Dept='" + Dept + '\'' +
                ", DOB='" + DOB + '\'' +
                ", YOE=" + YOE +
                ", Salary=" + Salary +
                '}';
    }
}
