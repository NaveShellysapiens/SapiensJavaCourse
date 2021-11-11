package com.sapiens.springmvc.StudentManagment.models;

import javax.persistence.*;

@Entity
@Table(name = "Student")
public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int Grade;
    private String City;
    private int percentage;
    private String gender;
    private int age;

    public Student() {
    }

    public Student(int id, String firstName, String lastName, int grade, String city, int percentage, String gender, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        Grade = grade;
        City = city;
        this.percentage = percentage;
        this.gender = gender;
        this.age = age;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "firstName")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "lastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Column(name = "Grade")
    public int getGrade() {
        return Grade;
    }

    public void setGrade(int grade) {
        Grade = grade;
    }
    @Column(name = "City")
    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
    @Column(name = "percentage")
    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
    @Column(name = "gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    @Column(name = "age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Grade=" + Grade +
                ", City='" + City + '\'' +
                ", percentage=" + percentage +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
