package com.sapiens.Springdemo.DAO.dao;


import com.sapiens.Springdemo.DAO.model.StudentDTO;
import org.springframework.stereotype.Repository;

@Repository("studentDao")
public class StudentDAOImp1 implements StudentDAO {
    @Override
    public StudentDTO createNewStudent() {
        StudentDTO s = new StudentDTO();
        s.setRollno(101);
        s.setName("Scooby");
        s.setGrade("30");
        s.setPercentage("100");

        return  s;
    }
}
