package com.sapiens.springmvc.EmployeeCompanyContact.service;

import com.sapiens.springmvc.EmployeeCompanyContact.models.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}
