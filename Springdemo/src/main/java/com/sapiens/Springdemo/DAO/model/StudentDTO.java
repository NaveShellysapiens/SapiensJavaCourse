package com.sapiens.Springdemo.DAO.model;

import org.springframework.stereotype.Component;

@Component
public class StudentDTO {


    private Integer rollno;
    private String name;
    private String grade;
    private String percentage;

    @Override
    public String toString() {
        return "StudentDTO{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", percentage='" + percentage + '\'' +
                '}';
    }

    public void setRollno(Integer rollno) {
        this.rollno = rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    public Integer getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public String getPercentage() {
        return percentage;
    }
}
