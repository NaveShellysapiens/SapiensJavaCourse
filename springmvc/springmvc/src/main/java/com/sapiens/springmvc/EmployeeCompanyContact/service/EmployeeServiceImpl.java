package com.sapiens.springmvc.EmployeeCompanyContact.service;

import com.sapiens.springmvc.EmployeeCompanyContact.models.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Override
    public List<Employee> findAll() {
        ArrayList<Employee> emp = new ArrayList<Employee>();
        emp.add(new Employee(1,"name1",23,"des1","qual1"));
        emp.add(new Employee(1,"name2",23,"des2","qual2"));
        emp.add(new Employee(1,"name3",23,"des3","qual3"));
        emp.add(new Employee(1,"name4",23,"des4","qual4"));
        emp.add(new Employee(1,"name5",23,"des5","qual5"));

        return emp;
    }
}
