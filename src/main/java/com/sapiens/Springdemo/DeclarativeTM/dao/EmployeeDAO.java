package com.sapiens.Springdemo.DeclarativeTM.dao;

import com.sapiens.Springdemo.DeclarativeTM.model.Employee;

public interface EmployeeDAO {
    public Employee findEmployee(int empId);
    public void insertEmployee(Employee emp);
}
