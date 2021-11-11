package com.sapiens.Springdemo.ProgramaticTM;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;

public class Utility {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Springdemo\\src\\main\\resources\\Beans.xml");
        EmployeeDAO employeeDAO = context.getBean("EmployeeDAOBean", EmployeeDAO.class);

        //Q1
        System.out.println("Create a table");
        employeeDAO.createTable();

        //Q2

        System.out.println("Adding Data to Table");
        employeeDAO.addEmployee(1, "Emp1", 25, "A",123123,1);
        employeeDAO.addEmployee(2, "Emp2", 26, "B",141233,2);
        employeeDAO.addEmployee(3, "Emp3", 27, "C",2325,3);
        employeeDAO.addEmployee(4, "Emp4", 24, "D",15235,4);
        employeeDAO.addEmployee(5, "Emp5", 26, "E",34634,5);
        employeeDAO.addEmployee(6, "Emp6", 21, "F",3445,6);
        employeeDAO.addEmployee(7, "Emp7", 29, "G",15624,7);
        System.out.println("Extracting the data ");
        employeeDAO.DataExtracting();

        //Q3
        System.out.println("Update Salary");
        employeeDAO.updateSalary(3,20000);
        employeeDAO.updateSalary(7,7000);
        employeeDAO.DataExtracting();

        //Q4
        System.out.println("Update Age");
        employeeDAO.updateAge(2,32);
        employeeDAO.updateAge(5,64);
        employeeDAO.DataExtracting();

        //Q5
        System.out.println("Update Contact");
        employeeDAO.updateContact(4,33);
        employeeDAO.updateContact(7,24);
        employeeDAO.DataExtracting();

        //Q6 + Q7

        System.out.println("Count Before : ");
        employeeDAO.countEmployee();
        employeeDAO.deleteEmployee(1);
        System.out.println("Count After : ");
        employeeDAO.countEmployee();
        employeeDAO.DataExtracting();

        //Q8 DATAEXCTARCTING WORKS BEFORE AND AFTER EACH TRANSACTION.




    }
}
