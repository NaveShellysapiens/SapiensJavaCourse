package com.sapiens.Springdemo.daoSupport.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class EmployeeClientBean {
    @Autowired
    EmployeeService employeeService;
    public void run() {
        System.out.println("Persisting Employee");

        Employee emp = Employee.create("emp1",23,"desig1",14212);
        employeeService.saveEmployee(emp);
        emp = Employee.create("emp2",24,"desig2",1412);
        employeeService.saveEmployee(emp);
        List<Employee> allEmployee = employeeService.getAllEmployee();
        System.out.println("Employee Loaded: " + allEmployee);
        emp = employeeService.getEmployeeById(1);
        System.out.println("Employee Loaded by id: " + emp);
        System.out.println("Update the employee with id 2 ");
        emp.setSalary(123213);
        employeeService.updateEmployee(emp);
        System.out.println("Deleting the Employee");
        employeeService.deleteEmployee(2);
        allEmployee = employeeService.getAllEmployee();
        System.out.println("Employees Loaded: " + allEmployee);
    }
}
