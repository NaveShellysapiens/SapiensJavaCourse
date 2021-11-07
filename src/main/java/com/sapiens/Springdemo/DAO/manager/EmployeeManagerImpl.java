package com.sapiens.Springdemo.DAO.manager;

import com.sapiens.Springdemo.DAO.manager.EmployeeManager;
import com.sapiens.Springdemo.DAO.model.EmployeeDTO;
import com.sapiens.Springdemo.DAO.dao.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeManager")
public class EmployeeManagerImpl implements EmployeeManager {
    @Autowired
    EmployeeDAO dao;
    @Override
    public EmployeeDTO createNewEmployee() {
        return dao.createNewEmployee();
    }
}

