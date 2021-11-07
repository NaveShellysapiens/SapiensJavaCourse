package com.sapiens.Springdemo.DAO.Controller;

import com.sapiens.Springdemo.DAO.manager.EmployeeManager;
import com.sapiens.Springdemo.DAO.model.EmployeeDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("employeeController")
public class EmployeeController {
    @Autowired
    EmployeeManager manager;

    public EmployeeDTO createNewEmployee(){
        return manager.createNewEmployee();
    }
}
