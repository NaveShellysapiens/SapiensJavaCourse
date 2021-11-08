package com.sapiens.Springdemo.DeclarativeTM.service;


import com.sapiens.Springdemo.DeclarativeTM.model.Employee;

public interface EmployeeService {
    public Employee getEmployee(int empId);

    public void addEmployee(Employee emp);
}