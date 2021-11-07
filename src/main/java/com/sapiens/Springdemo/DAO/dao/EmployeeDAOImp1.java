package com.sapiens.Springdemo.DAO.dao;

import com.sapiens.Springdemo.DAO.model.EmployeeDTO;
import org.springframework.stereotype.Repository;

@Repository("employeeDao")
public class EmployeeDAOImp1 implements EmployeeDAO {
    @Override
    public EmployeeDTO createNewEmployee() {
        EmployeeDTO e = new EmployeeDTO();
        e.setId(101);
        e.setName("Scooby");
        e.setAge("30");
        e.setGender("Male");
        e.setDesignation("BLABLA");
        e.setQualification("BLABLA1");
        return  e;
    }
}

