package com.sapiens.Springdemo.DeclarativeTM.config;

import com.sapiens.Springdemo.DeclarativeTM.model.PersonalInfo;
import com.sapiens.Springdemo.DeclarativeTM.model.EmployeeDetails;
import com.sapiens.Springdemo.DeclarativeTM.model.Employee;
import com.sapiens.Springdemo.DeclarativeTM.service.EmployeeService;
import com.sapiens.springDemo.DeclarativeTM.serviceImpl.EmployeeServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        EmployeeService employeeService = context.getBean("employeeServiceImpl", EmployeeServiceImpl.class);
        employeeService.addEmployee(createEmployee());
        employeeService.getEmployee(101);
        context.registerShutdownHook();
    }

    private static Employee createEmployee() {
        Employee employee = new Employee();
        PersonalInfo PI = new PersonalInfo();
        EmployeeDetails ED= new EmployeeDetails();

        employee.setId(101);
        employee.setName("Olive");
        employee.setAge(27);
        employee.setSalary(20123);
        PI.setId(employee.getId());
        PI.setEmail_ID("EMAIL@EMAIL.COM");
        PI.setContact(1);
        PI.setAddress("ABC Lane");
        ED.setId(employee.getId());
        ED.setDeptname("dept1");
        ED.setDesignation("des1");
        ED.setQualification("qual1");
        employee.setPI(PI);
        employee.setED(ED);
        return employee;
    }
}