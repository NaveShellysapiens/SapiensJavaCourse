package com.sapiens.Springdemo.daoSupport.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
   @Autowired
   private Dao<Employee> dao;

    public void saveEmployee(Employee emp) {
        try {
            dao.save(emp);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }

    public List<Employee> getAllEmployee() {
        try {
            return dao.loadAll();
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Employee getEmployeeById(int id) {
        try {
            return dao.load(id);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void deleteEmployee(int id) {
        try {
            dao.delete(id);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }

    public void updateEmployee(Employee emp) {
        try {
            dao.update(emp);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }
}