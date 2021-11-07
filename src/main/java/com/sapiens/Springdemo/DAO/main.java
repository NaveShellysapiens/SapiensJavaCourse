package com.sapiens.Springdemo.DAO;

import com.sapiens.Springdemo.DAO.manager.EmployeeManagerImpl;
import com.sapiens.Springdemo.DAO.manager.StudentManagerImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        EmployeeManagerImpl employeeManager = context.getBean(EmployeeManagerImpl.class);
        StudentManagerImpl studentManager = context.getBean(StudentManagerImpl.class);
        System.out.println(employeeManager.createNewEmployee());
        System.out.println(studentManager.createNewStudent());
    }
}
